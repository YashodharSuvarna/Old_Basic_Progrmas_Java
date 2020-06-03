package com.predicate.examples;

import java.util.function.Predicate;

public class PredicateEX {

	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

	public static void main(String[] args) {

		pred(10, (i) -> i > 7);

		Predicate<Integer> data = Value -> (Value > 10);
		Predicate<String> data1 = Value1 -> (Value1.length() > 5);

		Predicate<Integer> greaterThanTen = (i) -> i > 10;
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);

		System.out.println(data.test(45));
		System.out.println(data1.test("Yashodhar"));
		System.out.println(data1.test("Yash"));
	}

}
