package com;

public class Son extends Father {

	//implicit constructor chaining, super class constructor does not have arguments
	Son()
	{
		System.out.println("Son name cena");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
	}
}
