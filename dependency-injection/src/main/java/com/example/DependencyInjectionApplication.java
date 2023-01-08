package com.example;

import com.example.di.CarDAO;
import com.example.di.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	//public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionApplication.class, args);
//	}


	public static void main(String[] args) {
		// dependency
		CarDAO carDAO = new CarDAO();
		// inject
		CarService carService = new CarService(carDAO);

		System.out.printf(String.valueOf(carService));
	}

}
