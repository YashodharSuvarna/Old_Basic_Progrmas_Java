package com.lamda.example;

interface MyVehicle {
	
	
	public void square (int a); 
	
	
	
	default void print() {
		System.out.println("I am a vehicle!");
	}	
	 
	static void EnterValue(int a){
		System.out.println("Enter the   value "+a);
	}
	
}

public class DefaultmethodsEx2 implements MyVehicle{
	
	public static void main(String args[]) {
		DefaultmethodsEx2 Data = new DefaultmethodsEx2() ;
		MyVehicle.EnterValue(5);
		Data.print();
		Data.square(2);
	}

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println("Square of "+a+"is :"+a*a);
	}
}

		
		