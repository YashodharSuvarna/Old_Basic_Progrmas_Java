package com.stream.examples.explained;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Java Program to convert a Java 8 Stream to Arra

public class WithStreem3 {
	public static void main(String... args) {
		// stream to object array in Java Stream
		Stream<String> currencies = Stream.of("INR", "USD", "GBP", "EUR", "JPY"); 
		Object[] objectArray = currencies.toArray(); 
		System.out.println("Stream to object array in Java:");
		System.out.println(Arrays.toString(objectArray)); 
		
		// via - Stream.toArray() and lambda expression
		Integer[] primes = {2, 3, 5, 7, 11};
		List<Integer> listOfInts = new ArrayList<>(Arrays.asList(primes)); 
		Integer[] array = (Integer[]) listOfInts.stream() .toArray(size -> new Integer[size]); 
		System.out.println("Stream to Integer array using lambda expression in Java:"); 
		System.out.println(Arrays.toString(array)); 
		
		
		// via - method reference 
		array = (Integer[]) listOfInts.stream() .toArray(Integer[]::new); 
		System.out.println("Stream to Integer array using method reference in Java:"); 
		System.out.println(Arrays.toString(array)); 
		
		
		// via arraylist 
		ArrayList<?> list = (ArrayList<?>) listOfInts.stream() .collect(Collectors.toCollection(ArrayList::new)); 
		Integer[] iArray = (Integer[]) list.toArray(new Integer[list.size()]); 
		System.out.println("Stream to Integer array via ArrayList in Java:"); 
		System.out.println(list); 
		
		/*Stream<String> currencies1 = Stream.of("INR", "USD", "GBP", "EUR", "JPY");
		  // Program to convert stream to an array 
		  String[] array1 = currencies1.toArray(size1 -> new String[size1]);
		  System.out.println(Arrays.toString(array1));
		
		  // Program to convert stream to an array 
		  String[] array11 = currencies1.toArray(String[]::new);
		  System.out.println(Arrays.toString(array11));
		 
		// Program to convert stream to an Object array 
		  Object[] 2 = currencies1.toArray(); 
		 System.out.println(Arrays.toString(2));
		 */
		
	
	
	} } 

		