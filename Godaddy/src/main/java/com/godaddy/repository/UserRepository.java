package com.godaddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.godaddy.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
