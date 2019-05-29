package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class Hooks extends MainSteps{

	@Given("I open {string} in {string} browser")
	public void i_open_in_browser(String url, String browser) {
		driver = setDriver(browser);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@After()
	public void closeBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshot, "image/png");
		}
	    driver.quit();
	}
	

}
