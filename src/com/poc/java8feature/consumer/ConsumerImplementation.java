package com.poc.java8feature.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.poc.java8feature.stream.Employee;

public class ConsumerImplementation {
	
	public static void main(String[] args) {
		  Consumer<Integer> consum= num ->System.out.println(num);
		  consum.accept(10);
		  System.out.println("-------------------------");
			List<Employee> list=new ArrayList<Employee>();
			list.add(new Employee(101, "Rohit","Senior Software Engineer"));
			list.add(new Employee(102, "Abhay","Senior Software Engineer"));
			list.add(new Employee(103, "Bikash","Software Engineer"));
			list.add(new Employee(104, "Rahul","Manager"));
			list.add(new Employee(105, "Rohit","Principle Software Engineer"));
			list.add(new Employee(106, "Mohit","Junior Software Engineer"));
			list.add(new Employee(107, "Mack","Manager"));
			
			Consumer<List<Employee>> consumEmp= t -> t.stream().
					forEach(emp -> System.out.println(emp.getId()+" "+emp.getName() +" "+emp.getDesgination()));
			
			consumEmp.accept(list);
	}

}
