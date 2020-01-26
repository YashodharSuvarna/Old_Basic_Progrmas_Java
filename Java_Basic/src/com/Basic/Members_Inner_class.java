package com.Basic;

public class Members_Inner_class {
	private int data= 40;
	class Inner{
		void msg(){System.out.println("Data:=  "+data);}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Members_Inner_class a = new Members_Inner_class();
		Members_Inner_class.Inner obj = a.new Inner();//Members
		obj.msg();
		

	}

}
