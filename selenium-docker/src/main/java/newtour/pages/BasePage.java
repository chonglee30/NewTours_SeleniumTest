package newtour.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	int WAIT_TIME = 30;
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, WAIT_TIME);
	}
	
	  public void click(By locator) {
	        find(locator).click();
	    }

	    public void click(WebElement element) {
	        element.click();
	    }
		
		public WebElement find(By locator) {
	        return driver.findElement(locator);
	    }
		
	    public void type(By inputLocator, String text) {
	        find(inputLocator).sendKeys(text);
	    }

	    public void type(WebElement input, String text) {
	        input.sendKeys(text);
	    }
	    
	    public boolean isDisplayed(By locator) {
	        try {
	           return find(locator).isDisplayed();
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
		
}