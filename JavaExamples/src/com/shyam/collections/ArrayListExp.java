package com.shyam.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		Employee emp1 = new Employee(1, "Shyam", new Department(1, "IT"));
		Employee emp2 = new Employee(2, "Sai", new Department(2, "Admin"));
		Employee emp3 = new Employee(3, "Sagar", new Department(3, "HR"));
		Employee emp4 = new Employee(4, "Prasad", new Department(1, "IT"));
		Employee emp5 = new Employee(5, "Mannem", new Department(3, "HR"));
		Employee emp6 = new Employee(6, "Vidya", new Department(4, "FIN"));
		
//		Add values to list
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
//		Display list
		System.out.println(list);
		
//		add values
		Employee master = new Employee(10, "Master", new Department(5, "CEO"));
		list.add(0, master);
		
//		Display list after inserting at index
		System.out.println(list);
		
//		deleting values from list
		
		list.remove(0);
		System.out.println(list);

	}

}
