package com.biFinterface.example;

import java.util.function.BiFunction;

//To calculate Monthly Salary with Employee and TimeSheet objects as input By using BiFunction

class Employee {
	int eno;
	String name;
	double dailyWage;

	public Employee(int eno, String name, double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
}

class Timesheet {
	int eno;
	int daays;

	public Timesheet(int eno, int daays) {
		this.eno = eno;
		this.daays = daays;
	}

}

public class BiFuntionEx3 {
	public static void main(String[] args) {
		BiFunction<Employee, Timesheet, Double> Fdata = (e, t) -> e.dailyWage * t.daays;
		Employee Edata = new Employee(1, "Yash", 1);
		Timesheet Tdata = new Timesheet(1, 2);
		System.out.println("Employee Monthly Salary:" + Fdata.apply(Edata, Tdata));
	}

}
