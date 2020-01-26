package com.Basic;

//public class multi_Threading extends Thread {	//using extending thread classs
public class multi_Threading implements Runnable {
	public void run(){  
		//System.out.println("thread is running... using thread  class"); 
		System.out.println("thread is running... using Runnable interface");  

		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi_Threading  t1 = new multi_Threading ();
		Thread t2 = new Thread(t1);
		t2.run();
	}

}
