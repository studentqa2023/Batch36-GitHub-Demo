package com.practice;

public class Human {
	
	public void getMoney() {//not static method
		System.out.println("Hi!");
	}
	
	public static void getEuro() {//static method => class level => no need to create object
		System.out.println("This is static getEuro().");
	}
	
	
	public static void main(String[] args) {
		//How to call a method inside the main method
		//Is the method static or not? => Not static
		//Formula: ClassName objectName = new ClassName();
		Human obj = new Human();
		obj.getMoney();
		
		getEuro();
	}

} 
