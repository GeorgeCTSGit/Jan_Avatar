package com.java8.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachTests {
	
	public static void main(String[] args) {
		
		
		
		//forEach - Map
		Map<Integer, Employee> items = new HashMap<>();
		items.put(500,new Employee(500, "Shifoo", 150000));
		items.put(504, new Employee(504, "Oogway", 120000));
		items.put(503, new Employee(503, "Tigress", 100000));
		items.put(730, new Employee(730, "Mantis", 45000));
		
		items.forEach((k,v) -> System.out.println("Key:"+k+"; Value:"+ v));
		
		System.out.println("Another try");
		items.forEach((k,v)->{
			System.out.println("Key:"+k+"; Value:"+ v);
			 if("Oogway".equals(v.getName())){
				 System.out.println("Hello Master " + v.getName());
			 }
		}
		);
		
		//forEach - List
		System.out.println("************LIST*************");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));
		 
		System.out.println("Printing List with forEach");
		list.forEach(employee -> System.out.println(employee));
		 
		System.out.println("\nPrinting List after Filtering");
	
		list.stream().filter(e -> e.getSalary() > 100000);//.forEach(System.out::println);
		
	}

}
