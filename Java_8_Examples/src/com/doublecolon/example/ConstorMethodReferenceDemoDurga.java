package com.doublecolon.example;

class Sample {

	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

interface Interf {

	public Sample get(String s);
}

public class ConstorMethodReferenceDemoDurga {

	public static void main(String[] args) { 
	Interf f = s -> new Sample(s); 
	f.get("From Lambda Expression"); 
	Interf f1 = Sample :: new; 
	f1.get("From Constructor Reference"); }
}