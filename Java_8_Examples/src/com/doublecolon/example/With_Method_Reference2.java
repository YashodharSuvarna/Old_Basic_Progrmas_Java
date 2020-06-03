package com.doublecolon.example;

interface interf1 {
	public void m1(int i);
}

class With_Method_Reference2 {
	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {

		interf1 f = I -> System.out.println("From Lambda Expression" + I);
		f.m1(1);
		
		With_Method_Reference2 d = new With_Method_Reference2();
		interf1 i1 = d::m2;
		i1.m1(2);
	}

};
