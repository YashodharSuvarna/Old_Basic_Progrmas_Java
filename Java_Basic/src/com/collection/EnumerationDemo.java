package com.collection;
 
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

class EnumerationDemo
{
public static void main(String args[])
{  

Vector<Integer> v=new Vector<Integer>();  
v.add(10);
v.add(20);
v.add(30);

Enumeration e= v.elements();
System.out.println("Forword Direction");  

while(e.hasMoreElements())
{  
System.out.println(e.nextElement());  
  }  
 }  
}  