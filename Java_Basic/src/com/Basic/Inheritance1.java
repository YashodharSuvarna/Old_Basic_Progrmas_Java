package com.Basic;

public class Inheritance1 {
		
	float salary=4000;
	
}

class  Another extends Inheritance1 {
	  int  bounas=1000;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Another s1 = new Another();
		System.out.println("Main salary    "+s1.salary);
	    System.out.println(" bounas salary    "+s1.bounas);
	}

}
