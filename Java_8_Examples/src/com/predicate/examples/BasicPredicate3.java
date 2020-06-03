package com.predicate.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Java program to demonstrate working of predicates 
//on collection. The program finds all admins in an 
//arrayList of users. 
import java.util.function.Predicate;

class SoftEng {
	String uname;
	int age;
	
	
	public SoftEng(String uname, int age) {		
		this.uname = uname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SoftEng [uname=" + uname + ", age=" + age + "]";
	}
	
}

public class BasicPredicate3 {
	public static void main(String[] args) {
		
		SoftEng[] list={ new SoftEng("Durga",60), 
				new SoftEng("Sunil",25), 
				new SoftEng("Sayan",26), 
				new SoftEng("Subbu",28), 
				 new SoftEng("Ravi",17) 
				 };
		
		for(SoftEng obj:list) { 
		    System.out.println(obj);  
		 }
		
		
	Predicate<SoftEng> Alllow = s ->s.age >25;
	System.out.println("The Allowed Members into vote are:");
	for(SoftEng se : list){
		if(Alllow.test(se)){
			System.out.println(se);
			
		}
	}
	
	}
	
}
