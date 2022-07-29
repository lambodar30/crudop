package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String  home() {
		return "Hello";
	}
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
