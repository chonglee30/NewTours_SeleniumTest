package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightFinderPage extends BasePage {
	
	@FindBy(name="findFlights")
	private WebElement btnContinueToSelectFlight;
	
	public FlightFinderPage(WebDriver driver) {
		super(driver);
	}
	
	public SelectFlightPage goToSelectFlightPage() {
		wait.until(ExpectedConditions.elementToBeClickable(this.btnContinueToSelectFlight));
		click(btnContinueToSelectFlight);
		return new SelectFlightPage(driver);
	}
	
	
}
