package com.Basic;

public class Tostring {
	 
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Tostring(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		 
		/*void Display(){
			 System.out.println("Student Detaoils+"+rollno+"  "+name+"  "+city);
			 
		 }*/
		 
		 public String toString(){
			 return rollno+"  "+name+"  "+city;
		 }
		  
		 public static void main(String args[]){  
			 Tostring s1=new  Tostring(101,"Raj","lucknow");  
			 Tostring s2=new  Tostring(102,"Vijay","ghaziabad");  
		   //s1.Display();
		  // s2.Display();
		  System.out.println(s1); 
		   System.out.println(s2); 
		 }  
		}  
 
 