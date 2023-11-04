package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestng {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void crossBrowserCostco(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser opened="+browser);
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Browser opened="+browser);
		}
		else {
			System.out.println("Not found  any  browser");
		}
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Actions ac = new Actions(driver);
		
		ac.moveToElement(mpf.getServices()).perform();
		
	}

}
