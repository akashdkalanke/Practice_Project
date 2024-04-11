package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Practice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jan");
		list.add("feb");
		list.add("mar");
		list.add("apri");
		list.add("may");
		
		 // for(String str:list) { System.out.println(str); }
		 System.out.println(list);

		list.stream().forEach(s -> System.out.println(s));
		list.stream().filter(s->s.startsWith("ap")).forEach(s->System.out.println("filter: "+s));
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"abc");
		map.put(2,"pqr");
		map.put(3,"xyz");
		map.put(4,"rst");
		map.forEach((key,value)->System.out.println(key+" : "+value));
		
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		System.out.println(map);
		
		Consumer<String> consumer=c->System.out.println(c);
		consumer.accept("Hi Akash");
	
		
		

	}

}
