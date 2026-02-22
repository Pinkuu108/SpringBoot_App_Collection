package com.lb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lb.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
