package com.doublecolon.example;

interface IntNumPredicate1 {
	boolean check(InstanceMethodReferenceDemo2 m, int n);
}

public class InstanceMethodReferenceDemo2 {
	final private int num;

	public InstanceMethodReferenceDemo2(int num) {
		this.num = num;
	}

	// check if num is bigger than the input value n
	boolean isBigger(int n) {
		return num > n;
	}

	public static void main(String[] args) {
		InstanceMethodReferenceDemo2 checker1 = new InstanceMethodReferenceDemo2(10);
		int numToCompare = 9;
		IntNumPredicate1 p = InstanceMethodReferenceDemo2::isBigger;
		boolean result = p.check(checker1, 9);
		if (result) {
			System.out.println(checker1.num + " is bigger than " + numToCompare);
		} else {
			System.out.println(checker1.num + " is smaller  " + numToCompare);
		}
		// second object of IntNumChecker
		InstanceMethodReferenceDemo2 checker2 = new InstanceMethodReferenceDemo2(8);
		result = p.check(checker2, 9);
		if (result) {
			System.out.println(checker2.num + " is bigger than " + numToCompare);
		} else {
			System.out.println(checker2.num + " is smaller " + numToCompare);
		}
	}
}
