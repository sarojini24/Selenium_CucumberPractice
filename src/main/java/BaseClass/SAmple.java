package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAmple {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\USER\\Desktop\\chromedriver.exe");
		// System.getProperty("user.dir")+"\\eclipse-workspace\\SAmplePR\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");fgdfgdffdgdf
	}
}
