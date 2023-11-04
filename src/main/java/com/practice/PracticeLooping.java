package com.practice;

public class PracticeLooping {
	
	public void getPositiveLoop() {
		//Postive For loop
		//FORMULA ⇒ for(start;end;++) position = 0,1,2,3
		//Print the number from 0 to 100
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==30) {//condition
				break;
			}
		}
		
		//Negative for loop
		//FORMULA ⇒ for(end;start;--) position 3,2,1,0
		//Print the number from 100 to 0
		
		 for(int j=100;j>=0;j--) { System.out.println(j); }
		 
	}
	
	public static void main(String[] args) {
		PracticeLooping obj = new PracticeLooping();
		obj.getPositiveLoop();
	}

}
