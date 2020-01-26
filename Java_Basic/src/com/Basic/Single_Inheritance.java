package com.Basic;

public class Single_Inheritance {
	
	void eat(){System.out.println("eating...");}  
	}  
	
	class Dog extends Single_Inheritance{  
	
		void bark(){System.out.println("barking...");} 
		}
	
	class test{

	public static void main(String args []) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		
		
		d.bark();  
		d.eat(); 
	}

}
