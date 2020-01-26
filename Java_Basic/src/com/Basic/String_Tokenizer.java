package com.Basic;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer x1 =  new StringTokenizer("My name is S.Yashodhar"," ");
		while(x1.hasMoreTokens()){
			System.out.println(x1.nextToken());
			System.out.println("Next Count Tokens is  is : " + x1.countTokens());  

		}
		
		StringTokenizer x2 =  new StringTokenizer("My name is ,S.Yashodhar ");
		   
		System.out.println("Next token is : " + x2.nextToken(","));  
		System.out.println("Next Element is  is : " + x2.nextElement());  
		System.out.println("Next HasmoreTokens is  is : " + x2.hasMoreTokens());  
		System.out.println("Next HasmoreElement is  is : " + x2.hasMoreElements());  
		//System.out.println("Next Count Tokens is  is : " + x2.countTokens());  

		 
		}
			
		
		

	 
}
