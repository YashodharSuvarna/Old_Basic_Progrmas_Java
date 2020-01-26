package com.collection;
import java.util.ArrayList;
public class For_Each_Ex {
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);	
		a.add(500);
		a.add(600);
		
		 
		
		 
		for(int i:a){
			System.out.println(i);
		}
		
	}
}
