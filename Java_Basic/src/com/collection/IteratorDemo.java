package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
class IteratorDemo{
	public static void main(String args[])
	{
 	ArrayList<Integer> a = new ArrayList<Integer>();//creating arrasylist
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);	
	a.add(500);
	a.add(700);
	Iterator itr=a.iterator();  // getting Iterator from arraylist to traverse elements  

while(itr.hasNext()){
	System.out.println(itr.next());
}
a.remove(2);
	}
}

	
