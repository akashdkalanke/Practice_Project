package com.streamfilter;

import java.util.ArrayList;
import java.util.List;

public class StreamAndFilters {
	
	
	public static List<Employee> getList(){
		List<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1,"akash",100000L));
		emplist.add(new Employee(2,"vivek",20000L));
		emplist.add(new Employee(2,"suraj",70000L));
		
		return emplist;
		
	}
	
	public static void main(String[] args) {
		getList().stream().filter(e->e.getSalary()>7000l).forEach(e->System.out.println(e.getSalary()));
		
	}

}
