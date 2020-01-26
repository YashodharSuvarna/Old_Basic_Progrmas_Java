package com.Basic;

public class Instance_initializer_block {
   int speed;
   Instance_initializer_block(){
	 System.out.println("Speed is  "  +speed);  
	 System.out.println("Print the Instance");
   }

   {speed = 100;}
   { System.out.println("Print block");}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_initializer_block l = new Instance_initializer_block();
		//Instance_initializer_block n1 = new Instance_initializer_block();
		

	}

}
