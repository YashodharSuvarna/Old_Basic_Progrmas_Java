package com.Basic;

public class Wrapper_class {
	public static void main(String args[]){  
	{
	//Converting int to integer --autoboxing 
	int a=70;
	Integer i = Integer.valueOf(a);
	Integer j=a;

System.out.println("int to Integer "+a+" "+i+" "+j);  

Integer y =  new Integer(55);
int u=y.intValue();//Converting Integer to int
int x=y;

System.out.println("Interger to int "+y+" "+u+" "+x); 
}
	}
}

