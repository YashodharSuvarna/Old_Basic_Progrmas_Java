package com.Basic;
import java.io.IOException;  

public class Throw_Throws {
	  
		 void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  

	/*void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	 /*void valid(int age){		//throw
	if(age<18){
		throw new ArithmeticException("not valid");  
	}
	else
	{
		System.out.println("Welcome to the vote");
	}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Throw_Throws b = new Throw_Throws();
		//b.valid(32);
		 b.method();
		//b.p();  
		 System.out.println("normal flow...");  

	}

}
