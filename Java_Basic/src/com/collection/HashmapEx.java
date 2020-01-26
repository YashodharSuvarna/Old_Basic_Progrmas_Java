package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
public static void  main(String args[]) {
	HashMap<Integer,String> a = new  HashMap<Integer,String>();
	a.put(1,"Yashodhar");
	a.put(2,"Yashodhar");
	a.put(3,"Yashodhar");
	a.put(4,"Yashodhar");
	a.put(5,"Suvarna");
	
    System.out.println("Size of map is:- " + a.size());

	 if (a.containsKey(5)) 
     {
        String a1 = a.get(5);
         System.out.println("value for key \"5 \" is:- " + a1);
     }
	   
	 if (a.isEmpty()) 
     {
         System.out.println("map is empty");
     }
      
     else
     {
         System.out.println("map not emp ");
     } 
	 
	 System.out.println("Values before remove: "+ a);    

	   a.remove(1);  
	   System.out.println("Values after remove: "+ a);
	for(Map.Entry m:a.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());;
	}
	
	a.clear();
	System.out.println("Values are "+a);
}
}
