package com.biFinterface.example;

import java.util.ArrayList;
import java.util.function.BiFunction;

//To create Student Object by taking name and rollno as input by using BiFunction
class Student {
	String Name;
	int Rollno;

	public Student(String name, int rollno) {
		Name = name;
		Rollno = rollno;
	}
}

public class BiFuntionEx2 {
	public static void main(String[] args) {
		ArrayList<Student> Sdata = new ArrayList<Student>();
		BiFunction<String, Integer, Student> BiFdata = (name, rollno) -> new Student(name, rollno);
		Sdata.add(BiFdata.apply("Yash", 12));
		Sdata.add(BiFdata.apply("Data", 88));
		Sdata.add(BiFdata.apply("Dhur", 66));
		for (Student S : Sdata) {
			System.out.println("Student Name:" + S.Name);
			System.out.println("Student Rollno:" + S.Rollno);
			System.out.println();
		}
	}
}