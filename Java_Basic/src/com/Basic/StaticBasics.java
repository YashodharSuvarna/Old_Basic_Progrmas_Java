package com.Basic;

public class StaticBasics {
	   int rollno;  
	   String name;  
	   static String college ="CMR Technical";
	   
	   static void change(){  
		     college = "CMR";  
		     }  
	   
	    StaticBasics(int r,String n){
	    	rollno=r;
	    	name=n;
	    }
	    static int cube(int x){  
	    	  return x*x*x;  
	    	  }  

	     void Display(){
	    	System.out.println(rollno+"  "+name+" "+college);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBasics.change();
		StaticBasics s= new StaticBasics(1234,"Yashodhar");
		s.Display();
		int result=StaticBasics.cube(5);  
		  System.out.println(result); 
}
}