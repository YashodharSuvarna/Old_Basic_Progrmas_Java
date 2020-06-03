package com.funtions.example;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class FuntionEx2 {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		populate(list);
		Function<Student, String> info = p -> {
			int Marks = p.marks;
			if (Marks > 80) {
				return "A Grade";
			} else if (Marks > 60) {
				return "B Grade";
			} else if (Marks > 40) {
				return "C Grade";
			} else if (Marks > 30) {
				return "D Grade";
			}
			return "Fail";
		};

		Predicate<Student> pdata = p -> p.marks >= 60;

		for (Student i : list) {
			if (pdata.test(i)) {
				System.out.println("Student Name:" + i.name);
				System.out.println("Student Marks:" + i.marks);
				System.out.println("Student Grade:" + info.apply(i));
				System.out.println();
			}
		}
	}

	private static void populate(ArrayList<Student> list) {
		list.add(new Student("Sunny", 100));
		list.add(new Student("Bunny", 65));
		list.add(new Student("Chinny", 55));
		list.add(new Student("Vinny", 45));
		list.add(new Student("Pinny", 25));

	}

}
