package com.lamda.example;

/**
 * A service that greets you.
 */
public interface GreetingService {

    static String greet() {
        return "Hello World!";
    }

    public static void main(String[] args) {
		System.out.println(greet());
	}
}