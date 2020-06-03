package com.biFinterface.example;

import java.util.function.BiFunction;

import com.funtions.example.Person;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<Person, Person, Integer> biFunction = (p1,p2) -> {
			return p1.getAge() + p2.getAge();
		};
		
		int totalAge = biFunction.apply(new Person("Ramesh", 10), new Person("ram", 10));
		System.out.println(totalAge);
		
	}
}
