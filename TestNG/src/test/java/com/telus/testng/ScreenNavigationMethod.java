package com.telus.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenNavigationMethod {

	public WebDriver driver;

	// All Input Value
	String url = "https://nxtgenaiacademy.com/";
	String applicationCloseInput = "Application Close ";

	//All The WebElement Path
	String qaAutomationPath = "QA AUTOMATION";
	String practAutomationPath = "Practice Automation";
	String regiFormPath = "Registration Form";
	String alertAndPopupPath = "Alert And Popup";
	String multipleWindowsPath = "Multiple Windows";
	String webTablePath = "WebTable";

	@BeforeMethod
	public void launchApplication () {
		// set the system property for chrome broswer
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		// Create the object for chrome drive
		driver = new ChromeDriver();

		// launch the Application
		driver.get(url);

		// maximize the application
		driver.manage().window().maximize();

		System.out.println("Application Is Launched SuccessFully");
	}

	@AfterMethod
	public void closeApplication () {

		// Close The Application
		driver.close();
		System.out.println(applicationCloseInput);
	}

	@Test(priority=1)
	public void navigateToRegistrationForm() {

		Actions action = new Actions(driver);

		// Hover Mouse above the QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Hover Mouse Action Performed For QA Automation Link ");

		// Hover Mouse above the Practice Automation
		WebElement practAutomation = driver.findElement(By.linkText(practAutomationPath));
		action.moveToElement(practAutomation).perform();
		System.out.println("Hover Mouse Action Performed For Practice Automation Link ");

		// Click On Demo Site- Registration Form
		WebElement regiForm = driver.findElement(By.partialLinkText(regiFormPath));
		action.moveToElement(regiForm).click().perform();
		System.out.println("Hover Mouse Action Performed For Demo Site- Registration Form Link ");
		System.out.println("---------------------------------------------------------------------");

	}

	@Test(priority=2)
	public void navigateToAlertAndPopup() {

		Actions action = new Actions(driver);

		// Hover Mouse above the QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Hover Mouse Action Performed For QA Automation Link ");

		// Hover Mouse above the Practice Automation
		WebElement practAutomation = driver.findElement(By.linkText(practAutomationPath));
		action.moveToElement(practAutomation).perform();
		System.out.println("Hover Mouse Action Performed For Practice Automation Link ");

		// Click On Demo Site – Alert and Popup
		WebElement alertAndPopup = driver.findElement(By.partialLinkText(alertAndPopupPath));
		action.moveToElement(alertAndPopup).click().perform();
		System.out.println("Hover Mouse Action Performed For Demo Site – Alert and Popup Link ");
		System.out.println("---------------------------------------------------------------------");

	}

	@Test(priority=3)
	public void navigateToMultipleWindows() {

		Actions action = new Actions(driver);

		// Hover Mouse above the QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Hover Mouse Action Performed For QA Automation Link ");

		// Hover Mouse above the Practice Automation
		WebElement practAutomation = driver.findElement(By.linkText(practAutomationPath));
		action.moveToElement(practAutomation).perform();
		System.out.println("Hover Mouse Action Performed For Practice Automation Link ");

		// Click On Demo Site – Alert and Popup
		WebElement multipleWindows = driver.findElement(By.partialLinkText(multipleWindowsPath));
		action.moveToElement(multipleWindows).click().perform();
		System.out.println("Hover Mouse Action Performed For Demo Site – Multiple Windows Link ");
		System.out.println("---------------------------------------------------------------------");

	}

	@Test(priority=4)
	public void navigateToWebTable() {

		Actions action = new Actions(driver);

		// Hover Mouse above the QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Hover Mouse Action Performed For QA Automation Link ");

		// Hover Mouse above the Practice Automation
		WebElement practAutomation = driver.findElement(By.linkText(practAutomationPath));
		action.moveToElement(practAutomation).perform();
		System.out.println("Hover Mouse Action Performed For Practice Automation Link ");

		// Click On Demo Site – Alert and Popup
		WebElement webTable = driver.findElement(By.partialLinkText(webTablePath));
		action.moveToElement(webTable).click().perform();
		System.out.println("Hover Mouse Action Performed For Demo Site – Web Table Link ");
		System.out.println("---------------------------------------------------------------------");

	}








}
