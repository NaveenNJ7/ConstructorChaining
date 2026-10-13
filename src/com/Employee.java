package com;

public class Employee {

	
	Employee(String name)
	{
		this();
		System.out.println("Name :"+name);
	}
	
	Employee(int id)
	{
		this("Navin");
		System.out.println("ID :"+id);
	}

	
	Employee(String Designation, int experience)
	{
		this(352);
		System.out.println("Designation :"+Designation+"\nExperience :"+experience);
	}

	Employee()
	{
		System.out.println("Employee details");
	}
	
	public static void main(String[] args) {
		
	   new Employee("Software tester", 3);
	   
	   
	}

}
