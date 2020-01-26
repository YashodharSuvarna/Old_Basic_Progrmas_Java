package com.Basic;

public class Constructor {
	//Defalut values 
	int no;
	String name;
	///Default
	Constructor(){
		System.out.println("Default Construcor");
			}
	//parametarize constructor
	Constructor(int a,String na)
	{
		no=a;
		name=na;
	}
	void display() { System.out.println(no+"  " +name); }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c= new Constructor();
		
		Constructor c1= new Constructor(127,"Yashodhar");
		
		c.display();
		
		c1.display();
	}

}
