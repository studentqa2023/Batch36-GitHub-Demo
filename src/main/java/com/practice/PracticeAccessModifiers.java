package com.practice;

public class PracticeAccessModifiers {
	
	public static void getPublic() {
		System.out.println("This is public access modifier.");
			
	}
	
	protected static void getProtected() {
		System.out.println("This is protected access modifier.");
	}
	
	static void getDefault() {//Default access modifier
		System.out.println("This is default access modifier.");
	}
	
	public int a = 125;

}
