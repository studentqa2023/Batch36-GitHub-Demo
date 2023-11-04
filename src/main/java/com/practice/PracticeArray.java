package com.practice;

import java.util.Arrays;

public class PracticeArray {
	
	int a = 2;//variable => cannot handle more than one value
	int[] b = {10, 20, 30, 50};//array (single dimensional array)
	int[] c = {2, 3, 5, 8};//array (single dimensional array)
	int[]  e = {45, 56, 34, 50};//array (single dimensional array)
	int[] h = {};//null
	int[] j = {2,3,3,4,4,5};//duplicate
	int[][] d = {b, c};//array (multi dimensional array)
	int[][] f = {b, c, e};//array (multi dimensional array)
	
	public void getArray() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(d));
		System.out.println(Arrays.deepToString(f));
	}
	
	public static void main(String[] args) {
		PracticeArray obj = new PracticeArray();
		obj.getArray();
	}

}
