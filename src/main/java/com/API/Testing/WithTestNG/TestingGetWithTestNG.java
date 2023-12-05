package com.API.Testing.WithTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGetWithTestNG {
	
	Response response;
	@BeforeTest
	public void getSetup() {
		response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
	}
	
	@Test
	public void getStatusCode() {
		System.out.println("Status code="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
	public void getContainType() {
		System.out.println("Data format="+response.getContentType());
		Assert.assertEquals(response.getContentType(), "application/json");
	}
	@Test
	public void getResponseTime() {
		System.out.println("Response time (ms)="+response.getTime());
		Assert.assertTrue(response.getTime()<2000);
	}
	@Test
	public void getResponseNullOrNot() {
		
		System.out.println("Is response null or not="+response.toString()!=null);
	}
	@AfterTest
	public void tearDown() {
		//code
	}

}
