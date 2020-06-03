package com.primitive.examle;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperator_Ex {
	public static void main(String[] args) {
		
		Function<Integer, Integer> p = i -> i * i;
		System.out.println(" Functional" + p.apply(4));
		
		// If input and output are same type then we should go for UnaryOperator
		UnaryOperator<Integer> data = i -> i*i;
		System.out.println(" UnaryOperator " + data.apply(5));
		
		IntUnaryOperator f=i->i*i; 
		System.out.println(f.applyAsInt(6));
		
		
		
	}

}
