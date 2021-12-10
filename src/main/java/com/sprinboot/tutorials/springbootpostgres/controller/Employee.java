package com.sprinboot.tutorials.springbootpostgres.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.tutorials.springbootpostgres.dto.EmployeeDTO;

@RestController
@RequestMapping(value = "/api/v1/")
public class Employee {
	
	
	
	@GetMapping("/greetEmployee")
	private String greetEmployee(@RequestBody EmployeeDTO employeeDto) {
		
		
		return "Hello "+ employeeDto.getName();
	}

}
