package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\hp\\eclipse-workspace\\Cucumber\\Cucucmberhybride\\src\\test\\resources\\com\\features"},
		glue = {"stepdefinitions", "AppHooks"},
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"},
		dryRun = false
        )

public class MyTestRunner {

}
