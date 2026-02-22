package com.lb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lb.enti.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
