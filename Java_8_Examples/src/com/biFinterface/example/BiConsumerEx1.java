package com.biFinterface.example;

import java.util.function.BiConsumer;

public class BiConsumerEx1 {
	public static void main(String[] args) {
		BiConsumer<String, String> Cdata =  (s1,s2) -> System.out.println(s1+s2);
		Cdata.accept("Yash","odhar");

	}
}