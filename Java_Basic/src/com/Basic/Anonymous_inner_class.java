package com.Basic;

/*abstract class Anonymous_inner_class {
	abstract void eat();
}*/
interface Anonymous_inner_class{
	void eat();
}
class TestAn{
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Anonymous_inner_class p = new Anonymous_inner_class(){
 			public void eat(){System.out.println("Welcome to my World...");}
 		};
 		p.eat();
 		

	}

}
