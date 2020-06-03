package com.doublecolon.example;

public class With_Lambda_Expression {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 6; i++) {
				System.out.println("Child method ");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 6; i++) {
			System.out.println("Main method ");
		}

	}

};
