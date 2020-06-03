package com.doublecolon.example;

@FunctionalInterface
interface IntSupplier {
	ConstorMethodReferenceDemo apply(int n);
}

@FunctionalInterface
interface IntObjectSupplier2 {
	ConstorMethodReferenceDemo apply(ConstorMethodReferenceDemo obj);
}

public class ConstorMethodReferenceDemo {
	private int num;

	public ConstorMethodReferenceDemo(int num) {
		this.num = num;
	}

	public ConstorMethodReferenceDemo(ConstorMethodReferenceDemo n) {
		this.num = n.num;
	}

	public static void main(String[] args) {
		// using the "IntSupplier" functional interface
		int num = 10;

		// method refernce
		IntSupplier s1 = ConstorMethodReferenceDemo::new;
		ConstorMethodReferenceDemo newObj1 = s1.apply(num);
		System.out.println("new object has a instance value " + newObj1.num);

		// using the "IntObjectSupplier2" functional interface
		IntObjectSupplier2 s2 = ConstorMethodReferenceDemo::new;
		ConstorMethodReferenceDemo newObj = s2.apply(newObj1);
		System.out.println("new object has a instance value " + newObj.num);

	}
}