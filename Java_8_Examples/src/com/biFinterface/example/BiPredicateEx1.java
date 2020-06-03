package com.biFinterface.example;

import java.util.function.BiPredicate;

public class BiPredicateEx1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bdate = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bdate.test(1, 2));
		System.out.println(bdate.test(2, 2));

	}
}