package com.yash.employeemanagement.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.employeemanagement.entity.Employee;
import com.yash.employeemanagement.repository.EmployeeRepository;
import com.yash.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		employee.setEmpId(null);
		employee.setCreatedDt(new Date());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		Optional<Employee> empObj = employeeRepository.findById(empId);
		if (empObj.isPresent()) {
			return empObj.get();
		}

		return null;
	}

	@Override
	public Boolean deleteEmployeeById(Long empId) {
		if (employeeRepository.existsById(empId)) {
			employeeRepository.deleteById(empId);
			return true;
		}
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employee.setUpdatedDt(new Date());
		return employeeRepository.save(employee);
	}

}
