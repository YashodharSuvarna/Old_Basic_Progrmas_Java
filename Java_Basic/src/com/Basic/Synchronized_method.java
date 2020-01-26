package com.Basic;

public class Synchronized_method {
			//void printTable(int n){
	 synchronized void printTable(int n){
				for(int i=1;i<=5;i++){
					System.out.println(n*i);
					try{
						Thread.sleep(500);
					}catch(Exception e){System.out.println(e);}
				}
			}
}
			
			class MyThread1 extends Thread{
				Synchronized_method m;  
				MyThread1(Synchronized_method m){  
				this.m=m;  
				}  
				public void run(){  
				m.printTable(5);  
				}  
			}
				
			class MyThread2 extends Thread{  
				Synchronized_method m;  
				MyThread2(Synchronized_method m){  
				this.m=m;  
				}  
				public void run(){  
				m.printTable(100);  
				}  
				}  

			
	class TestSynchronization1{  
	       public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Synchronized_method obj = new Synchronized_method();
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);
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

