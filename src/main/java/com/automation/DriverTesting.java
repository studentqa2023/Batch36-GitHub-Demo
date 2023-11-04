package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTesting {
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
		
		driver.findElement(By.xpath("(//*[contains(text(), 'Login')])[4]")).click();
		
		//driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		DriverTesting obj = new DriverTesting();
		
		obj.getDriver();
	}

}
