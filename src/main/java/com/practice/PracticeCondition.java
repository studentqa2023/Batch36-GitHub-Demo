package com.practice;

public class PracticeCondition {
	
	
	public void getCondition(String name) {
		
		if(name.contains("Rez")) {
			System.out.println("Match found.");
		}
		else {
			System.out.println("No match found.");
		}
		
	}
	
	public void getCondition(int a) {//overloading
		if(a>=18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
	}
	
	public void getCondition2(int x) {
		if(x>=60) {
			System.out.println("Person is over 60 years old.");
		}
		else if(x==40) {
			System.out.println("Person is middle age");
		}
		
		else if(x<=18) {
			System.out.println("Person is minor.");
		}
		
		else {
			System.out.println("Age not found.");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PracticeCondition obj = new PracticeCondition();
		obj.getCondition("Rezwan");//Match found
		obj.getCondition("Ullah");
		obj.getCondition("Ahmed");
		
		obj.getCondition(35);
		obj.getCondition2(34);

	}

}
