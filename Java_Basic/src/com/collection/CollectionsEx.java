package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsEx {
	public static void main(String a[]){      
        ArrayList<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  								//collection Shuffle
        list.add("Advance Java");  
        System.out.println("Initial collection value:"+list);  
        Collections.addAll(list, "Servlet","JSP");  
        System.out.println("After adding elements collection value:"+list);  
        String[] strArr = {"C#", ".Net"};  
        Collections.addAll(list, strArr);  
       
        System.out.println("After adding array collection value:"+list); 
        Collections.shuffle(list);
        System.out.println("\nShuffled List : \n" + list);
        // Here we use Random() to shuffle given list.
        Collections.shuffle(list, new Random());
        System.out.println("\nShuffled List with Random() : \n"
                                                     + list);
 
        // Here we use Random(3) to shuffle given list.
        Collections.shuffle(list, new Random(3));
        System.out.println("\nShuffled List with Random(3) : \n"
                                                     + list);
 
        // Here we use Random(3) to shuffle given list.
        Collections.shuffle(list, new Random(5));
        System.out.println("\nShuffled List with Random(5) : \n"
                                                     + list);
        System.out.println("all list  collection value:"+list); 

     //Swap items at indexes 1 and 2						//collection swap
        Collections.swap(list, 0, 2); 
        System.out.println("\nAfter swap(list, 0, 2) : \n"
                + list);
        													//collection reverse
        System.out.println("all list Before reverse  collection value:"+list); 
        Collections.reverse(list);
        System.out.println("Reverse order created List: " + list);
        													//collection rotate
        System.out.println("all list Before    collection value:"+list); 
        Collections.rotate(list,3);
        System.out.println("Rotate order created List: " + list);
       
      
        ArrayList<Integer> list1 = new ArrayList<Integer>();  
        list1.add(46);  
        list1.add(67);  
        list1.add(24);  
        list1.add(16);  
        list1.add(8);  
        list1.add(12);  
        System.out.println("Value of maximum element from the collection: "+Collections.max(list1)); 
        System.out.println("Value of minimum element from the collection: "+Collections.min(list1));  
        System.out.println("Before sorted  collection value:"+list1); //collection sort
        Collections.sort(list1);  
        System.out.println("After  changed sorted  Collection "+list1);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after the use of Collection.reverseOrder()"+
                " and Collections.sort() :\n" + list);
							
        					//collection disjoint=both are same false,different true
        System.out.println("is list disjoint to list1 : " +
                Collections.disjoint(list, list1));
        
	}
		 
	}  

