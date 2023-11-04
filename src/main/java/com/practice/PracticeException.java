package com.practice;

public class PracticeException {
	
	public static void getFirstMethod() {
		System.out.println("This is the first method.");
	}
	//unchecked (runtime) exception
	public static void getSecondMethod() {
		int x = 5;
		try {
			System.out.println(x/0);//Error
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("This is finally block.");
		}
	}
	
	//checked (compile time exception)
	public static void voidgetCheckedException() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void getThirdMethod() {
		System.out.println("This is the third method.");
	}
	
	public static void main(String[] args) {
		getFirstMethod();
		getSecondMethod();
		getThirdMethod();
	}

}
