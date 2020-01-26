package com.Basic;

public class TypePromotion_MethodOverload {

	void mult(int d,int e){
		System.out.println(d*e);
	}
	void mult(int d,int e,int f){
		System.out.println(d*e*f);
	}
}
class TypePromotion_overload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion_MethodOverload d = new TypePromotion_MethodOverload();
		d.mult(3, 3);
		d.mult(2, 2, 2);
	}

}
