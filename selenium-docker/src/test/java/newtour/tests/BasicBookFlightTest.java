package newtour.tests;

import com.tests.BaseTest;

import newtour.config.ConfigProperties;
import newtour.pages.*;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicBookFlightTest extends BaseTest {

	@Test
	public void defaultBookFlightTest() {
		
		String username = ConfigProperties.using().getUsername();
		String password = ConfigProperties.using().getPassword();
		String expectedPrice = "$584 USD";
		
		HomePage homepage = new HomePage(getDriver());
		FlightFinderPage flightFinderPage = homepage.submitUserCredentials(username, password);
		SelectFlightPage selectFlightPage = flightFinderPage.goToSelectFlightPage();
		BookFlightPage bookFlightPage = selectFlightPage.goToBookFlightPage();
		FlightConfirmationPage flightConfirmationPage = bookFlightPage.purchaseFlight();
		
		String actualPrice = flightConfirmationPage.getPrice();
		Assert.assertEquals(actualPrice, expectedPrice);
		
	}
	
	
}
