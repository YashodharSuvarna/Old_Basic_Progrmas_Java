package com.Basic;

public class Hierarchical_Inheri {
	void eat(){System.out.println("eating...");}  
	}  
	class Goat extends  Hierarchical_Inheri{  
	void bark(){System.out.println("barking...");}  
	}  
	class lion extends  Hierarchical_Inheri{  
	void meow(){System.out.println("meowing...");}  
	}  
	class Test3{  
	public static void main(String args[]){  
	lion c=new lion();  
	c.meow();  
	c.eat();  
	 
	}}  
