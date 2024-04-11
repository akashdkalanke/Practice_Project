package com.yash.employeemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="emp_tbl")
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_age")
	private Integer empAge;
	@Column(name = "emp_salary")
	private Double empSalary;
	@Column(name="phone_number")
	private Long phoneNumber;
	@Column(name = "created_date")
	private Date createdDt;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "updated_date")
	private Date updatedDt;
	@Column(name = "updated_by")
	private String updatedBy;
	
	

}
