package in.Fastbite.helpdesk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.Fastbite.helpdesk.entity.HelpRequest;
import in.Fastbite.helpdesk.entity.User;
import in.Fastbite.helpdesk.repository.HelpRequestRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HelpRequestController {

    @Autowired
    private HelpRequestRepository helpRequestRepository;

    // 🔹 Show form to create new help request (USER must be logged in)
    @GetMapping("/new-request")
    public String showNewRequestForm(Model model, HttpSession session) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }

        model.addAttribute("helpRequest", new HelpRequest());
        return "new-request";
    }

    // 🔹 Save new help request (Phase 6: success message)
    @PostMapping("/save-request")
    public String saveRequest(@Valid @ModelAttribute("helpRequest") HelpRequest helpRequest,
                              BindingResult bindingResult,
                              HttpSession session,
                              RedirectAttributes redirectAttributes) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }

        if (bindingResult.hasErrors()) {
            // validation errors → go back to form
            return "new-request";
        }

        // link to user who created it
        helpRequest.setUser(current);
        helpRequest.setStatus("PENDING");
        // createdTime and default status also handled in @PrePersist
        helpRequestRepository.save(helpRequest);

        redirectAttributes.addFlashAttribute("message",
                "✅ Your help request has been submitted successfully.");

        return "redirect:/my-requests";
    }

    // 🔹 Phase 6: All Requests with filters (category + status)
    @GetMapping("/all-requests")
    public String showAllRequests(
            @RequestParam(name = "category", required = false) String category,
            @RequestParam(name = "status", required = false) String status,
            Model model) {

        if (category == null || category.equalsIgnoreCase("ALL")) {
            category = "ALL";
        }

        if (status == null || status.equalsIgnoreCase("ALL")) {
            status = "ALL";
        }

        List<HelpRequest> list;

        if (category.equals("ALL") && status.equals("ALL")) {
            list = helpRequestRepository.findAll();
        } else if (!category.equals("ALL") && status.equals("ALL")) {
            list = helpRequestRepository.findByCategory(category);
        } else if (category.equals("ALL") && !status.equals("ALL")) {
            list = helpRequestRepository.findByStatus(status);
        } else {
            list = helpRequestRepository.findByCategoryAndStatus(category, status);
        }

        model.addAttribute("requests", list);
        model.addAttribute("selectedCategory", category);
        model.addAttribute("selectedStatus", status);

        return "all-requests";
    }

    // 🔹 Public: simple page to show only PENDING (no volunteer assigned)
    @GetMapping("/pending-requests")
    public String showPendingRequestsPublic(Model model) {
        List<HelpRequest> list = helpRequestRepository
                .findByStatusAndAssignedVolunteerIsNull("PENDING");
        model.addAttribute("requests", list);
        return "all-requests"; // reuse same view if you want, or another view
    }

    // 🔹 My Requests (for normal USER)
    @GetMapping("/my-requests")
    public String showMyRequests(Model model, HttpSession session) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }

        List<HelpRequest> list = helpRequestRepository.findByUser(current);
        model.addAttribute("requests", list);

        return "my-requests";
    }

    // ========== VOLUNTEER FLOW ==========

    // show pending requests (PENDING & no volunteer) to volunteer
    @GetMapping("/volunteer/pending-requests")
    public String showVolunteerPendingRequests(Model model, HttpSession session) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }
        if (!"VOLUNTEER".equals(current.getRole())) {
            return "redirect:/access-denied";
        }

        List<HelpRequest> list =
                helpRequestRepository.findByStatusAndAssignedVolunteerIsNull("PENDING");

        model.addAttribute("requests", list);
        return "volunteer-pending-requests";
    }

    // volunteer accepts a request
    @GetMapping("/volunteer/accept")
    public String acceptRequest(@RequestParam("id") Long id,
                                HttpSession session,
                                RedirectAttributes redirectAttributes) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }
        if (!"VOLUNTEER".equals(current.getRole())) {
            return "redirect:/access-denied";
        }

        Optional<HelpRequest> optional = helpRequestRepository.findById(id);
        if (optional.isPresent()) {
            HelpRequest req = optional.get();
            if ("PENDING".equals(req.getStatus()) && req.getAssignedVolunteer() == null) {
                req.setAssignedVolunteer(current);
                req.setStatus("IN_PROGRESS");
                helpRequestRepository.save(req);

                redirectAttributes.addFlashAttribute("message",
                        "✅ Request " + req.getId() + " has been assigned to you.");
            }
        }

        return "redirect:/volunteer/pending-requests";
    }

    // volunteer sees their accepted requests
    @GetMapping("/volunteer/my-accepted-requests")
    public String showMyAcceptedRequests(Model model, HttpSession session) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }
        if (!"VOLUNTEER".equals(current.getRole())) {
            return "redirect:/access-denied";
        }

        List<HelpRequest> list = helpRequestRepository.findByAssignedVolunteer(current);
        model.addAttribute("requests", list);

        return "volunteer-my-accepted-requests";
    }

    // volunteer marks a request as completed
    @GetMapping("/volunteer/mark-completed")
    public String volunteerMarkCompleted(@RequestParam("id") Long id,
                                         HttpSession session,
                                         RedirectAttributes redirectAttributes) {

        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return "redirect:/login";
        }
        if (!"VOLUNTEER".equals(current.getRole())) {
            return "redirect:/access-denied";
        }

        Optional<HelpRequest> optional = helpRequestRepository.findById(id);
        if (optional.isPresent()) {
            HelpRequest req = optional.get();
            if (current.equals(req.getAssignedVolunteer())) {
                req.setStatus("COMPLETED");
                helpRequestRepository.save(req);

                redirectAttributes.addFlashAttribute("message",
                        "✅ Request " + req.getId() + " marked as completed.");
            }
        }

        return "redirect:/volunteer/my-accepted-requests";
    }
}
