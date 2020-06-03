package com.lamda.example;

import java.util.function.BiConsumer;

interface Datasum{
	 void Givensum(int a,int b);
}

public class BasicLamdaEx1 {
	public static void main(String[] args) {	
	
	Datasum findvalue = (a,b) -> System.out.println("Sum of value  :"+(a+b));
	findvalue.Givensum(1, 2);
	
	  BiConsumer<String, String> bi = (a, b) -> System.out.println(a + b);
      bi.accept("shiv ", "----------");
	}

}
