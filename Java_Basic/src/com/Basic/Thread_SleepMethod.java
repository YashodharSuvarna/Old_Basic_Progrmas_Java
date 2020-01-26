package com.Basic;

public class Thread_SleepMethod extends Thread {
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);
		    }catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    
		    System.out.println(i);
		    } 
		  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_SleepMethod t1 = new Thread_SleepMethod();
		Thread_SleepMethod t2 = new Thread_SleepMethod();
		t1.start();
		t2.start();
	}

}
