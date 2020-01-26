package com.Basic;

public class SuperKeywordusing_person {
	int no;
	String name;
	SuperKeywordusing_person(int no,String name){	
	 this.no=no;
	 this.name=name;
	}
}
	
	class  Empl extends SuperKeywordusing_person{
		float salary;
		Empl(int no,String name,float salary){
			super(no,name);
			this.salary=salary;
		}
	
	
	void dispaly(){
	  System.out.println(no+" "+name+" "+salary);
	}
	}



	class test5{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Empl x = new Empl(1,"yash",3434);
		x.dispaly();
		
	
	}
}

