package com.practice;

public class Parent {
	
	static int x = 5;
	static int y = 2;
		
	
	public void getSum() {//non-static method
		System.out.println(x+y);//7
	}
	
	protected static void getSubtract() {
		final int a = 10;
		final int b = 5;
		
		System.out.println(a-b);//3
	}
	
	

}
