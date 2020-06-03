package com.lamda.example;

import java.util.ArrayList;

public class LamdaEx {
	
	
	@FunctionalInterface
	interface MyFunctionalInterface {

		//A method with no parameter
	    public String sayHello();
	    	}
	
		
	public static void main(String[] args) {
		
				
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		
		System.out.println("data Element"+data);		
		
		
		for(int a : data){
			System.out.println(a);
			if(a> 3){
				System.out.println("With condition"+ a);
			}
		}
		
			
		
		data.forEach(a -> System.out.println("Lamda Ex"+a));
		data.forEach(c -> { if(c %2 == 0) System.out.println("lamda with Condition"+c);});
		
		new Thread(
			    () -> System.out.println("My Runnable") 
			).start();
		
		
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};
	    System.out.println(msg.sayHello());
	}
		    	
	
		}
	
