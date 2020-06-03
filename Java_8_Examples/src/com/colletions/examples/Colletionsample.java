package com.colletions.examples;

import java.util.ArrayList;


class Employee1 {
	String uname;
	String city;
	int age;

	public Employee1(String uname, String city, int age) {
		this.uname = uname;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [uname=" + uname + ", city=" + city + ", age=" + age + "]";
	}	
}

public class Colletionsample {
	
	public static void main(String[] args) {
		ArrayList<Employee1> list1 = new ArrayList<Employee1>();
		papulate(list1);
		for(Employee1 data : list1){
			System.out.println(data);
		}
		
	}
	private static void papulate(ArrayList<Employee1> list) {
		list.add(new Employee1("Durga", "Hyderabad", 23));
		list.add(new Employee1("Sunny", "Hyderabad", 50));
		list.add(new Employee1("Mallika", "Bangalore", 2));
		list.add(new Employee1("Kareena", "Hyderabad", 65));
		list.add(new Employee1("Katrina", "Bangalore", 32));
		list.add(new Employee1("Anushka", "Hyderabad", 23));
		list.add(new Employee1("Kanushka", "Hyderabad", 12));
		list.add(new Employee1("Sowmya", "Bangalore", 16));

	}
		
	}

	

