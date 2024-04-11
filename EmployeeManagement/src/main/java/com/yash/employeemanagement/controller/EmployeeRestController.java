package com.yash.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yash.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;

}
