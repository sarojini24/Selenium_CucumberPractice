package StepDefinition;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

	private TakesScreenshot driver;

	public void addScreenshot (Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot,"image/png","image");
		}
		
	}

}
