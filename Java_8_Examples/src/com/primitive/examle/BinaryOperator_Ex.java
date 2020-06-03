package com.primitive.examle;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperator_Ex {
	// BiFunction
	public static void main(String[] args) {

		BiFunction<String, String, String> f = (s1, s2) -> s1 + s2;
		System.out.println(f.apply("durga", "software"));

		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		System.out.println(b.apply("durga", "software"));

		BinaryOperator<Integer> b1 = (i1, i2) -> i1 + i2;
		System.out.println(b1.apply(10, 20));

		IntBinaryOperator b11 = (i1, i2) -> i1 + i2;
		System.out.println(b11.applyAsInt(10, 20));
	}

}
