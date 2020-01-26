package com.Basic;

public class Thread_join_Name extends Thread {
	/*public void run(){
		System.out.println("Man ");
	}*/
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
	/*public void run(){
		 for(int i=1;i<=5;i++){
			   try{
			    Thread.sleep(500);
			   }catch(Exception e){System.out.println(e);}
			  System.out.println(i);
			  }
		 
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_join_Name e1 = new Thread_join_Name();
		Thread_join_Name e2 = new Thread_join_Name();
	Thread_join_Name e3 = new Thread_join_Name();
	  e1.setPriority(Thread.NORM_PRIORITY); 
		/*e4.start();{
			try{  
				  //e.join();  
				e4.join(1500);
				 }catch(Exception t){System.out.println(t);} */
		
		  /* System.out.println("Name of e1:"+e1.getName());  
			  System.out.println("Name of e2:"+e2.getName());
			  System.out.println("Name of e2:"+e3.getName());
			  System.out.println("id of e1:"+e1.getId());*/  
			
			  e1.start();
			  e2.start();
			  e3.start();
			  
			/*  e1.setName("Wexos");  
			  System.out.println("After changing name of e1:"+e1.getName());
			  e2.setName("Yashodhar");
			  System.out.println("After changing name of e2:"+e2.getName());

			*/
				  
		}
		

	}


