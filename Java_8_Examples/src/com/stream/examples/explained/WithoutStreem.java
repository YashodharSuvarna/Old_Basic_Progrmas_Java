package com.stream.examples.explained;

import java.util.ArrayList;

public class WithoutStreem {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i <= 20; i++) {
			num.add(i);
		}
		System.out.println(num);

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (Integer l2 : num) {
			if (l2 % 2 == 0) {
				l.add(l2);
			}

		}

		System.out.println(l);
	}

}
