package newtour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FlightConfirmationPage extends BasePage {
	
	@FindBy(xpath = "//font[contains(text(), 'Confirmation')]")
    private WebElement flightConfirmationHeader;

    @FindBy(xpath = "//font[contains(text(), 'USD')]")
    private List<WebElement> prices;
	
	public FlightConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPrice() {
		this.wait.until(ExpectedConditions.visibilityOf(this.flightConfirmationHeader));
		String price = prices.get(1).getText();
		System.out.println("Price: "+price);
		return price;
	}
	
}
