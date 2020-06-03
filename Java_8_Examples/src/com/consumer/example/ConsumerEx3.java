package com.consumer.example;
//Demo Program-3 for Predicate, Function & Consumer
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class ConsumerEx3 {
	public static void main(String[] args) {
		ArrayList<Student> info = new ArrayList<Student>();
		populate(info);
		Predicate<Student> pdata = a -> a.marks > 60;
		Function<Student, String> fdata = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Dictinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 35) {
				return "D[Third Class]";
			} else {
				return "E[Failed]";
			}
		};

		Consumer<Student> cdata = c -> {
			System.out.println("Student Name:" + c.name);
			System.out.println("Student Marks:" + c.marks);
			System.out.println("Student Grade:" + fdata.apply(c));
			System.out.println();
		};

		for (Student d : info) {
			if (pdata.test(d)) {
				cdata.accept(d);
			}

		}

	}

	public static void populate(ArrayList<Student> d) {
		d.add(new Student("Bahubali", 100));
		d.add(new Student("Rayees", 10));
		d.add(new Student("Dangal", 2));
		d.add(new Student("Sultan", 7));
	}
}
