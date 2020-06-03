package com.funtions.example;

import java.util.function.Function;

public class FuntionEx1 {
	public static void main(String[] args) {
		
		  Function <Integer, Integer> inc = e -> e + 1;
	        doSum(5, inc);
	        
	        
	        
	        
		Function<Integer, Integer> data = s -> s*1;
		
		Function <String,Integer> length = len->len.length();
		
		data = data.andThen(a -> 3 * a); 
		
		data = data.compose(a -> 3 * a);
		 
		System.out.println(data.apply(1));
		
		Function i = Function.identity(); 
		  
        System.out.println(i); 
        
        System.out.println("Length of the string in funtion "+length.apply("Yash"));
	}
	
	public static void doSum(int value, Function <Integer, Integer> func) {
        System.out.println(func.apply(value));
    }

}
