package com.primitive.examle;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Predicate_Primitive1 {
	public static void main(String[] args) {
		// Need of Primitive Functional
		int[] x = { 0, 5, 10, 15, 20, 25 };
		Predicate<Integer> p = i -> i % 2 == 0;
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println("Need of Primitive Functional" + x1);
			}
		}

		// Demo Program for IntPredicate:
		IntPredicate p1 = i -> i % 2 == 0;
		for (int x1 : x) {
			if (p1.test(x1)) {
				System.out.println("Demo Program for IntPredicate" + x1);
			}
		}

	}

}
