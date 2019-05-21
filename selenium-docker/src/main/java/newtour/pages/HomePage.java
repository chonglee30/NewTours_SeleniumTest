package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="userName")
	private WebElement txtboxUsername;
	
	@FindBy(name="password")
	private WebElement txtboxPassword;
	
	@FindBy(name="login")
	private WebElement btnSignIn;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	public FlightFinderPage submitUserCredentials(String username, String password) {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.txtboxUsername));
		this.wait.until(ExpectedConditions.elementToBeClickable(this.txtboxPassword));
		
		txtboxUsername.sendKeys(username);
		txtboxPassword.sendKeys(password);
		btnSignIn.click();
		return new FlightFinderPage(driver);
	}	
}