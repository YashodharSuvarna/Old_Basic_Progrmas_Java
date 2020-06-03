package com.lamda.example;

interface TestInterface {

	public void square(int a);

	static void show() {
		System.out.println("Static Method Executed");
	}
}

interface TestInterface1 {

	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {

	default void show() {
		System.out.println("Default TestInterface2");
	}
}

class TestClass implements TestInterface1, TestInterface2, TestInterface {

	public void square(int a) {
		System.out.println(a * a);
	}

	public void show() {

		TestInterface1.super.show();

		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		TestClass d = new TestClass();
		d.square(4);
		TestInterface.show();
		d.show();
	}
}
