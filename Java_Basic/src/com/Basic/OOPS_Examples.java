package com.Basic;

abstract  class OOPS_Examples {
	 
	
    abstract void run();                     //Abstract Concept
	
    void room(){
		System.out.println("Welcome to  OPPS ");
 }

}
  class Emp extends OOPS_Examples{          //Inheritance Concept
	
	  int salary;
	int bounes;
	
	void sum(){                              //Encapsulation Concept
		int data;
		data=salary+bounes;
		System.out.println("Sum of "+data);
	}
	
	void run(){
		System.out.println("A man is Running");
	}
	
	void teacher(){   
		System.out.println("Welcome to Employee Class ");
	}
  }
  
  class Employee{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp v1 =  new Emp();
		OOPS_Examples v2 = new Emp();        //Polymorphism  concept 
		v2.run();
		v1.room();
		v1.teacher();
		v1.run();
		v1.sum();
		 
	}
}
