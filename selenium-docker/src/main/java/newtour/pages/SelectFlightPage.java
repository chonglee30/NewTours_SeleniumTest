package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFlightPage extends BasePage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="reserveFlights")
	private WebElement btnContinueReserveFlights;
	
	public SelectFlightPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, WAIT_TIME);
		PageFactory.initElements(driver, this);
	}

	public BookFlightPage goToBookFlightPage() {
		this.wait.until(ExpectedConditions.elementToBeClickable(btnContinueReserveFlights));
		btnContinueReserveFlights.click();
		return new BookFlightPage(driver);
	}
	
	
}
