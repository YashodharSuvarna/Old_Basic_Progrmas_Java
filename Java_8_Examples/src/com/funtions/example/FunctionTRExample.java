package com.funtions.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Employee1 {
	String name;
	int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Employee1(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class FunctionTRExample {
	public static void main(String args[]) {
		Function<Employee1, String> funcEmpToString = (Employee1 e) -> {
			return e.getName();
		};
		List<Employee1> Employee1List = Arrays.asList(new Employee1("Tom Jones", 45), new Employee1("Harry Major", 25),
				new Employee1("Ethan Hardy", 65), new Employee1("Nancy Smith", 15),
				new Employee1("Deborah Sprightly", 29));
		List<String> empNameList = convertEmpListToNamesList(Employee1List, funcEmpToString);
		empNameList.forEach(System.out::println);
	}

	public static List<String> convertEmpListToNamesList(List<Employee1> Employee1List,
			Function<Employee1, String> funcEmpToString) {
		List<String> empNameList = new ArrayList<String>();
		for (Employee1 emp : Employee1List) {
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
	}
}