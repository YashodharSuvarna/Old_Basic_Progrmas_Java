package com.primitive.examle;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Funtion_Primitive1 {
	public static void main(String[] args) {
		// Need of Primitive Functional
		Function<Integer, Integer> p = i -> i * i;
		System.out.println("Need of Primitive Functional" + p.apply(4));

		
		// Demo Program for IntPredicate:
		IntFunction<Integer> p1 = i -> i * i;
		System.out.println("Demo Program for IntPredicate" + p1.apply(5));
		
		//Demo Program to find length of the given String
		Function<String, Integer> p3 = i->i.length();
		System.out.println(p3.apply("durga"));
		
		Function<Integer,Double> f=i->Math.sqrt(i); 
		System.out.println(f.apply(7));
		
		//Demo Program to find length of the given String by using ToIntFunction
		ToIntFunction<String> P4 = i-> i.length();
		System.out.println(P4.applyAsInt("durgaSoft"));
		
		IntToDoubleFunction f1=i->Math.sqrt(i); 
		System.out.println(f1.applyAsDouble(9));
		
		
	}

}
