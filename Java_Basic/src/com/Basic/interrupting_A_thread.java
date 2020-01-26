package com.Basic;

public class interrupting_A_thread extends Thread {

	public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException p6){  
		throw new RuntimeException("Thread interrupted..."+p6);  
		}  
		  
		}  
		  
		public static void main(String args[]){  
			interrupting_A_thread o1=new interrupting_A_thread();  
		o1.start();  
		try{  
		o1.interrupt();  
		}catch(Exception p6){System.out.println("Exception handled "+p6);}  
		  
		}

		 
			
		}  
		  
