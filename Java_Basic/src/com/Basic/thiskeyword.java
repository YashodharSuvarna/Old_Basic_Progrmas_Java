package com.Basic;

public class thiskeyword {
	int rollno;  
	String name;  
	float fee;
	thiskeyword(){
		System.out.println("Hellow world");
	}
	thiskeyword(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee; 
	}
	
	//"This" keyword is not  required this place
	/*thiskeyword(int r,String n,float f){  
 	rollno=r;  
    name=n;  
    fee=f;  */
	
	void m(){System.out.println("hello m");}  
	void n(){  
		this.m(); 
	System.out.println("hello n");  
	//m();//same as this.m()  
	 
	 	}  
	
	 
	thiskeyword(int x){  
	this();  
	System.out.println(x); 
	}
	
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword s1 = new  thiskeyword(111,"yas",507f);  
		thiskeyword s2 = new  thiskeyword(112,"ram",655f); 
		thiskeyword s3 = new  thiskeyword();
		thiskeyword s4 = new  thiskeyword(403);
		s1.display();  
		s2.display(); 
		s3.n();
		
		
	}

}
