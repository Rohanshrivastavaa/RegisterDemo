package com.telus.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterUserDemo {

	public WebDriver driver;

	// All Input Value
	String url = "https://nxtgenaiacademy.com/";
	String registrationFormInput = "Demo Site - Registration Form Is Displayed";
	String formTitleInput = "Register For Demo";
	String firstNameInput = "Rohan";
	String lastNameInput = "Shrivastava";
	String genderInput = "Male";
	String addressInput = "Shinde Ki Chhawani";
	String streetAddressInput = "Near DD Mall";
	String cityInput = "Gwalior";
	String stateInput = "Madhya Pradesh";
	String pinCodeInput = "474001";
	String countryInput = "India";
	String emailInput = "Rohan@gmail.com";
	String dateOfDemoInput = "27/07/2022";
	String convenientTimeHhInput = "02";
	String convenientTimeMmInput = "30";
	String mobileNumberInput = "9865326598";
	String courseInterestedInputUft = "UFT";
	String courseInterestedInputTextNg = "TextNG";
	String YourQueryInput = "In Which Date TextNg Start";
	String twoDigitInput = "Example: 99";
	String submitBtnInput = "Click";
	String successFulMessageInput = "Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465"; 
	String applicationCloseInput = "Application Close ";

	//All The WebElement Path
	String qaAutomationPath = "QA AUTOMATION";
	String practAutomationPath = "Practice Automation";
	String regiFormPath = "Registration Form";
	String formTitlePath = "//*[normalize-space()='Register For Demo']";
	String firstNamePath = "vfb-5";
	String lastNamePath = "vfb-7";
	String genderPath = "vfb-8-1"; 
	String addressPath = "vfb-13-address";
	String streetAddressPath = "vfb-13-address-2";
	String cityPath = "vfb-13-city";
	String statePath = "vfb-13-state";
	String pinCodePath = "vfb-13-zip";
	String countryPath = "vfb-13-country";
	String emailPath = "vfb-14";
	String dateOfDemoPath = "vfb-18";
	String convenientTimeHhPath = "vfb-16-hour";
	String convenientTimeMmPath ="vfb-16-min";
	String mobileNumberPath = "vfb-19";
	String courseInterestedPath1 ="vfb-20-1";
	String courseInterestedPath2 = "vfb-20-2"; 
	String YourQueryPath = "vfb-23";
	String egTwoDigitPath = "//label[normalize-space()='Example: 99']";
	String eg_TwoDigitPath = "vfb-3";
	String submitBtnPath = "vfb-4";
	String validateMessagePath = "//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]";


	@Test (priority=1)
	public void launchApplication() {

		// set the system property for chrome broswer
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();


		// Create the object for chrome drive
		driver = new ChromeDriver();

		// launch the Application
		driver.get(url);

		// maximize the application
		driver.manage().window().maximize();

		Reporter.log("Application Is Launched SuccessFully");
		Reporter.log("---------------------------------------------------------------------");

	}

	@Test(priority=2)
	public void navigateToRegistrationForm() {

		Actions action = new Actions(driver);

		// Hover Mouse above the QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));
		action.moveToElement(qaAutomation).perform();
		Reporter.log("Hover Mouse Action Performed For QA Automation Link ");

		// Hover Mouse above the Practice Automation
		WebElement practAutomation = driver.findElement(By.linkText(practAutomationPath));
		action.moveToElement(practAutomation).perform();
		Reporter.log("Hover Mouse Action Performed For Practice Automation Link ");

		// Click On Demo Site- Registration Form
		WebElement regiForm = driver.findElement(By.partialLinkText(regiFormPath));
		action.moveToElement(regiForm).click().perform();
		Reporter.log("Hover Mouse Action Performed For Demo Site- Registration Form Link ");
		Reporter.log("---------------------------------------------------------------------");

	}

	@Test(priority=3)
	public void registerUser() {

		// Title
		WebElement formTitle = driver.findElement(By.xpath(formTitlePath));

		// Verify The Registration Title Page

		if(formTitle.isDisplayed()) {
			Reporter.log("Title For Displayed");
		} else {
			Reporter.log("Title Is Not Displayed");
		}

		// Validating Text 

		String actFormTitle = formTitle.getText();
		String expFormTitle = formTitleInput;

		if(actFormTitle.equals(expFormTitle)) {
			Reporter.log("The Form Title Is " + actFormTitle);
		}
		else {
			Reporter.log("The Actual And Expected From Title Are Not Same");
			Reporter.log("The Actual From Title is " + actFormTitle);
			Reporter.log("The Expected From Title Is " + expFormTitle);
		}

		// Verify The Registration Title Page Is Enabled Or Not
		if(formTitle.isEnabled()) {
			Reporter.log("Registration Title Page Is " + formTitleInput );
			Reporter.log("Registration Title Page Is Enabled ");
		}else {
			Reporter.log("Registration Title Page Is Not Enabled");
		}

		// First Name
		WebElement firstName = driver.findElement(By.id(firstNamePath));

		// Verify The First Name 
		if(firstName.isDisplayed()) {

			Reporter.log("First Name Is Displayed");
		}else {
			Reporter.log("First Name Is Not Displayed");
		}

		// Verify The First Name Is Enabled Or Not
		if(firstName.isEnabled()) {

			// Enter First Name 
			firstName.sendKeys(firstNameInput);

			Reporter.log("First Name Is " + firstNameInput );
			Reporter.log("First Name Is Enabled ");
		}else {
			Reporter.log("First Name Is Not Enabled");
		}

		// Last Name 
		WebElement lastName = driver.findElement(By.id(lastNamePath));

		// Verify The Last Name 
		if(lastName.isDisplayed()) {

			Reporter.log("Last Name Is Displayed");
		}else {
			Reporter.log("Last Name Is Not Displayed");
		}

		// Verify The Last Name Is Enabled Or Not
		if(lastName.isEnabled()) {

			// Enter Last Name 
			lastName.sendKeys(lastNameInput);

			Reporter.log("Last Name Is " + lastNameInput );
			Reporter.log("Last Name Is Enabled ");
		}else {
			Reporter.log("Last Name Is Not Enabled");
		}

		// Gender
		// Male Radio Button
		WebElement maleRadioButton = driver.findElement(By.id(genderPath));

		// Verify The Male Radio Button 
		if(maleRadioButton.isDisplayed()) {
			Reporter.log("Male Radio Button Is Displayed");
		}else {
			Reporter.log("Male Radio Button Is Not Displayed");
		}

		// Verify The Male Radio Button Is Enabled Or Not
		if(maleRadioButton.isEnabled()) {

			// Click On Male Radio Button
			maleRadioButton.click();

			Reporter.log("Male Radio Button Is " + genderInput );
			Reporter.log("Male Radio Button Is Enabled ");
		}else {
			Reporter.log("Male Radio Button Is Not Enabled");
		}

		// Verify The Male Radio Button Is Selected
		if(maleRadioButton.isSelected()) {

			Reporter.log("Male Radio Button Is Selected");
		} else {
			Reporter.log("Male Radio Button Is Not Selected");

		}

		// Address
		WebElement address = driver.findElement(By.id(addressPath));

		// Verify The Address 
		if(address.isDisplayed()) {

			Reporter.log("Address Is Displayed");
		}else {
			Reporter.log("Address Is Not Displayed");
		}

		// Verify The Address Is Enabled Or Not
		if(address.isEnabled()) {

			// Enter The Address
			address.sendKeys(addressInput);

			Reporter.log("Address Is " + addressInput );
			Reporter.log("Address Is Enabled ");
		}else {
			Reporter.log("Address Is Not Enabled");
		}

		// Street Address
		WebElement streetAddress = driver.findElement(By.id(streetAddressPath));

		// Verify The Street Address 
		if(streetAddress.isDisplayed()) {

			Reporter.log("Street Address Is Displayed");
		}else {
			Reporter.log("Street Address Is Not Displayed");
		}

		// Verify The Street Address Is Enabled Or Not
		if(streetAddress.isEnabled()) {

			// Enter Street Address
			streetAddress.sendKeys(streetAddressInput);

			Reporter.log("Street Address Is " + streetAddressInput );
			Reporter.log("Street Address Is Enabled ");
		}else {
			Reporter.log("Street Address Is Not Enabled");
		}

		// City
		WebElement city = driver.findElement(By.id(cityPath));

		// Verify The City 
		if(city.isDisplayed()) {

			Reporter.log("City Is Displayed");
		}else {
			Reporter.log("City Is Not Displayed");
		}

		// Verify The City Is Enabled Or Not
		if(city.isEnabled()) {

			// Enter City
			city.sendKeys(cityInput);

			Reporter.log("City Is " + cityInput );
			Reporter.log("City Is Enabled ");
		}else {
			Reporter.log("City Is Not Enabled");
		}

		// State
		WebElement state = driver.findElement(By.id(statePath));

		// Verify The State 
		if(state.isDisplayed()) {

			Reporter.log("State Is Displayed");
		}else {
			Reporter.log("State Is Not Displayed");
		}

		// Verify The State Is Enabled Or Not
		if(state.isEnabled()) {

			// Enter State
			state.sendKeys(stateInput);

			Reporter.log("State Is " + stateInput );
			Reporter.log("State Is Enabled ");
		}else {
			Reporter.log("State Is Not Enabled");
		}

		// Pin Code
		WebElement pinCode = driver.findElement(By.id(pinCodePath));

		// Verify The Pin Code 
		if(pinCode.isDisplayed()) {
			Reporter.log("Pin Code Is Displayed");
		}else {
			Reporter.log("Pin Code Is Not Displayed");
		}

		// Verify The Pin Code Is Enabled Or Not
		if(pinCode.isEnabled()) {

			// Enter Pin Code
			pinCode.sendKeys(pinCodeInput);

			Reporter.log("Pin Code Is " + pinCodeInput );
			Reporter.log("Pin Code Is Enabled ");
		}else {
			Reporter.log("Pin Code Is Not Enabled");
		}

		// Country 
		WebElement country = driver.findElement(By.id(countryPath));

		// Verify The Country 
		if(country.isDisplayed()) {
			Reporter.log("Country Is Displayed");
		}else {
			Reporter.log("Country Is Not Displayed");
		}

		// Verify The Country Is Enabled Or Not
		if(country.isEnabled()) {

			// Create The Select Object 
			Select countryDropDown = new Select(country);

			// Select Using Visible Text		
			countryDropDown.selectByVisibleText(countryInput);

			Reporter.log("Selected Country Is " + countryInput);

			Reporter.log("Country Is Enabled ");

		}else {
			Reporter.log("Country Is Not Enabled");
		}

		// Email
		WebElement email = driver.findElement(By.id(emailPath));

		// Verify The Email
		if(email.isDisplayed()) {

			Reporter.log("Email Is Displayed");
		}else {
			Reporter.log("Email Is Not Displayed");
		}

		// Verify The Email Is Enabled Or Not
		if(email.isEnabled()) {

			// Enter Email
			email.sendKeys(emailInput);

			Reporter.log("Email Is " + emailInput );
			Reporter.log("Email Is Enabled ");
		}else {
			Reporter.log("Email Is Not Enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.id(dateOfDemoPath));

		// Verify The Date Of Demo
		if(dateOfDemo.isDisplayed()) {

			Reporter.log("Date Of Demo Is Displayed");
		}else {
			Reporter.log("Date Of Demo Is Displayed");
		}

		// Verify The Date Of Demo Is Enabled Or Not
		if(dateOfDemo.isEnabled()) {

			// Enter Date Of Demo
			dateOfDemo.sendKeys(dateOfDemoInput);

			Reporter.log("Date Of Demo Is " + dateOfDemoInput );
			Reporter.log("Date Of Demo Is Enabled ");
		}else {
			Reporter.log("Date Of Demo Is Not Enabled");
		}

		// Convenient Time HH
		WebElement convenientTimeHh = driver.findElement(By.id(convenientTimeHhPath));

		// Verify The Convenient Time HH
		if(convenientTimeHh.isDisplayed()) {
			Reporter.log("Convenient Time HH Is Displayed");
		}else {
			Reporter.log("Convenient Time HH Is Displayed");
		}

		// Verify The Convenient Time HH Is Enabled Or Not
		if(convenientTimeHh.isEnabled()) {

			// Create The Select Object 
			Select hHDropDown = new Select(convenientTimeHh);

			// Select Using Visible Text		
			hHDropDown.selectByVisibleText(convenientTimeHhInput);

			Reporter.log(convenientTimeHhInput + " Is Select Convenient Time HH");

			Reporter.log("Convenient Time HH Is Enabled ");
		}else {
			Reporter.log("Convenient Time HH Is Not Enabled");
		}

		// Convenient Time MM
		WebElement convenientTimeMm = driver.findElement(By.id(convenientTimeMmPath));

		// Verify The Convenient Time MM
		if(convenientTimeMm.isDisplayed()) {
			Reporter.log("Convenient Time MM Is Displayed");
		}else {
			Reporter.log("Convenient Time MM Is Displayed");
		}

		// Verify The Convenient Time MM Is Enabled Or Not
		if(convenientTimeMm.isEnabled()) {

			// Create The Select Object 
			Select mMDropDown = new Select(convenientTimeMm);

			// Select Using Visible Text		
			mMDropDown.selectByVisibleText(convenientTimeMmInput);

			Reporter.log(convenientTimeMmInput + " Is Select Convenient Time MM");

			Reporter.log("Convenient Time MM Is Enabled ");
		}else {
			Reporter.log("Convenient Time MM Is Not Enabled");
		}

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.id(mobileNumberPath));

		// Verify The Mobile Number
		if(mobileNumber.isDisplayed()) {
			Reporter.log("Mobile Number Is Displayed");
		}else {
			Reporter.log("Mobile Number Is Displayed");
		}

		// Verify The Mobile Number Is Enabled Or Not
		if(mobileNumber.isEnabled()) {

			// Enter Mobile Number
			mobileNumber.sendKeys(mobileNumberInput);

			Reporter.log("Mobile Number Is " + mobileNumberInput );
			Reporter.log("Mobile Number Is Enabled ");
		}else {
			Reporter.log("Mobile Number Is Not Enabled");
		}

		// Course Interested UFT
		WebElement courseInterestedUft = driver.findElement(By.id(courseInterestedPath1));

		// Verify The Course Interested
		if(courseInterestedUft.isDisplayed()) {
			Reporter.log("Course Interested UFT Is Displayed");
		}else {
			Reporter.log("Course Interested UFT Is Displayed");
		}

		// Verify The Course Interested Is Enabled Or Not
		if(courseInterestedUft.isEnabled()) {

			// Click On UFT
			courseInterestedUft.click();

			Reporter.log("Course Interested UFT Is " + courseInterestedInputUft );
			Reporter.log("Course Interested UFT Is Enabled ");
		}else {
			Reporter.log("Course Interested UFT Is Not Enabled");
		}

		// Course Interested TextNG
		WebElement courseInterestedTestNg = driver.findElement(By.id(courseInterestedPath2));

		// Verify The Course Interested
		if(courseInterestedTestNg.isDisplayed()) {
			Reporter.log("Course Interested TestNG Is Displayed");
		}else {
			Reporter.log("Course Interested TestNG Is Displayed");
		}

		// Verify The Course Interested Is Enabled Or Not
		if(courseInterestedTestNg.isEnabled()) {

			// Click On TextNG
			courseInterestedTestNg.click();

			Reporter.log("Course Interested TestNG Is " + courseInterestedInputTextNg );
			Reporter.log("Course Interested TestNG Is Enabled ");
		}else {
			Reporter.log("Course Interested TestNG Is Not Enabled");
		}

		// Enter Your Query
		WebElement YourQuery = driver.findElement(By.id(YourQueryPath));

		// Verify The Enter Your Query
		if(YourQuery.isDisplayed()) {
			Reporter.log("Enter Your Query Is Displayed");
		}else {
			Reporter.log("Enter Your Query Is Displayed");
		}

		// Verify The Enter Your Query Is Enabled Or Not
		if(YourQuery.isEnabled()) {

			// Enter Your Query
			YourQuery.sendKeys(YourQueryInput);

			Reporter.log("Enter Your Query Is " + YourQueryInput );
			Reporter.log("Enter Your Query Is Enabled ");
		}else {
			Reporter.log("Enter Your Query Is Not Enabled");
		}

		// Verification
		WebElement egTwoDigit = driver.findElement(By.xpath(egTwoDigitPath));
		String arrTwoDigit[] = egTwoDigit.getText().split(":");
		String digitVal = arrTwoDigit[1].trim();

		// Verify The Verification
		if(egTwoDigit.isDisplayed()) {
			Reporter.log("Verification Is Displayed");
		}else {
			Reporter.log("Verification Is Displayed");
		}

		// Enter The Verification
		WebElement eg_TwoDigit = driver.findElement(By.id(eg_TwoDigitPath));

		// Verify The Verification Is Enabled Or Not
		if(eg_TwoDigit.isEnabled()) {

			// Enter Value 
			eg_TwoDigit.sendKeys(digitVal);

			Reporter.log("Verification Value Is " + digitVal );
			Reporter.log("Verification Is Enabled ");
		}else {
			Reporter.log("Verification Is Not Enabled");
		}

		// Submit Button
		WebElement submitBtn = driver.findElement(By.id(submitBtnPath));

		// Verify The Submit Button
		if(submitBtn.isDisplayed()) {

			Reporter.log("Submit Button Is Displayed");
		}else {
			Reporter.log("Submit Button Is Displayed");
		}

		// Verify The Verification Is Enabled Or Not
		if(submitBtn.isEnabled()) {

			// Click On Submit 
			submitBtn.click();

			Reporter.log("Submit Button Is " + submitBtnInput );
			Reporter.log("Submit Button  Is Enabled ");
		}else {
			Reporter.log("Submit Button Is Not Enabled");
		}
		Reporter.log("---------------------------------------------------------------------");
	}

	@Test(priority=4)
	public void validateSuccessFulMessage() {

		// Validate The Successful Message
		WebElement validateMessage = driver.findElement(By.xpath(validateMessagePath));

		if(validateMessage.isDisplayed()) {
			Reporter.log("Registration Form is Successfully Is Displayed");

			String actvalidateMessage = validateMessage.getText();
			String expvalidateMessage = successFulMessageInput;

			//Transaction Id Number From The Output 
			String arrValidateMessage[] = actvalidateMessage.split(":");
			String transIdNumber = arrValidateMessage[1].trim();
			

			if(actvalidateMessage.equals(expvalidateMessage)) {
				Reporter.log("The Validate Message Is " + actvalidateMessage);
				Reporter.log("Transaction Id Is " + transIdNumber);
			}

			else {
				Reporter.log("The Actual And Expected Validate Message Are Not Same");
				Reporter.log("The Actual Validate Message  is " + actvalidateMessage);
				Reporter.log("The Expected Validate Message  Is " + expvalidateMessage);

			}
			Reporter.log("---------------------------------------------------------------------");
		}

	}

	@Test(priority=5)
	public void closeApplication() {

		// Close The Application
		driver.close();
		Reporter.log(applicationCloseInput);
		Reporter.log("---------------------------------------------------------------------");

	}

}

