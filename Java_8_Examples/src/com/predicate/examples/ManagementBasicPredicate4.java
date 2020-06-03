package com.predicate.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Java program to demonstrate working of predicates 
//on collection. The program finds all admins in an 
//arrayList of users. 
import java.util.function.Predicate;

class Employee {
	String uname;
	String city;
	int age;

	public Employee(String uname, String city, int age) {
		this.uname = uname;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [uname=" + uname + ", city=" + city + ", age=" + age + "]";
	}

	
/*	 public boolean equals(Object obj) { Employee e = (Employee) obj; if
	  (uname.equals(e.uname) && city == e.city && age == e.age) { return true;
	 } else { return false; } }*/
	 

}

public class ManagementBasicPredicate4 {
	public static void main(String[] args) {
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		papulate(list1);
		
		list1.forEach(e->System.out.println(e.age +" "+e.city+" "+e.uname));
		for(Employee data1 : list1){
			System.out.println(data1);
			
		}
		

		Predicate<Employee> city = c -> c.city.equals("Hyderabad");
		System.out.println("Hyd info");
		display(city, list1);
		
		Predicate<Employee> age = d->d.age<20;
		System.out.println("Age is less 20");
		display(age, list1);

	}

	private static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee s : list) {
			if (p.test(s)) {
				System.out.println(s);
			}
			
		}
		System.out.println("********");
	}
	
	
	private static void papulate(ArrayList<Employee> list) {
		list.add(new Employee("Durga", "Hyderabad", 23));
		list.add(new Employee("Sunny", "Hyderabad", 50));
		list.add(new Employee("Mallika", "Bangalore", 2));
		list.add(new Employee("Kareena", "Hyderabad", 65));
		list.add(new Employee("Katrina", "Bangalore", 32));
		list.add(new Employee("Anushka", "Hyderabad", 23));
		list.add(new Employee("Kanushka", "Hyderabad", 12));
		list.add(new Employee("Sowmya", "Bangalore", 16));

	}

}
