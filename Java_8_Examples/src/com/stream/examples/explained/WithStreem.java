package com.stream.examples.explained;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStreem {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i = 0; i <= 20; i++) {
			num.add(i);
		}
		System.out.println(num);

		List<Integer> l2 = num.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
		
		Stream powerOfTen = Stream.of(1, 10, 100, 1000, 10000); 
		//Integer[] array = (Integer[]) powerOfTen.toArray(size -> new Integer[size]); 
		//System.out.println(Arrays.toString(array));

		/*int[] intArray = powerOfTen.mapToInt(x -> x).toArray();
		System.out.println(Arrays.toString(intArray))*/;
		
		Stream<String> numbers = Stream.of("1", "2", "3", "4", "5"); 
		int[] ints = numbers.mapToInt(Integer::parseInt).toArray();

		
		Stream<String> cities = Stream.of("London", "Paris", "Tokyo");
		String[] arrayOfCities = cities.toArray(String[]::new); 
		System.out.println(Arrays.toString(arrayOfCities));

		
		Integer[] number = {2, 3, 5, 7, 11};
		List<Integer> listOfInts = new ArrayList<>(Arrays.asList(number));
		Integer[] array = listOfInts.stream().toArray(size -> new Integer[size]);
		System.out.println(Arrays.toString(array));
	
		/*	String[] array = stream.toArray(size -> new String[size]);
		System.out.println(Arrays.toString(array));*/
		
		Integer[] ir = num.stream().toArray(Integer[] :: new);
		for(Integer i: ir) {
		System.out.println(i);
		}
		
		
		Stream<Integer> s=Stream.of(99,999,9999,99999);
		s.forEach(System.out:: println);
		Double[] d={10.0,10.1,10.2,10.3};
		Stream<Double> s1=Stream.of(d);
		s1.forEach(System.out :: println);
	}
}


