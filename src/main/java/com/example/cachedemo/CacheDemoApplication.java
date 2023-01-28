package com.example.cachedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CacheDemoApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(CacheDemoApplication.class, args);	}

//		@Override
//		public void run(String... args) throws Exception {
//
//			if(employeeService.getAllEmployees().isEmpty()){
//				employeeService.saveEmployee(
//						Employee.builder()
//								.name("Johnny")
//								.build()
//				);
//			}
//		}



}
