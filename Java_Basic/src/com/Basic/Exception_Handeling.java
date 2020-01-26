package com.Basic;

public class Exception_Handeling {       //Throw Example
	
	static void valid(int age){
		if(age<18){
			throw new ArithmeticException("not valid"); 
				}
		else
		{
			System.out.println("Age is Valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
	/*	try{
			int a= 50/0;					//Single Try- catch
		
		}catch(ArithmeticException a){
			System.out.println(a);
		}
		System.out.println("Output of Data:-");
			
		try{							//multiple catch excetion
			 
			  int a[]=new int[5];  
			   a[5]=30/4;
		}
		catch (ArithmeticException q){
			System.out.println("Arthamatic Exception");}
		
		catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		 
		catch(Exception e){System.out.println("common task completed");} 
		
		 try{  									//Nested Try
			    try{  
			     System.out.println("going to divide");  
			     int b =39/0;  
			    }catch(ArithmeticException e){System.out.println(e);}  
			   
			    try{  
			    int a[]=new int[5];  
			    a[5]=4;  
			    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  	     
			      
			  }catch(Exception e){System.out.println("handeled");}  
		  
		System.out.println("Next please.........");
		
		try{  
			   int data=25/5;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){System.out.println(e);}  
			  finally{System.out.println("finally block is always executed");}  
			  System.out.println("rest of the code...");*/
		valid(13);
		valid(23);
		System.out.println("Welcome to my world....");

				
		
		
		}
	}


