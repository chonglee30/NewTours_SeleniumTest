package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import newtour.config.ConfigProperties;
import newtour.config.SeleniumDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	protected WebDriver getDriver() {
		return SeleniumDriver.getInstance().getDriver();
	}
	
	protected SeleniumDriver getSeleuniumDriver() {
		return SeleniumDriver.getInstance();
	}
	
	@BeforeClass
	public void setupDriver() {		
		System.out.println("Set Up Driver");
		getSeleuniumDriver().startDriver(ConfigProperties.using().getBrowser());
		getDriver().get(ConfigProperties.using().getBaseUrl());
	}
	
	@AfterClass
	public void quitDriver() {
		System.out.println("Tear Down Driver");
		getSeleuniumDriver().cleanSeleniumSession();
		getDriver().quit();
	}

}