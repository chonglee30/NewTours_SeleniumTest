package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFlightPage extends BasePage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="buyFlights")
	WebElement btnSecurePurchase;
	
	public BookFlightPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	public FlightConfirmationPage purchaseFlight() {
		this.wait.until(ExpectedConditions.elementToBeClickable(btnSecurePurchase));
		btnSecurePurchase.click();
		return new FlightConfirmationPage(driver);
	}
	
}