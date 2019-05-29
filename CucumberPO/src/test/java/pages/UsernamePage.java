package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsernamePage extends PageObject{
	
	private By username = By.xpath("//input[@id='identifierId']");
	private By nextButton = By.xpath("//span[contains(text(),'Next') or contains(text(),'Siguiente')]");
	

	public UsernamePage(WebDriver driver) {
		super(driver);
	}
	
	public void setUsername(String value) {
		waitClearAndSet(username, value);
	}
	
	public void clickNext() {
		waitAndClick(nextButton);
	}

}
