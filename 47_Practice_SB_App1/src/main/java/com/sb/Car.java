package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;
	
	public void carstart()
	{
		engine.Start();
		System.out.println("Car Started..");
	}

}
