package com.runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class AutomationLoginRunner {
	
	@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
			"json:target/cucumber.json",
			},

			features = { "src/test/resources/AutomationLogin.feature" }, 
			glue = { "com.stepdef" }, // package name
			monochrome = true, //remove all ?? & console will be easily readable
dryRun = true, //check feature file
strict = true //check stepdef
			// ,tags= {"@Function"}

	)

	public class LoginRunner extends AbstractTestNGCucumberTests {

		@BeforeTest
		public void setup() {
			// code
		}
	}


}
