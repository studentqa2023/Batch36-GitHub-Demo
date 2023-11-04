package com.practice;

public class PracticeWrapperClass {
	int a = 5;//dataType variable = value;
	public void getRed() {
		System.out.println("This is getRed() method.");
	}
	
	Integer i = 5;
	public static void main(String[] args) {
		//PracticeWrapperClass obj = new PracticeWrapperClass();
		//ClassName obj = new ClassName();
		//dataType variable = value;
		new PracticeWrapperClass().getRed();
		//obj.getRed();
		
	}

}
