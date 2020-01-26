package com.Basic;

public class SuperKeyword {
	
	SuperKeyword()
	{
		System.out.println("Welcome to Super Keyword");
	}
	String color="white";
	String colo="red";
	void res(){System.out.println("eat rice...");} 
}

class tiger extends SuperKeyword{
	 tiger(){
		 super();
		 System.out.println("Welcome to tiger ");
		 
	 }
	String color ="block";
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	
	void printColor(){  
		System.out.println(color); 
		System.out.println(super.color) ;
		eat();
		super.res();
		bark();
			
		}  
}
	class TestSuper1{  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger r =new tiger();  
		r.printColor();

	}

}

