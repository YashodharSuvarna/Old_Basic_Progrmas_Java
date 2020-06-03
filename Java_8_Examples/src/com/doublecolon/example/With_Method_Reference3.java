package com.doublecolon.example;

import java.util.function.Function;
import java.util.function.Supplier;

class Company1 {

}

class Company {
	String name;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class With_Method_Reference3 {
	public static void main(String[] args) {

		// Calling parseInt() method using lambda

		Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
		System.out.println(lambdaFunction.apply("12"));

		// Calling parseInt() method using method reference

		Function<String, Integer> referenceFunction = Integer::parseInt;
		System.out.println(referenceFunction.apply("12"));

		// Calling toLowerCase() method using lambda

		Function<String, String> lambdaFunction1 = (String s) -> s.toLowerCase();
		System.out.println(lambdaFunction1.apply("JAVA"));

		// Calling toLowerCase() method using method reference

		Function<String, String> referenceFunction1 = String::toLowerCase;
		System.out.println(referenceFunction1.apply("JAVA"));

		Company c = new Company("My_Company");

		// Calling getName() of c using lambda

		Supplier<String> lambdaSupplier = () -> c.getName();
		System.out.println(lambdaSupplier.get());

		// Calling getName() of c using method reference

		Supplier<String> referenceSupplier = c::getName;
		System.out.println(referenceSupplier.get());

		// Creating objects using lambda

		Supplier<Company1> lambdaSupplier1 = () -> new Company1();
		lambdaSupplier1.get();

		// Creating objects using constructor references

		Supplier<Company1> referenceSupplier1 = Company1::new;
		referenceSupplier1.get();

	}
}
