package com.optional.example;

import java.util.Optional;

public class OptionalExample3 {

	public static void main(String[] args) {
		// Creating Optional object from a String
		Optional<String> GOT = Optional.of("Game of Thrones");
		// Optional.empty() creates an empty Optional object
		Optional<String> nothing = Optional.empty();
		/*
		 * isPresent() method: Checks whether the given Optional Object is empty
		 * or not.
		 */
		if (GOT.isPresent()) {
			System.out.println("Watching Game of Thrones");
		} else {
			System.out.println("I am getting Bored");
		}
		/*
		 * ifPresent() method: It executes only if the given Optional object is
		 * non-empty.
		 */
		// This will print as the GOT is non-empty
		GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));
		// This will not print as the nothing is empty
		nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
		
		
		 //orElse() method
        System.out.println(GOT.orElse("Default Value")); 
        System.out.println(nothing.orElse("Default Value")); 

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value")); 
        System.out.println(nothing.orElseGet(() -> "Default Value")); 
        
        
        
        System.out.println(GOT.map(String::toLowerCase));        
        System.out.println(nothing.map(String::toLowerCase));
        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));        
        System.out.println("Value of Optional object"+anotherOptional);        
        System.out.println("Optional.map: "             
            +anotherOptional.map(gender -> gender.map(String::toUpperCase)));        
        //Optional<Optional<String>>    -> flatMap -> Optional<String>        
        System.out.println("Optional.flatMap: "            
            +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
        
        
        /* Filter returns an empty Optional instance if the output doesn't         
         * contain any value, else it returns the Optional object of the          
         * given value.         
         */        
        System.out.println(GOT.filter(s -> s.equals("GAME OF THRONES")));         
        System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));
        
        
	}
}
