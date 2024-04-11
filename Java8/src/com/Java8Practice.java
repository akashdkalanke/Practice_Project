package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Practice {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Akash");
		list.add("Suraj");
		list.add("Nikhil");
		list.add("Charu");
		list.add("Vivek");
		
		//filter method
		list.stream().filter(str->str.startsWith("N")).forEach(System.out::println);
		
		for(String str:list)
		{
			if(str.startsWith("A"))
			System.out.println(str);
		}
		list.stream().forEach(t->System.out.println(t));
		list.stream().forEach(System.out::println);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		map.forEach((key,value)-> System.out.println(key+" "+value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		
		
		
		
	}

}
