package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DriveInfoPage;
import pages.DrivePage;
import pages.HomePage;
import pages.PasswordPage;
import pages.TextDocPage;
import pages.UsernamePage;

public class GDriveSteps extends MainSteps{
	
	private HomePage homePage;
	private DriveInfoPage driveInfoPage;
	private UsernamePage usernamePage;
	private PasswordPage passwordPage;
	private DrivePage drivePage;
	private TextDocPage textDocPage;
	
	
	@When("I go to Drive page")
	public void i_go_to_Drive_page() {
		homePage = new HomePage(driver);
		homePage.clickApps();
		homePage.openDrive();
		
		driveInfoPage = new DriveInfoPage(driver);
		driveInfoPage.clickGoToButton();
	}

	@When("I login to google with user {string} and password {string}")
	public void i_login_to_google_with_user_and_password(String string, String string2) {
		usernamePage = new UsernamePage(driver);
		usernamePage.setUsername(string);
		usernamePage.clickNext();
		
		passwordPage = new PasswordPage(driver);
		passwordPage.setPassword(string2);
		passwordPage.clickNext();
	}

	@When("I create a new text document with name {string}")
	public void i_create_a_new_text_document_with_name(String string) {
		drivePage = new DrivePage(driver);
		drivePage.clickNew();
		drivePage.clickDocs();
		
		textDocPage = new TextDocPage(driver);
		textDocPage.switchToLastPage();
		textDocPage.setTitleTimestamp(string);
	}

	@Then("I verify that document was saved")
	public void i_verify_that_document_was_saved() {
		assertTrue("Documento no grabado", textDocPage.isSaved());
	}

}
