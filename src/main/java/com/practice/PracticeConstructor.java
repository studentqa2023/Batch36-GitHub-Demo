package com.practice;

public class PracticeConstructor {
	
	public void getMoney() {//a typical void method
		
	}
	int a = 5;//instance variable
	int b = 3;
	//Constructor
	//Method like structure
	//Name should be the same as the class name
	//It should not be return type or void
	
	public PracticeConstructor(int c, int d) {//constructor
		this.a=c;
		this.b=d;
		System.out.println(c+d);
	}

}
