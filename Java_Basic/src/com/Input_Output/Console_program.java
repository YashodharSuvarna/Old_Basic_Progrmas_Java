package com.Input_Output;

import java.io.Console;

public class Console_program {
	public static void main(String args[]) throws NullPointerException{    
		
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n=c.readLine();    
		System.out.println("Welcome "+n);  
		}
	}


