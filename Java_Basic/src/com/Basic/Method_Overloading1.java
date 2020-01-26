package com.Basic;

public class Method_Overloading1 {
	static int  add(int a,int b){
		return a+b;
		//System.out.println(a+b);
	}
	
	static int add(int a,int b,int c){
		return a+b+c;
	}
	static double add(double a, double b){
		return a+b;
		}  
}
	
	class testoverload{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(Method_Overloading1.add(1,43));
		System.out.println(Method_Overloading1.add(23,43,67));
		System.out.println(Method_Overloading1.add(23.3,34.2));
	}

	}
