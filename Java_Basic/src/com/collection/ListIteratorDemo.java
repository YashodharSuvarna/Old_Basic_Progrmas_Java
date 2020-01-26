package com.collection;
import java.io.*;
import java.util. *;

public class ListIteratorDemo {
	public static void main(String args[])	{  

	 	ArrayList<Integer> ll = new ArrayList<Integer>();//creating arrasylist
	ll.add(10);
	ll.add(20);
	ll.add(30);

    ListIterator li = ll.listIterator();
	System.out.println("Forward Direction");  
	while(li.hasNext())
	{  
	System.out.println(li.next());
	  }  
 
	System.out.println("Reverse Direction");  
	while(li.hasPrevious())
	{  
	System.out.println(li.previous());  
	  }
	 }  
	} 
