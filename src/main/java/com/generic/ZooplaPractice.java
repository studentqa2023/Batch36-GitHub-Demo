package com.generic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaPractice {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void getLogin() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/house-prices/uk/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//click on Accept Cookies  Btn
		if(mpf.getAcceptCookiesBtn().size()>0) {
			
			//Explicit wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn().get(0)));
			
			mpf.getAcceptCookiesBtn().get(0).click();
			
		}
		
		//Click on Login
		mpf.getZooplaLoginBtn().click();
		
		//Enter email
		mpf.getZooplaEmail().sendKeys("rezwanislam@rocketmail.com");
		
		//Enter password
		mpf.getZooplaPassword().sendKeys("Boston2023!");
		
		//Click on Sign In btn
		mpf.getZooplaLoginBtn2().click();
		
	}
	
	public static void main(String[] args) {
		ZooplaPractice obj = new ZooplaPractice();
		obj.getLogin();
	}

}
