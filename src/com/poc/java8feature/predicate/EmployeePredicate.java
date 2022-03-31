package com.poc.java8feature.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.poc.java8feature.stream.Employee;

public class EmployeePredicate {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "Rohit","Senior Software Engineer"));
		list.add(new Employee(102, "Abhay","Senior Software Engineer"));
		list.add(new Employee(103, "Bikash","Software Engineer"));
		list.add(new Employee(104, "Rahul","Manager"));
		list.add(new Employee(105, "Rohit","Principle Software Engineer"));
		list.add(new Employee(106, "Mohit","Junior Software Engineer"));
		list.add(new Employee(107, "Mack","Manager"));
		
		
		Predicate<Employee> predicate=p->p.getDesgination().equalsIgnoreCase("Manager");
		for(Employee e:list)
			if(predicate.test(e)) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDesgination());
			}
		
		
		System.out.println("---joining 2predicates-------");
		Predicate<Employee> predicate2=p->p.getId()==104;
		for(Employee e:list)
			if(predicate.and(predicate2).test(e)) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDesgination());
			}
	}
}
