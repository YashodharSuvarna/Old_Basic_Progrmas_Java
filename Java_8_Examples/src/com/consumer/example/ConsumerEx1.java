package com.consumer.example;

import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<String> d = a -> System.out.println(a);
		d.accept("Yash");
		d.accept("Ing");

	}

}
