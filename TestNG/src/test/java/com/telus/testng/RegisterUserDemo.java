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

		System.out.println("Application Is Launched SuccessFully");
		System.out.println("---------------------------------------------------------------------");

	}

	@Test(priority=2)
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

	@Test(priority=3)
	public void registerUser() {

		// Title
		WebElement formTitle = driver.findElement(By.xpath(formTitlePath));

		// Verify The Registration Title Page

		if(formTitle.isDisplayed()) {
			System.out.println("Title For Displayed");
		} else {
			System.out.println("Title Is Not Displayed");
		}

		// Validating Text 

		String actFormTitle = formTitle.getText();
		String expFormTitle = formTitleInput;

		if(actFormTitle.equals(expFormTitle)) {
			System.out.println("The Form Title Is " + actFormTitle);
		}
		else {
			System.out.println("The Actual And Expected From Title Are Not Same");
			System.out.println("The Actual From Title is " + actFormTitle);
			System.out.println("The Expected From Title Is " + expFormTitle);
		}

		// Verify The Registration Title Page Is Enabled Or Not
		if(formTitle.isEnabled()) {
			System.out.println("Registration Title Page Is " + formTitleInput );
			System.out.println("Registration Title Page Is Enabled ");
		}else {
			System.out.println("Registration Title Page Is Not Enabled");
		}

		// First Name
		WebElement firstName = driver.findElement(By.id(firstNamePath));

		// Verify The First Name 
		if(firstName.isDisplayed()) {

			System.out.println("First Name Is Displayed");
		}else {
			System.out.println("First Name Is Not Displayed");
		}

		// Verify The First Name Is Enabled Or Not
		if(firstName.isEnabled()) {

			// Enter First Name 
			firstName.sendKeys(firstNameInput);

			System.out.println("First Name Is " + firstNameInput );
			System.out.println("First Name Is Enabled ");
		}else {
			System.out.println("First Name Is Not Enabled");
		}

		// Last Name 
		WebElement lastName = driver.findElement(By.id(lastNamePath));

		// Verify The Last Name 
		if(lastName.isDisplayed()) {

			System.out.println("Last Name Is Displayed");
		}else {
			System.out.println("Last Name Is Not Displayed");
		}

		// Verify The Last Name Is Enabled Or Not
		if(lastName.isEnabled()) {

			// Enter Last Name 
			lastName.sendKeys(lastNameInput);

			System.out.println("Last Name Is " + lastNameInput );
			System.out.println("Last Name Is Enabled ");
		}else {
			System.out.println("Last Name Is Not Enabled");
		}

		// Gender
		// Male Radio Button
		WebElement maleRadioButton = driver.findElement(By.id(genderPath));

		// Verify The Male Radio Button 
		if(maleRadioButton.isDisplayed()) {
			System.out.println("Male Radio Button Is Displayed");
		}else {
			System.out.println("Male Radio Button Is Not Displayed");
		}

		// Verify The Male Radio Button Is Enabled Or Not
		if(maleRadioButton.isEnabled()) {

			// Click On Male Radio Button
			maleRadioButton.click();

			System.out.println("Male Radio Button Is " + genderInput );
			System.out.println("Male Radio Button Is Enabled ");
		}else {
			System.out.println("Male Radio Button Is Not Enabled");
		}

		// Verify The Male Radio Button Is Selected
		if(maleRadioButton.isSelected()) {

			System.out.println("Male Radio Button Is Selected");
		} else {
			System.out.println("Male Radio Button Is Not Selected");

		}

		// Address
		WebElement address = driver.findElement(By.id(addressPath));

		// Verify The Address 
		if(address.isDisplayed()) {

			System.out.println("Address Is Displayed");
		}else {
			System.out.println("Address Is Not Displayed");
		}

		// Verify The Address Is Enabled Or Not
		if(address.isEnabled()) {

			// Enter The Address
			address.sendKeys(addressInput);

			System.out.println("Address Is " + addressInput );
			System.out.println("Address Is Enabled ");
		}else {
			System.out.println("Address Is Not Enabled");
		}

		// Street Address
		WebElement streetAddress = driver.findElement(By.id(streetAddressPath));

		// Verify The Street Address 
		if(streetAddress.isDisplayed()) {

			System.out.println("Street Address Is Displayed");
		}else {
			System.out.println("Street Address Is Not Displayed");
		}

		// Verify The Street Address Is Enabled Or Not
		if(streetAddress.isEnabled()) {

			// Enter Street Address
			streetAddress.sendKeys(streetAddressInput);

			System.out.println("Street Address Is " + streetAddressInput );
			System.out.println("Street Address Is Enabled ");
		}else {
			System.out.println("Street Address Is Not Enabled");
		}

		// City
		WebElement city = driver.findElement(By.id(cityPath));

		// Verify The City 
		if(city.isDisplayed()) {

			System.out.println("City Is Displayed");
		}else {
			System.out.println("City Is Not Displayed");
		}

		// Verify The City Is Enabled Or Not
		if(city.isEnabled()) {

			// Enter City
			city.sendKeys(cityInput);

			System.out.println("City Is " + cityInput );
			System.out.println("City Is Enabled ");
		}else {
			System.out.println("City Is Not Enabled");
		}

		// State
		WebElement state = driver.findElement(By.id(statePath));

		// Verify The State 
		if(state.isDisplayed()) {

			System.out.println("State Is Displayed");
		}else {
			System.out.println("State Is Not Displayed");
		}

		// Verify The State Is Enabled Or Not
		if(state.isEnabled()) {

			// Enter State
			state.sendKeys(stateInput);

			System.out.println("State Is " + stateInput );
			System.out.println("State Is Enabled ");
		}else {
			System.out.println("State Is Not Enabled");
		}

		// Pin Code
		WebElement pinCode = driver.findElement(By.id(pinCodePath));

		// Verify The Pin Code 
		if(pinCode.isDisplayed()) {
			System.out.println("Pin Code Is Displayed");
		}else {
			System.out.println("Pin Code Is Not Displayed");
		}

		// Verify The Pin Code Is Enabled Or Not
		if(pinCode.isEnabled()) {

			// Enter Pin Code
			pinCode.sendKeys(pinCodeInput);

			System.out.println("Pin Code Is " + pinCodeInput );
			System.out.println("Pin Code Is Enabled ");
		}else {
			System.out.println("Pin Code Is Not Enabled");
		}

		// Country 
		WebElement country = driver.findElement(By.id(countryPath));

		// Verify The Country 
		if(country.isDisplayed()) {
			System.out.println("Country Is Displayed");
		}else {
			System.out.println("Country Is Not Displayed");
		}

		// Verify The Country Is Enabled Or Not
		if(country.isEnabled()) {

			// Create The Select Object 
			Select countryDropDown = new Select(country);

			// Select Using Visible Text		
			countryDropDown.selectByVisibleText(countryInput);

			System.out.println("Selected Country Is " + countryInput);

			System.out.println("Country Is Enabled ");

		}else {
			System.out.println("Country Is Not Enabled");
		}

		// Email
		WebElement email = driver.findElement(By.id(emailPath));

		// Verify The Email
		if(email.isDisplayed()) {

			System.out.println("Email Is Displayed");
		}else {
			System.out.println("Email Is Not Displayed");
		}

		// Verify The Email Is Enabled Or Not
		if(email.isEnabled()) {

			// Enter Email
			email.sendKeys(emailInput);

			System.out.println("Email Is " + emailInput );
			System.out.println("Email Is Enabled ");
		}else {
			System.out.println("Email Is Not Enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.id(dateOfDemoPath));

		// Verify The Date Of Demo
		if(dateOfDemo.isDisplayed()) {

			System.out.println("Date Of Demo Is Displayed");
		}else {
			System.out.println("Date Of Demo Is Displayed");
		}

		// Verify The Date Of Demo Is Enabled Or Not
		if(dateOfDemo.isEnabled()) {

			// Enter Date Of Demo
			dateOfDemo.sendKeys(dateOfDemoInput);

			System.out.println("Date Of Demo Is " + dateOfDemoInput );
			System.out.println("Date Of Demo Is Enabled ");
		}else {
			System.out.println("Date Of Demo Is Not Enabled");
		}

		// Convenient Time HH
		WebElement convenientTimeHh = driver.findElement(By.id(convenientTimeHhPath));

		// Verify The Convenient Time HH
		if(convenientTimeHh.isDisplayed()) {
			System.out.println("Convenient Time HH Is Displayed");
		}else {
			System.out.println("Convenient Time HH Is Displayed");
		}

		// Verify The Convenient Time HH Is Enabled Or Not
		if(convenientTimeHh.isEnabled()) {

			// Create The Select Object 
			Select hHDropDown = new Select(convenientTimeHh);

			// Select Using Visible Text		
			hHDropDown.selectByVisibleText(convenientTimeHhInput);

			System.out.println(convenientTimeHhInput + " Is Select Convenient Time HH");

			System.out.println("Convenient Time HH Is Enabled ");
		}else {
			System.out.println("Convenient Time HH Is Not Enabled");
		}

		// Convenient Time MM
		WebElement convenientTimeMm = driver.findElement(By.id(convenientTimeMmPath));

		// Verify The Convenient Time MM
		if(convenientTimeMm.isDisplayed()) {
			System.out.println("Convenient Time MM Is Displayed");
		}else {
			System.out.println("Convenient Time MM Is Displayed");
		}

		// Verify The Convenient Time MM Is Enabled Or Not
		if(convenientTimeMm.isEnabled()) {

			// Create The Select Object 
			Select mMDropDown = new Select(convenientTimeMm);

			// Select Using Visible Text		
			mMDropDown.selectByVisibleText(convenientTimeMmInput);

			System.out.println(convenientTimeMmInput + " Is Select Convenient Time MM");

			System.out.println("Convenient Time MM Is Enabled ");
		}else {
			System.out.println("Convenient Time MM Is Not Enabled");
		}

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.id(mobileNumberPath));

		// Verify The Mobile Number
		if(mobileNumber.isDisplayed()) {
			System.out.println("Mobile Number Is Displayed");
		}else {
			System.out.println("Mobile Number Is Displayed");
		}

		// Verify The Mobile Number Is Enabled Or Not
		if(mobileNumber.isEnabled()) {

			// Enter Mobile Number
			mobileNumber.sendKeys(mobileNumberInput);

			System.out.println("Mobile Number Is " + mobileNumberInput );
			System.out.println("Mobile Number Is Enabled ");
		}else {
			System.out.println("Mobile Number Is Not Enabled");
		}

		// Course Interested UFT
		WebElement courseInterestedUft = driver.findElement(By.id(courseInterestedPath1));

		// Verify The Course Interested
		if(courseInterestedUft.isDisplayed()) {
			System.out.println("Course Interested UFT Is Displayed");
		}else {
			System.out.println("Course Interested UFT Is Displayed");
		}

		// Verify The Course Interested Is Enabled Or Not
		if(courseInterestedUft.isEnabled()) {

			// Click On UFT
			courseInterestedUft.click();

			System.out.println("Course Interested UFT Is " + courseInterestedInputUft );
			System.out.println("Course Interested UFT Is Enabled ");
		}else {
			System.out.println("Course Interested UFT Is Not Enabled");
		}

		// Course Interested TextNG
		WebElement courseInterestedTestNg = driver.findElement(By.id(courseInterestedPath2));

		// Verify The Course Interested
		if(courseInterestedTestNg.isDisplayed()) {
			System.out.println("Course Interested TestNG Is Displayed");
		}else {
			System.out.println("Course Interested TestNG Is Displayed");
		}

		// Verify The Course Interested Is Enabled Or Not
		if(courseInterestedTestNg.isEnabled()) {

			// Click On TextNG
			courseInterestedTestNg.click();

			System.out.println("Course Interested TestNG Is " + courseInterestedInputTextNg );
			System.out.println("Course Interested TestNG Is Enabled ");
		}else {
			System.out.println("Course Interested TestNG Is Not Enabled");
		}

		// Enter Your Query
		WebElement YourQuery = driver.findElement(By.id(YourQueryPath));

		// Verify The Enter Your Query
		if(YourQuery.isDisplayed()) {
			System.out.println("Enter Your Query Is Displayed");
		}else {
			System.out.println("Enter Your Query Is Displayed");
		}

		// Verify The Enter Your Query Is Enabled Or Not
		if(YourQuery.isEnabled()) {

			// Enter Your Query
			YourQuery.sendKeys(YourQueryInput);

			System.out.println("Enter Your Query Is " + YourQueryInput );
			System.out.println("Enter Your Query Is Enabled ");
		}else {
			System.out.println("Enter Your Query Is Not Enabled");
		}

		// Verification
		WebElement egTwoDigit = driver.findElement(By.xpath(egTwoDigitPath));
		String arrTwoDigit[] = egTwoDigit.getText().split(":");
		String digitVal = arrTwoDigit[1].trim();

		// Verify The Verification
		if(egTwoDigit.isDisplayed()) {
			System.out.println("Verification Is Displayed");
		}else {
			System.out.println("Verification Is Displayed");
		}

		// Enter The Verification
		WebElement eg_TwoDigit = driver.findElement(By.id(eg_TwoDigitPath));

		// Verify The Verification Is Enabled Or Not
		if(eg_TwoDigit.isEnabled()) {

			// Enter Value 
			eg_TwoDigit.sendKeys(digitVal);

			System.out.println("Verification Value Is " + digitVal );
			System.out.println("Verification Is Enabled ");
		}else {
			System.out.println("Verification Is Not Enabled");
		}

		// Submit Button
		WebElement submitBtn = driver.findElement(By.id(submitBtnPath));

		// Verify The Submit Button
		if(submitBtn.isDisplayed()) {

			System.out.println("Submit Button Is Displayed");
		}else {
			System.out.println("Submit Button Is Displayed");
		}

		// Verify The Verification Is Enabled Or Not
		if(submitBtn.isEnabled()) {

			// Click On Submit 
			submitBtn.click();

			System.out.println("Submit Button Is " + submitBtnInput );
			System.out.println("Submit Button  Is Enabled ");
		}else {
			System.out.println("Submit Button Is Not Enabled");
		}
		System.out.println("---------------------------------------------------------------------");
	}

	@Test(priority=4)
	public void validateSuccessFulMessage() {

		// Validate The Successful Message
		WebElement validateMessage = driver.findElement(By.xpath(validateMessagePath));

		if(validateMessage.isDisplayed()) {
			System.out.println("Registration Form is Successfully Is Displayed");

			String actvalidateMessage = validateMessage.getText();
			String expvalidateMessage = successFulMessageInput;

			//Transaction Id Number From The Output 
			String arrValidateMessage[] = actvalidateMessage.split(":");
			String transIdNumber = arrValidateMessage[1].trim();
			

			if(actvalidateMessage.equals(expvalidateMessage)) {
				System.out.println("The Validate Message Is " + actvalidateMessage);
				System.out.println("Transaction Id Is " + transIdNumber);
			}

			else {
				System.out.println("The Actual And Expected Validate Message Are Not Same");
				System.out.println("The Actual Validate Message  is " + actvalidateMessage);
				System.out.println("The Expected Validate Message  Is " + expvalidateMessage);

			}
			System.out.println("---------------------------------------------------------------------");
		}

	}

	@Test(priority=5)
	public void closeApplication() {

		// Close The Application
		driver.close();
		System.out.println(applicationCloseInput);
		System.out.println("---------------------------------------------------------------------");

	}

}

