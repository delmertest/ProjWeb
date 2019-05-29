package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject{
	
	private By googleApps = By.xpath("//a[@title='Google Apps']");
	private By driveIcon = By.xpath("//span[contains(text(),'Drive')]/..");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickApps() {
		waitAndClick(googleApps);
	}
	
	public void openDrive() {
		waitAndClick(driveIcon);
	}

}
