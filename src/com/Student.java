package com;

public class Student extends College {

	
	Student(String name)
	{
		super("BEC");
		System.out.println("Name :"+name);
	}
	
	Student(int id)
	{
		this("Mayur");
		System.out.println("ID :"+id);
	}
}
