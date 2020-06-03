package com.optional.example;

import java.util.Optional;

public class OptionalExample2 {
	public static void main(String[] args) {

		/*// Without using Optional class
		String[] str = new String[10];
		// Getting the substring
		String str2 = str[9].substring(2, 5);
		// Displaying substring
		System.out.println(str2);
*/
		
		//Using Optional Class
		String[] str3 = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str3[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str21 = str3[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str21);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str3[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str3[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str21 = str3[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str21);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }    
	}
}
