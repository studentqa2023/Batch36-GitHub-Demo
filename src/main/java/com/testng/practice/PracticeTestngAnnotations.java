package com.testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestngAnnotations {
	
	@Test
	public void test() {
		System.out.println("This is @Test");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is @beforetest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @beforeMethod");
	}
	
	@AfterTest
	public void aftertestMethod() {
		System.out.println("This is @AfterTest");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("This is @AfterSuite");
	}

}
