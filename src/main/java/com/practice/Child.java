package com.practice;

public class Child extends Parent {
	
	public static void main(String[] args) {
		//Instantiation
		//ClassName obj = new ClassName();
		
		//1st way
		//ParentClass obj = new ParentClass();
//		Parent obj = new Parent();
//		obj.getSum();
		
		//2nd way
		//ChildClass obj = new ChildClass();
//		Child obj2 = new Child();
//		obj2.getSum();
		
		//3rd way
		//ParentClass obj = new ChildClass();
		Parent obj = new Child();
		obj.getSum();
	}

}
