package com.practice;

public class PracticeVariables {
	
	//Instance variable (aka Global variable) => inside the class but outside the method
	int a = 10;
	int b = 5;
	
	static int c = 50;//Instance static variable
	
	public void getVariables() {
		
		System.out.println(a+b);//15
		System.out.println(c);
	}
	
	public void getLocal() {
		int e = 25; //local variable
		int f = 15;
		System.out.println(e-f);//10
		System.out.println(a-b);
	}
	
	public static void getStaticVariable() {
		System.out.println(c);//50
	}
	
	public static void main(String[] args) {
		PracticeVariables obj = new PracticeVariables();
		
		obj.getVariables();
		obj.getLocal();
		getStaticVariable();
	}

}
