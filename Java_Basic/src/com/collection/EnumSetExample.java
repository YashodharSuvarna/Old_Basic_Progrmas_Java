package com.collection;

import java.util.EnumSet;
import java.util.Set;

	enum days1 {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		} 
	enum Gfg1 
	{
	    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
	}
class EnumSetExample {
		 public static void main(String[] args) {
			 
			 for (days1 s : days1.values())  
				 System.out.println("values of values of maethods "+s);  
			
			 Set<days1> set1 = EnumSet.of(days1.TUESDAY, days1.WEDNESDAY);  
		      System.out.println("Week Days:"+set1);  

			 Set<days1> set =EnumSet.allOf(days1.class); 
		      System.out.println("Week Days:"+set);  

		      Set<days1> set2 = EnumSet.noneOf(days1.class); 
		      System.out.println("Week Days:"+set2);  


			    // Traversing elements  
			  /*  Iterator<days> iter = set.iterator();  
			    while (iter.hasNext())  
			      System.out.println(iter.next());  */
			 // create a set
		        EnumSet<Gfg1> set11, set21, set3, set4;
		 
		        // add elements
		        set11 = EnumSet.of(Gfg1.QUIZ, Gfg1.CONTRIBUTE, Gfg1.LEARN, Gfg1.CODE);
		        set21 = EnumSet.complementOf(set11);
		        set3 = EnumSet.allOf(Gfg1.class);
		        set4 = EnumSet.range(Gfg1.CODE, Gfg1.CONTRIBUTE);
		        System.out.println("Set 1: " + set11);
		        System.out.println("Set 2: " + set21);
		        System.out.println("Set 3: " + set3);
		        System.out.println("Set 4: " + set4);
		 }}


