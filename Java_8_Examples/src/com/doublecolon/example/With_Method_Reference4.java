package com.doublecolon.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class With_Method_Reference4 {

	// static function to be called
	static void someFunction(String s) {
		System.out.println("static"+s);
	}

	 void someFunction1(String s) 
	    { 
	        System.out.println("instance"+s); 
	    } 
	
	 public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");
		
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

		// call the static method
		// using double colon operator
		//messages.forEach(word -> StringUtils.capitalize(word));
		//messages.forEach(StringUtils::capitalize);
		list.forEach(s-> someFunction(s));
		list.forEach(With_Method_Reference4::someFunction);
		
		//call the instance method 
        // using double colon operator 
		With_Method_Reference4 data = new With_Method_Reference4();
	    list.forEach( s -> data.someFunction1(s));
        list.forEach((new With_Method_Reference4())::someFunction1);
		
        
        numbers.stream()
        .sorted((a, b) -> a.compareTo(b));
      numbers.stream()
        .sorted(Integer::compareTo);
        
        

	}

}
