package com.lb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lb.dto.UserPk;
import com.lb.repo.PkRepository;
@Service
public class pkService {
	@Autowired
	private PkRepository repo;

	public UserPk getsave(UserPk pk) {
		return repo.save(pk);
	}

}
