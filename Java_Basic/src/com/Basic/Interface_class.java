package com.Basic;

interface Interface_class {			//Multilevel inheritance
	void run();
	}

interface Showtable {
	void runnig();
}

class Shopping implements  Interface_class,Showtable{
 public void run(){
	 System.out.println("Welcome to mall with famly");
 }
 public void runnig(){
	 System.out.println("Running with shoes ");
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping as = new Shopping();
		as.run();
		as.runnig();
 }
}



