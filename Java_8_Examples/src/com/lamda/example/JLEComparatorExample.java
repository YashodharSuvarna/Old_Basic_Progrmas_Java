package com.lamda.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JLEComparatorExample {

	public static void main(String[] args) {

		List<Person1> listOfPerson1 = new ArrayList<Person1>();
		listOfPerson1.add(new Person1("abc", 27));
		listOfPerson1.add(new Person1("mno", 26));
		listOfPerson1.add(new Person1("pqr", 28));
		listOfPerson1.add(new Person1("xyz", 27));

		// Without lambda expression.
		// Sort list by age
		Comparator<Person1> comparator = new Comparator<Person1>() {
			@Override
			public int compare(Person1 o1, Person1 o2) {
				return o1.getAge() - o2.getAge();
			}
		};

		Collections.sort(listOfPerson1, comparator);

		System.out.println(" sort Person1s by age in ascending order");
		for (Person1 Person1 : listOfPerson1) {
			System.out.println(" Person1 name : " + Person1.getName());
		}

		// Witht lambda expression.
		// Sort list by age

		Collections.sort(listOfPerson1, (Person1 o1, Person1 o2) -> {
			return o1.getAge() - o2.getAge();
		});
		// Use forEach method added in java 8
		System.out.println(" sort Person1s by age in ascending order");
		listOfPerson1.forEach(
				(Person1) -> System.out.println(" Person1 name : " + Person1.getName()));
	}
}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}