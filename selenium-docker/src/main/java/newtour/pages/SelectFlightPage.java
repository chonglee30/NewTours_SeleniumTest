package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectFlightPage extends BasePage {
	
	@FindBy(name="reserveFlights")
	private WebElement btnContinueReserveFlights;
	
	public SelectFlightPage(WebDriver driver) {
		super(driver);
	}

	public BookFlightPage goToBookFlightPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(btnContinueReserveFlights));
		click(btnContinueReserveFlights);
		return new BookFlightPage(driver);
	}
	
	
}
