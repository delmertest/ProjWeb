package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextDocPage extends PageObject{

	private By docTitle = By.xpath("//input[@class='docs-title-input']");
	private By savedMessage = By.xpath("//div[contains(@class,'docs-title-save')][@id][@aria-disabled='false'][not(contains(text(),'...'))]");
	private By titleOuter = By.xpath("//div[@class='docs-title-outer docs-title-inline-rename']");
	
	
	public TextDocPage(WebDriver driver) {
		super(driver);
	}
	
	public void setTitleTimestamp(String value) {
		String newValue = value.replaceFirst("TIMESTAMP", getTimestamp());
		waitAndClick(docTitle);
		waitClearAndSet(docTitle, newValue);
		waitAndClick(titleOuter);
	}
	
	public boolean isSaved() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(savedMessage));
		return isElementDisplayed(savedMessage);
	}

}
