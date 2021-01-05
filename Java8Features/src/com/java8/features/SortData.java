package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortData {
	
	public static void main(String[] args) {
		// Initial data
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));
		
		Comparator<Employee> sortByName = 
				(Employee e1, Employee e2) -> e2.getName().compareTo(e1.getName());
				
		list.sort(sortByName);
		
		list.forEach(x -> System.out.println(x.getName()));
		
		Comparator<Employee> sortById = 
				(Employee e1, Employee e2) -> e2.getId()-e1.getId();
		
		list.sort(sortById);
		
		list.forEach(x -> System.out.println(x.getId()));
		
		
		//collect
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6"); 
		System.out.println("original list: " + numbers); 
		List<Integer> even = numbers.stream() .map(s -> Integer.valueOf(s)) 
				.filter(number -> number % 2 == 0) .collect(Collectors.toList()); 
		System.out.println("processed list, only even numbers: " + even);

		

	}
	
	
}
