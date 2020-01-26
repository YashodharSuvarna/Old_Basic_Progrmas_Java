package com.collection;

import java.util.TreeSet;

public class TreesetEx {
	public static void main (String[] args)
    {
 
        TreeSet ts5 = new TreeSet();
 
        // Uncommenting below  throws NoSuchElementException
        // System.out.println(ts5.first());
 
        // Uncommenting below throws NoSuchElementException
        // System.out.println(ts5.last());
        ts5.add("Yash");

        ts5.add("GeeksforGeeks");
        ts5.add("Compiler");
        ts5.add("practice");
        ts5.add("Suva");
        System.out.println("Values are"+ts5); 
        System.out.println(ts5.first()); // Compiler
        System.out.println(ts5.last()); //Practice
 
        // Elements less than O. It prints
        // [Compiler,GeeksforGeeks]
        System.out.println(ts5.headSet("O"));
 
        // Elements greater than or equal to G.
        // It prints [GeeksforGeeks, Practice]
        System.out.println(ts5.tailSet("G"));
 
        // Elements ranging from C to P
        // It prints [Compiler,GeeksforGeeks]
        System.out.println(ts5.subSet("C","P"));
 
        // Deletes all elements from ts5.
        ts5.clear();
 
        // Prints nothing
        System.out.println(ts5);
    }
}

