package com.API.Testing.WithTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPostWithTestNG {
	
	@Test
	public void getPost() {
		//1st => add the test data = JsonObject class & addProperty()
		JsonObject json = new JsonObject();
		
		//json.addProperty("key", "value")
		json.addProperty("Name", "Maksura");
		json.addProperty("Profession", "QA Automation Engineer");
		json.addProperty("City", "New York");
		
		//2nd => RequestSpecifications and add data inside the body
		RequestSpecification rsf = RestAssured.given();
		rsf.header("Content-Type", "application/json");
		rsf.body(json.toString());//passing test data inside the message body in Josn format
		
		//3rd => pass the URL
		Response response = rsf.post("http://localhost:3000/posts");
		
		//4th => validate
		
		//Validate status code is 201
		System.out.println("Status code="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 201);
		
		//Validate response time is less than 2000 ms
		System.out.println("Response time (ms)="+response.getTime());
		Assert.assertTrue(response.getTime()<2000);
		
		//Validate the content type is application/json
		Assert.assertTrue(response.getContentType().contains("json"));
		
		//Validate response body is not null
		System.out.println("Is response null or not="+response.toString()!=null);
		
		//Validate the vaue is added to the server
		//Specific JSON attribute value or how to parse Json data
		JsonPath jp = response.jsonPath();
		
		Assert.assertEquals(jp.get("Name"), "Maksura");
		
	}
	

}
