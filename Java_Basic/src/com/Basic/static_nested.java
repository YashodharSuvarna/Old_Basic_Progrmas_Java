package com.Basic;

public class static_nested {
	static int data=60;
	static class Inner{
		//void msg(){System.out.println("Data:-"+data);}
		static void msg(){System.out.println("Data:=  "+data);}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static_nested.Inner obj1= new static_nested.Inner();
		static_nested.Inner.msg();
		//obj1.msg();
	}

}
