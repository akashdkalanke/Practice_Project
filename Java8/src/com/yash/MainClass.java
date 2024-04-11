package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Roshan", "IT", 600000));
		list.add(new Employee(388, "Vikas", "CIVIL", 900000));
		list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
		list.add(new Employee(624, "Sourabh", "CORE", 400000));
		list.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
		List<Employee> list1 = list.stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList());
		System.out.println(list1);

	}

}
