package com.collection;

import java.util.EnumMap;
import java.util.Map.Entry;
  enum GFG
{
    CODE, CONTRIBUTE, QUIZ, MCQ;
}
//create an enum  
  enum Days {  
Monday, Tuesday, Wednesday, Thursday  
} 
public class EnumMapEx {

	 public static void main(String[] args) {  
		   //create and populate enum map  
		   EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		   map.put(Days.Monday, "1");  
		   map.put(Days.Tuesday, "2");  
		   map.put(Days.Wednesday, "3");  
		   map.put(Days.Thursday, "4");  
		   // print the map  
		   for(Entry<Days, String> m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue()); 
		       
		       
		       
		        // Java EnumMap Example 1: creating EnumMap in java with key 
		        //as enum type STATE
		        EnumMap<GFG, String> gfgMap = new EnumMap<GFG, String>(GFG.class);
		 
		        // Java EnumMap Example 2:
		        // putting values inside EnumMap in Java
		        // we are inserting Enum keys on different order than their natural order
		        gfgMap.put(GFG.CODE, "Start Coding with gfg");
		        gfgMap.put(GFG.CONTRIBUTE, "Contribute for others");
		        gfgMap.put(GFG.QUIZ, "Practice Quizes");
		        gfgMap.put(GFG.MCQ, "Test Speed with Mcqs");
		         
		        // printing size of EnumMap in java
		        System.out.println("Size of EnumMap in java: " + gfgMap.size());
		      
		        // printing Java EnumMap , should print EnumMap in natural order
		        // of enum keys (order on which they are declared)
		        System.out.println("EnumMap: " + gfgMap);
		      
		        // retrieving value from EnumMap in java
		        System.out.println("Key : " + GFG.CODE +" Value: "
		                            + gfgMap.get(GFG.CODE));
		      
		        // checking if EnumMap contains a particular key
		        System.out.println("Does gfgMap has :" + GFG.CONTRIBUTE + " : "
		                            +  gfgMap.containsKey(GFG.CONTRIBUTE));
		      
		        // checking if EnumMap contains a particular value
		        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : "
		                            + gfgMap.containsValue("Practice Quizes"));
		        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : "
		                            + gfgMap.containsValue(null));
		      }   
		   }  
		}  