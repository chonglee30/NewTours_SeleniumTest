package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookFlightPage extends BasePage {
	
	@FindBy(name="buyFlights")
	WebElement btnSecurePurchase;
	
	public BookFlightPage(WebDriver driver) {
		super(driver);
	}
	
	public FlightConfirmationPage purchaseFlight() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSecurePurchase));
		click(btnSecurePurchase);
		return new FlightConfirmationPage(driver);
	}
	
}