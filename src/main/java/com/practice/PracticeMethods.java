package com.practice;

public class PracticeMethods {
	static int a = 10;
	//Non-static void method (non-return method)
	public void getVoidMethod() {//not static method
		System.out.println("This is non-static void method.");
	}
	
	//Static void method (not returning anything)
	public static void getStaticVoid() {//static
		System.out.println("This is a static void method.");
	}
	
	//Return (No-void) & non-static method
	public  String getReturnMethod() {//not static method
		System.out.println("This is a non-static return method.");
		return "smarttech";
	}
	
	//Static return method (no void)
	public static int getStaticReturnMethod() {//static method
		System.out.println("This is a static return method.");
		return 5;
	}
	
	//Static return method (no void)
	public static double getCash() {//static
		System.out.println("This is static return method with double data type.");
		return 5.67; //double
	}
	//Static return method (no void)
	public static  int getInt() {
		
		return a;
	}
	
	
	public static void main(String[] args) {
		//Instantiation => create an object
		PracticeMethods obj = new PracticeMethods();
		
		obj.getVoidMethod();
		getStaticVoid();
		obj.getReturnMethod();
		getStaticReturnMethod();
		getCash();
	}
	
}
