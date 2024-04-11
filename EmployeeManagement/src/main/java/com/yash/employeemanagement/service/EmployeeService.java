package com.yash.employeemanagement.service;

import java.util.List;

import com.yash.employeemanagement.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(Long empId);

	public Boolean deleteEmployeeById(Long empId);

	public Employee updateEmployee(Employee employee);

}
