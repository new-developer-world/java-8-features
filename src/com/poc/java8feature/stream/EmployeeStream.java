package com.poc.java8feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeStream {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1001, "Rohit", "Senior Software Engineer"));
		list.add(new Employee(1003, "Abhay", "Principle Engineer"));
		list.add(new Employee(1004, "Shyam", "Software Engineer"));
		list.add(new Employee(1002, "Rohan", "Senior Software Engineer"));
		list.add(new Employee(1005, "Sohan", "Senior Software Engineer"));
			
		//Stream Filter and print using for each
		list.stream().
		filter(e->e.getDesgination().equalsIgnoreCase("Software Engineer")).
		forEach(t ->System.out.println(t) );
		
		//Stream Filter and print using list by storing in the list
		System.out.println("----------------------");
		List<Employee> emp1 = list.stream().
				filter(e->e.getDesgination().equalsIgnoreCase("Senior Software Engineer")).
				collect(Collectors.toList());
		
		for (Employee employee:emp1) {
			System.out.println(employee.toString());
		}
		
		//count the SSE
		long count = list.stream().
				filter(e->e.getDesgination().equalsIgnoreCase("Principle Engineer")).count();
		
		System.out.println("Principle Engineer " + count);

	}

}
