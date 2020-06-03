package com.biFinterface.example;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp {
	String name;
	double salary;

	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}

public class BiConsumerEx2 {
	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<Emp>();
		populate(emp);
		BiConsumer<Emp, Double> Cdata = (e, d) -> e.salary = e.salary + d;
		for (Emp d : emp) {
			Cdata.accept(d, 500.0);
		}

		for (Emp em : emp) {
			System.out.println("Employee Name:" + em.name);
			System.out.println("Employee Salary:" + em.salary);
			System.out.println();
		}

	}

	private static void populate(ArrayList<Emp> emp) {
		emp.add(new Emp("Yash", 1234));
		emp.add(new Emp("data", 76));
		emp.add(new Emp("ddd", 56));
		emp.add(new Emp("juu", 23));

	}
}