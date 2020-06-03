package com.stream.examples.explained;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreem2 {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();		
		data.add("Yash");
		data.add("Data");
		data.add("Yashh");
		
		System.out.println(data);
		
		List<String> l2 = data.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		 
		System.out.println(l2);
		
		
		long count = data.stream().filter(s ->s.length()==5).count();
		System.out.println("The number of 5 length strings is:"+count);
		
		
		List<String> l3=data.stream().sorted().collect(Collectors.toList());
		System.out.println("according to default natural sorting order:"+l3);
		
		
		List<String> l4=data.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("according to customized sorting order:"+l4);
		
		String min=data.stream().min((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println("minimum value is:"+min);
		
		
		String max=data.stream().max((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println("maximum value is:"+max);
		
		data.stream().forEach(s->System.out.println(s));
		l3.stream().forEach(System.out:: println);
	}
}


