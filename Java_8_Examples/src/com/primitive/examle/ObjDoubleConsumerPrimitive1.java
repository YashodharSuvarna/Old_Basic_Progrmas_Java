package com.primitive.examle;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

class Eamployee {
	String Name;
	double Salary;

	public Eamployee(String name, double salary) {
		Name = name;
		Salary = salary;
	}

}

public class ObjDoubleConsumerPrimitive1 {
	public static void main(String[] args) {

		ArrayList<Eamployee> i = new ArrayList<>();
		populate(i);
		ObjDoubleConsumer<Eamployee> obj = (e, d) -> e.Salary = e.Salary + d;

		for (Eamployee emp : i) {
			System.out.println("ALL EMP" + emp);
			obj.accept(emp, 50);
		}

		for (Eamployee emp : i) {
			System.out.println("Employee Name:" + emp.Name);
			System.out.println("Employee Salary:" + emp.Salary);
			System.out.println();

		}

	}

	public static void populate(ArrayList<Eamployee> d) {
		d.add(new Eamployee("Bahubali", 100));
		d.add(new Eamployee("Rayees", 10));
		d.add(new Eamployee("Dangal", 2));
		d.add(new Eamployee("Sultan", 7));
	}

}
