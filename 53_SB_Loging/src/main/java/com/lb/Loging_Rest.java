package com.lb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loging_Rest {
	
	private Logger logger=LoggerFactory.getLogger(Loging_Rest.class);
	@GetMapping("/")
	public String getmsg() {
		logger.info("Pinku getmsg INFO Start");
		String msg="PInkuna pp";
		logger.info("Pinku getmsg INFO End");
		return msg;
		
	}

}
