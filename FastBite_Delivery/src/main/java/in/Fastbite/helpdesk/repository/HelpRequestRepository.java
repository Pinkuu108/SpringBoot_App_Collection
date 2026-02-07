package in.Fastbite.helpdesk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Fastbite.helpdesk.entity.HelpRequest;
import in.Fastbite.helpdesk.entity.User;

public interface HelpRequestRepository extends JpaRepository<HelpRequest, Long> {

    // existing
    List<HelpRequest> findByStatus(String status);

    List<HelpRequest> findByUser(User user);

    List<HelpRequest> findByStatusAndAssignedVolunteerIsNull(String status);

    List<HelpRequest> findByAssignedVolunteer(User assignedVolunteer);

    // 🔹 Phase 6: search / filter
    List<HelpRequest> findByCategory(String category);

    List<HelpRequest> findByCategoryAndStatus(String category, String status);

    // 🔹 For dashboard stats
    long countByStatus(String status);

    long countByCategory(String category);
}
