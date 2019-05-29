package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriveInfoPage extends PageObject{
	
	private By goToButton = By.xpath("(//h1/following-sibling::a[contains(@class,'go-to-drive')])[1]");

	public DriveInfoPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickGoToButton() {
		waitAndClick(goToButton);
	}

}
