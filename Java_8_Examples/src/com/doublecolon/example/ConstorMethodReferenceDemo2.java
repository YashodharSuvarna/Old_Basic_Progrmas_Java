package com.doublecolon.example;

class Employee {
    private String name;
    
    Employee() {
        System.out.println("Empty Constructor");
    }
  
    Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }
  
    public String toString() {
        return "name: " + name;
    }
}


interface EmployeeEmpty {
    Employee get();
}
interface EmployeeWithName {
    Employee get(String name);
}


public interface ConstorMethodReferenceDemo2 {
	
	public static void main(String[] args) {
		
		
		EmployeeEmpty emp = () -> new Employee();
		System.out.println(emp.get());
		
		EmployeeEmpty empEmpty = Employee::new;
		EmployeeWithName empWithName = Employee::new;
		System.out.println("Constructor isn't called yet");
        System.out.println(empEmpty.get());
	    System.out.println(empWithName.get("Java"));


	
	}
}

