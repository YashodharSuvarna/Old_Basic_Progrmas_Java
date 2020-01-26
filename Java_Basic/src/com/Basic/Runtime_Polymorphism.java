package com.Basic;

public class Runtime_Polymorphism {
	
	void run(){System.out.println("running");}  
	}  
	class Splender extends Runtime_Polymorphism{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
		
		  Runtime_Polymorphism l = new Splender();//upcasting  
	    l.run(); 
	    Splender a = new Splender();
	    a.run();
	    Runtime_Polymorphism z = new  Runtime_Polymorphism();
	    z.run();
	  }

	 
	} 
