package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeSbApp1Application {

    private final Car car;

    PracticeSbApp1Application(Car car) {
        this.car = car;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PracticeSbApp1Application.class, args);
		Car c=context.getBean(Car.class);
		c.carstart();
	}

}
