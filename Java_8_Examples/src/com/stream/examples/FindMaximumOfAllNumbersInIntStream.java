package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMaximumOfAllNumbersInIntStream {

	public static void main(String[] args) {

		// Find maximum of all numbers in IntStream
		OptionalInt max = IntStream.of(9, 5, 3, 12, 4).max();
		OptionalInt miInt = IntStream.of(8,2,3,4,5,6,7,9,0,5).findFirst();
		System.out.println("Max: " + max.getAsInt());
		System.out.println("Max: " + miInt.getAsInt());
	}

}
