package com.practice;

public abstract class PracticeAbstractClass {//can handle both abstract & non-abstract methods

	public abstract void hour();//no method body or {}
	
	public void myCat() {//method body
		System.out.println("This is myCat method().");
	}
	
	//Abstract method => abstract keyword + no method body {}
	public abstract void getAbstract();
}
