package com.lb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lb.model.saveUser;

public interface userRepository extends JpaRepository<saveUser, Integer> {

    saveUser findByEmailAndPassword(String email, String password);

}