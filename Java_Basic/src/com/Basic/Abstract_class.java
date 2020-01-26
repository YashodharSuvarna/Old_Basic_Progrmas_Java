package com.Basic;

abstract class Abstract_class {
	Abstract_class(){
		System.out.println("bike is created");
		}  
	abstract void run();
	void changeGear(){
		System.out.println("gear changed full");
	}
}

class Tvs extends Abstract_class{
	void run(){
		System.out.println("Ridding with Tvs Safely ...");
	}
}

class Honda extends Abstract_class {
		void run(){
			System.out.print("Ridding with Honda Safely...");
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_class  n2 =  new Tvs();
		n2.run();
		n2.changeGear();

	}

}
