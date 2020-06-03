package com.predicate.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Java program to demonstrate working of predicates 
//on collection. The program finds all admins in an 
//arrayList of users. 
import java.util.function.Predicate;

class EmpUser {
	String uname, pwd;

	public EmpUser(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}

}

public class BasicPredicate2 {
	public static void main(String[] args) {
		Predicate<EmpUser> p = u -> u.uname.equals("Yash") && u.pwd.equals("pass");
		Scanner data = new Scanner(System.in);
		String uname = data.next();
		String pwd = data.next();
		EmpUser name = new EmpUser(uname, pwd);
		if (p.test(name)) {
			System.out.println("valid");
		} else {
			System.out.println("Not Voild");
		}
	}

}
