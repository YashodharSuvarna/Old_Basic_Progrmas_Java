package com.lamda.example;

class BasicLamdaEx4 {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("child");
		};

		Thread t = new Thread(r);
		t.start();
		System.out.println("Parent");

	}
}
