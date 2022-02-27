package com.qa.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import main.java.com.qa.factory.DriverFactory;
import main.java.com.qa.pages.AccountsPage;
import main.java.com.qa.pages.LoginPage;
import main.java.com.qa.pages.ProductInfoPage;
import main.java.com.qa.pages.RegisterPage;
import main.java.com.qa.pages.ResultsPage;



public class BaseTest {

	WebDriver driver;
	DriverFactory df;
	Properties prop;

	LoginPage loginPage;
	AccountsPage accPage;
	RegisterPage regPage;
	ResultsPage resultsPage;
	ProductInfoPage productInfoPage;

	SoftAssert softAssert;

	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}