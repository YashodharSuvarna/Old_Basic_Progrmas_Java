package com.doublecolon.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReferenceToStaticMethodExample {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16);

		List<Object> primeNumbers = ReferenceToStaticMethodExample.findPrimeNumbers(numbers,
				(number) -> ReferenceToStaticMethodExample.isPrime((int) number));

		System.out.println("Prime Numbers are " + primeNumbers);
	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Object> findPrimeNumbers(List<Integer> list, Predicate<Object> predicate) {
		List<Object> sortedNumbers = new ArrayList<Object>();
		list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> {
			sortedNumbers.add(i);
		});
		return sortedNumbers;

	}
	
}

/*
 * Lambda Form List primeNumbers =
 * ReferenceToStaticMethod.testPredicate(numbers, a ->
 * ReferenceToStaticMethod.isPrime(a)); 
 * 
 * Method Reference List primeNumbers =
 * ReferenceToStaticMethod.testPredicate(numbers,
 * ReferenceToStaticMethod::isPrime);
 */