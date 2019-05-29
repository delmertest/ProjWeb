package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage extends PageObject{
	
	private By password = By.xpath("//input[@name='password']");
	private By nextButton = By.xpath("//span[contains(text(),'Next') or contains(text(),'Siguiente')]");

	public PasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public void setPassword(String value) {
		waitClearAndSet(password, value);
	}
	
	public void clickNext() {
		waitAndClick(nextButton);
	}

}
