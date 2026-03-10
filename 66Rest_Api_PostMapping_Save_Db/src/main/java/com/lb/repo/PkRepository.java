package com.lb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lb.dto.UserPk;

public interface PkRepository extends JpaRepository<UserPk, Integer>{

}
