package com.funtions.example;

//Progarm to perform Salary Increment for Employees by using Predicate & Function
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class FuntionEx3 {
	public static void main(String[] args) {

		ArrayList<Employee> data = new ArrayList<Employee>();
		populate(data);
		System.out.println("Befor Increment ");
		System.out.println(data);

		Predicate<Employee> pd = p -> p.salary > 50;

		Function<Employee, Employee> f = q -> {
			q.salary = q.salary + 1;
			return q;
		};

		System.out.println("After Increment:");
		ArrayList<Employee> data1 = new ArrayList<Employee>();
		for (Employee i : data) {
			if (pd.test(i)) {
				data1.add(f.apply(i));
			}
		}
		System.out.println(data);
		System.out.println("Employees with incremented salary:");
		System.out.println(data1);

	}

	private static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Sunny", 1000));
		list.add(new Employee("Bunny", 65));
		list.add(new Employee("Chinny", 55));
		list.add(new Employee("Vinny", 45));
		list.add(new Employee("Pinny", 25));

	}

}
