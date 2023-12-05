package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.generic.MasterPageFactory;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	MasterPageFactory mpf;

	@Given("Open the browser")
	public void open_the_browser() {
		// Open the browser
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}

	@Given("pass the URL")
	public void pass_the_url() {
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
	}

	@When("Click on Login on Homepage")
	public void click_on_login_on_homepage() {
		mpf = new MasterPageFactory(driver);
		mpf.getLoginBtnHome().click();
	}

	@When("Enter email in the Email field")
	public void enter_email_in_the_email_field() {
		mpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
	}

	@When("Enter password in the Password field")
	public void enter_password_in_the_password_field() {
		mpf.getPasswordfield().sendKeys(BaseConfig.getConfigValue("password"));
	}

	@When("Click on Login")
	public void click_on_login() {
		mpf.getLoginbtn2().click();
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
		Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login successful");
	}
	
	@When("Enter {string} in the email field")
	public void enter_in_the_email_field(String email, io.cucumber.datatable.DataTable dataTable) {
	    mpf.getEmailfield().sendKeys(email);
	}

	@When("Enter {string} in the password field")
	public void enter_in_the_password_field(String password, io.cucumber.datatable.DataTable dataTable) {
	    mpf.getPasswordfield().sendKeys(password);
	}

}
