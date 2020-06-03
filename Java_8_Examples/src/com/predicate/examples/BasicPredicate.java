package com.predicate.examples;

import java.util.function.Predicate;

public class BasicPredicate {
	public static void main(String[] args) {
		// Basic Predicate
		Predicate<Integer> data = i -> i > 10;
		System.out.println(data.test(2));

		// Start with y
		String[] name = { "Yash", "data", "datainterface" };
		Predicate<String> startwithy = s -> s.startsWith("Y");
		
		String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"}; 
		Predicate<String> startsWithK=s->s.charAt(0)=='K'; 
		System.out.println("The Names starts with K are:");
		for(String s: names)  { 
				if(startsWithK.test(s))  { 
						System.out.println(s); 
						}
		}
		
		for (String s : name) {
			if (startwithy.test(s)) {
				System.out.println(s);
			}
		}

	}

}
