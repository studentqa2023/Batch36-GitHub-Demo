package com.API.Testing.WithTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestDeleteWithTestNG {
	
	Response response;
	@Test
	public void testDelete() {
		response = RestAssured.delete("http://localhost:3000/posts/14");
		
		System.out.println("Status code="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	

}
