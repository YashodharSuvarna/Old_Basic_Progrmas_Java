package com.biFinterface.example;

import java.util.function.BiFunction;

public class BiFuntionEx1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer,Integer> fdate = (a, b) -> (a + b) % 2;
		System.out.println(fdate.apply(1, 2));
		System.out.println(fdate.apply(2, 2));

	}
}