package com.doublecolon.example;

class With_Method_Reference {
	public static void m1() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Child method ");
		}
	}

	public static void main(String[] args) {

		Runnable r = With_Method_Reference::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 6; i++) {
			System.out.println("Main method ");
		}

	}

};
