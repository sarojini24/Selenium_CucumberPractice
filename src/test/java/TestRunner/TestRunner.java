package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin =
{"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\test\\resources\\features", 
glue = "StepDefinition", 
dryRun = false,
monochrome = true, 
strict = true)

public class TestRunner {

}

