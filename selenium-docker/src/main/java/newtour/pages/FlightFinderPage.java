package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightFinderPage extends BasePage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="findFlights")
	private WebElement btnContinueToSelectFlight;
	
	public FlightFinderPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	public SelectFlightPage goToSelectFlightPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.btnContinueToSelectFlight));
		btnContinueToSelectFlight.click();
		return new SelectFlightPage(driver, wait);
	}
	
	
}
