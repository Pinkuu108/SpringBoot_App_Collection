package in.Fastbite.helpdesk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.Fastbite.helpdesk.entity.HelpRequest;
import in.Fastbite.helpdesk.entity.User;
import in.Fastbite.helpdesk.repository.HelpRequestRepository;
import in.Fastbite.helpdesk.repository.UserRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HelpRequestRepository helpRequestRepository;

    // helper to ensure admin
    private User requireAdmin(HttpSession session) {
        User current = (User) session.getAttribute("loggedInUser");
        if (current == null) {
            return null;
        }
        if (!"ADMIN".equals(current.getRole())) {
            return null;
        }
        return current;
    }

    // 🔹 Admin Dashboard
    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model, HttpSession session) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        long totalUsers = userRepository.count();
        long totalVolunteers = userRepository.countByRole("VOLUNTEER");
        long totalAdmins = userRepository.countByRole("ADMIN");

        long totalRequests = helpRequestRepository.count();
        long pendingCount = helpRequestRepository.countByStatus("PENDING");
        long inProgressCount = helpRequestRepository.countByStatus("IN_PROGRESS");
        long completedCount = helpRequestRepository.countByStatus("COMPLETED");
        long cancelledCount = helpRequestRepository.countByStatus("CANCELLED");

        long foodCount = helpRequestRepository.countByCategory("Food");
        long medicineCount = helpRequestRepository.countByCategory("Medicine");
        long studyCount = helpRequestRepository.countByCategory("Study");
        long otherCount = helpRequestRepository.countByCategory("Other");

        model.addAttribute("totalUsers", totalUsers);
        model.addAttribute("totalVolunteers", totalVolunteers);
        model.addAttribute("totalAdmins", totalAdmins);

        model.addAttribute("totalRequests", totalRequests);
        model.addAttribute("pendingCount", pendingCount);
        model.addAttribute("inProgressCount", inProgressCount);
        model.addAttribute("completedCount", completedCount);
        model.addAttribute("cancelledCount", cancelledCount);

        model.addAttribute("foodCount", foodCount);
        model.addAttribute("medicineCount", medicineCount);
        model.addAttribute("studyCount", studyCount);
        model.addAttribute("otherCount", otherCount);

        return "admin-dashboard";
    }

    // 🔹 Manage Users
    @GetMapping("/admin/users")
    public String manageUsers(Model model, HttpSession session) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin-users";
    }

    @GetMapping("/admin/users/block")
    public String blockUser(@RequestParam("id") Long id,
                            HttpSession session,
                            RedirectAttributes redirectAttributes) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            User user = optional.get();
            user.setActive(false);
            userRepository.save(user);
            redirectAttributes.addFlashAttribute("message",
                    "⚠️ User " + user.getEmail() + " has been blocked.");
        }
        return "redirect:/admin/users";
    }

    @GetMapping("/admin/users/unblock")
    public String unblockUser(@RequestParam("id") Long id,
                              HttpSession session,
                              RedirectAttributes redirectAttributes) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            User user = optional.get();
            user.setActive(true);
            userRepository.save(user);
            redirectAttributes.addFlashAttribute("message",
                    "✅ User " + user.getEmail() + " has been unblocked.");
        }
        return "redirect:/admin/users";
    }

    // 🔹 Manage Requests + filter
    @GetMapping("/admin/requests")
    public String manageRequests(
            @RequestParam(name = "status", required = false) String status,
            Model model,
            HttpSession session) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        if (status == null || status.equalsIgnoreCase("ALL")) {
            status = "ALL";
        }

        List<HelpRequest> requests;
        if ("ALL".equals(status)) {
            requests = helpRequestRepository.findAll();
        } else {
            requests = helpRequestRepository.findByStatus(status);
        }

        model.addAttribute("requests", requests);
        model.addAttribute("selectedStatus", status);

        return "admin-requests";
    }

    // cancel (CANCELLED)
    @GetMapping("/admin/requests/cancel")
    public String cancelRequest(@RequestParam("id") Long id,
                                HttpSession session,
                                RedirectAttributes redirectAttributes) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        Optional<HelpRequest> optional = helpRequestRepository.findById(id);
        if (optional.isPresent()) {
            HelpRequest req = optional.get();
            req.setStatus("CANCELLED");
            helpRequestRepository.save(req);

            redirectAttributes.addFlashAttribute("message",
                    "⚠️ Request " + req.getId() + " has been cancelled.");
        }
        return "redirect:/admin/requests";
    }

    // reopen (back to PENDING)
    @GetMapping("/admin/requests/reopen")
    public String reopenRequest(@RequestParam("id") Long id,
                                HttpSession session,
                                RedirectAttributes redirectAttributes) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        Optional<HelpRequest> optional = helpRequestRepository.findById(id);
        if (optional.isPresent()) {
            HelpRequest req = optional.get();
            req.setStatus("PENDING");
            req.setAssignedVolunteer(null);
            helpRequestRepository.save(req);

            redirectAttributes.addFlashAttribute("message",
                    "✅ Request " + req.getId() + " has been reopened.");
        }
        return "redirect:/admin/requests";
    }

    // force complete
    @GetMapping("/admin/requests/force-complete")
    public String forceComplete(@RequestParam("id") Long id,
                                HttpSession session,
                                RedirectAttributes redirectAttributes) {

        User admin = requireAdmin(session);
        if (admin == null) {
            return "redirect:/access-denied";
        }

        Optional<HelpRequest> optional = helpRequestRepository.findById(id);
        if (optional.isPresent()) {
            HelpRequest req = optional.get();
            req.setStatus("COMPLETED");
            helpRequestRepository.save(req);

            redirectAttributes.addFlashAttribute("message",
                    "✅ Request " + req.getId() + " has been marked as completed.");
        }
        return "redirect:/admin/requests";
    }
}
