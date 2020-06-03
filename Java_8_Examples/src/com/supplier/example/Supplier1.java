package com.supplier.example;

import java.util.function.Supplier;

//For Supplier to generate Random Name
public class Supplier1 {
	public static void main(String[] args) {
	//	Supplier<Date> s=()->new Date();
		Supplier<String> sdata = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		System.out.println(sdata.get());
		System.out.println(sdata.get());
		System.out.println(sdata.get());
	}
}
