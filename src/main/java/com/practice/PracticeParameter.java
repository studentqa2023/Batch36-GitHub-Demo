package com.practice;

public class PracticeParameter {
	int x = 5;
	int y = 3;
	public void getNewYork() {//non-parameterized
		System.out.println(x+y);//8
	}
	
	public void getBoston() {//non-parameterized
		int x = 20;
		int y = 12;
		System.out.println(x+y);//32
	}
	
	public void getAtlanta(int x, int y, double e, boolean r, String h) {//parameterized
		
		System.out.println(x+y);
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		PracticeParameter obj = new PracticeParameter();
		
		obj.getNewYork();
		obj.getBoston();
//		obj.getAtlanta(100, 50);//150
//		obj.getAtlanta(75, 15);//90
		obj.getAtlanta(45, 15, 0, false, null);
		
	}

}
