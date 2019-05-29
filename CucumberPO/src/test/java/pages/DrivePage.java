package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DrivePage extends PageObject{

	private By newButton = By.xpath("//button[@role='button'][@aria-label='New'][@aria-disabled='false']");
	private By docsLink = By.xpath("//div[contains(text(),'Google Docs')]");
	

	public DrivePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickNew() {
		waitAndClick(newButton);
	}
	
	public void clickDocs() {
		waitAndClick(docsLink);
	}

}
