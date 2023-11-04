package com.practice;

public class PracticeReverse {
	
	
	//Print "Unites States of America" backward.
	//1st option: using negative for loop
	public static void getStringReverse(String name) {
		System.out.println(name.length());//total number of characters
		
		for(int i=(name.length()-1);i>=0;i--) {//for(end;start;--)
			System.out.print(name.charAt(i));
		}
	}
	
	//2nd option: Using StringBuilder or StringBuffer
	public void getReverseWithStringBuilder(String country) {
		StringBuilder sb = new StringBuilder(country);
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		//getStringReverse("United States of America");
		PracticeReverse obj = new PracticeReverse();
		obj.getReverseWithStringBuilder("United States of America");
	}
}
