package com.yash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		Collections.sort(list);//ascending
		Collections.reverse(list);//descending
		System.out.println(list);
		list.stream().sorted().forEach(l->System.out.println(l));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(176, "Roshan", "IT", 600000));
		emplist.add(new Employee(388, "Vikas", "CIVIL", 900000));
		emplist.add(new Employee(470, "Bimal", "DEFENCE", 500000));
		emplist.add(new Employee(624, "Sourabh", "CORE", 400000));
		emplist.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
		
		emplist.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
	}

}
