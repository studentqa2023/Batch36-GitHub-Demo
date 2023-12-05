package com.API.Testing.WithTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPatchWithtestNG {
	
	@Test
	public void testPatch() {
		//1st => add the test data = JsonObject class & addProperty()
		JsonObject json = new JsonObject();
		
		//json.addProperty("key", "value")
		
		json.addProperty("City", "Orlando");
		
		//2nd => RequestSpecifications and add data inside the body
		RequestSpecification rsf = RestAssured.given();
		rsf.header("Content-Type", "application/json");
		rsf.body(json.toString());//passing test data inside the message body in Josn format
		
		//3rd => pass the URL
		Response response = rsf.patch("http://localhost:3000/posts/30");
		
		//4th => validate
		
		//Validate status code is 200
		System.out.println("Status code="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	

}
