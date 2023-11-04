package com.practice;

public class PracticeDataTypes {
	//Instance variables
	int x = 5; //dataType variableName = value
	int y = 12;
	int z;
	double a = 3.14;
	double b;
	boolean c = true;
	boolean d;
	String p = "Smart Tech";
	String q;
	public void getInt() {//not a static method
		System.out.println(x);//5
		System.out.println(y);//12
		System.out.println(x+y);//17
		System.out.println(z);//default value = 0
		System.out.println(a);//3.14
		System.out.println(b);//default value = 0.0
		System.out.println(c);//true
		System.out.println(d);//default value = false
		System.out.println(p);//Smart Tech
		System.out.println(q);//default value = null
	}
	
	public void getLocalVariable() {//not a static method
		//Local variables
		int g = 58;
		int h = 10;
		System.out.println(g-h);//48
	}
	
	public static void main(String[] args) {
		PracticeDataTypes obj = new PracticeDataTypes();
		obj.getInt();
		obj.getLocalVariable();
	}

}
