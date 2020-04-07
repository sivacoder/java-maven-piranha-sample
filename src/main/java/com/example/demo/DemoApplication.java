package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		if (Test.getldvalue("dummy-flag")) {
			System.out.println("success");
		}
		SpringApplication.run(DemoApplication.class, args);
	}
//
//	private static boolean getldvalue(String flag) {
//		return true;
//	}

}
