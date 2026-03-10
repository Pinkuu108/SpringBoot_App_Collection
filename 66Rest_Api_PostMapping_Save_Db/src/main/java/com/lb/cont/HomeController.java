package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lb.dto.UserPk;
import com.lb.service.pkService;

@RestController
public class HomeController {

	@Autowired
	private pkService serv;

	@PostMapping("/save")
	public UserPk getdata(@RequestBody UserPk pk) {
		return serv.getsave(pk);
	}

}
