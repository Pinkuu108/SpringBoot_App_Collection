package in.Fastbite.helpdesk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Fastbite.helpdesk.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    // for dashboard
    long countByRole(String role);

    long countByActive(Boolean active);

    List<User> findByRole(String role);
}
