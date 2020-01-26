package com.Basic;

public class Multiple_Inhe {
	void eat(){System.out.println("eating...");}  
	}  
	class cat extends Multiple_Inhe{  
	void bark(){System.out.println("barking...");}  
	}  
	class BabyDog extends cat{  
	void weep(){System.out.println("weeping...");}  
	
	}
	
	
	class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
		d.eat();  
		d.weep();  
		d.bark();  
		
	}

}
