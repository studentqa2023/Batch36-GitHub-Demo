package com.testng.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass {
	
	@Test
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		
		//Headless/Ghost browser
		//ChromeOptions headlessChrome = new ChromeOptions();
		//headlessChrome.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Explicit wait (to wait until the Login btn in homepage is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginBtnHome()));
		
		//Highlight login btn in homepage
		Highlighter.addColor(driver, mpf.getLoginBtnHome());
		mpf.getLoginBtnHome().click();
		
		//Highlight emailfield
		Highlighter.addColor(driver, mpf.getEmailfield());
		mpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
		
		//Highlight password field
		Highlighter.addColor(driver, mpf.getPasswordfield());
		mpf.getPasswordfield().sendKeys(BaseConfig.getConfigValue("password"));
		
		//Highlight login btn in login page
		Highlighter.addColor(driver, mpf.getLoginbtn2());
		mpf.getLoginbtn2().click();
		
		Screenshot.getScreenShot(driver, "Homepage_AfterLogin");

}
}
