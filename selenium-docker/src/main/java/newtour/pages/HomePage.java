package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
	
	@FindBy(name="userName")
	private WebElement txtboxUsername;
	
	@FindBy(name="password")
	private WebElement txtboxPassword;
	
	@FindBy(name="login")
	private WebElement btnSignIn;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public FlightFinderPage submitUserCredentials(String username, String password) {
		wait.until(ExpectedConditions.elementToBeClickable(this.txtboxUsername));
		wait.until(ExpectedConditions.elementToBeClickable(this.txtboxPassword));
		
		type(txtboxUsername, username);
		type(txtboxPassword, password);
		click(btnSignIn);		
		return new FlightFinderPage(driver);
	}	
}