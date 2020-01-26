package com.Basic;

public class Local_Inner_class {
	private int  data1=80;
	void display(){
		class local{
			void msg(){
				System.out.println("Data print is "+data1);
			}
			
		}
		local m6 =new local();
		m6.msg();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Local_Inner_class n2 =  new  Local_Inner_class();
		 n2.display();

	}

}
