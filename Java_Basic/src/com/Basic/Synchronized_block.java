package com.Basic;

public class Synchronized_block {
	  void printTable(int n){
		  synchronized(this){
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(500);
				}catch(Exception e){System.out.println(e);}
			}
		}
	  }
}
		
		class MyThread3 extends Thread{
			Synchronized_block m;  
			MyThread3(Synchronized_block m){  
			this.m=m;  
			}  
			public void run(){  
			m.printTable(5);  
			}  
		}
			
		class MyThread4 extends Thread{  
			Synchronized_block m;  
			MyThread4(Synchronized_block m){  
			this.m=m;  
			}  
			public void run(){  
			m.printTable(100);  
			}  
			}  

		
class TestSynchronization2{  
    public static void main(String[] args) {
	// TODO Auto-generated method stub
 Synchronized_block obj = new Synchronized_block();
	MyThread3 t1=new MyThread3(obj);  
	MyThread4 t2=new MyThread4(obj);
	/*
	 * final Table obj = new Table();//only one object  

 	Thread t1=new Thread(){  
public void run(){  
obj.printTable(5);  
}  
};  
Thread t2=new Thread(){  
public void run(){  
obj.printTable(100);  
}  
};  
	 */
	t1.start();  
	t2.start();  
	}  
}


