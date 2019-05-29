package com.virtuoso.pages;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.api.ServiceUrl;
import com.virtuoso.frameworkLib.appium.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends DriverActions {

	public LoginPage(AppiumDriver<?> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'i0116')]")
	@iOSXCUITFindBy(accessibility = "Enter your email, phone, or Skype.")
	private MobileElement usernameTxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'idSIButton9')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
	private MobileElement nextBtn;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'userNameInput')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Sign In\"]/XCUIElementTypeTextField")
	public MobileElement usernameInput;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'passwordInput')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Sign In\"]/XCUIElementTypeSecureTextField")
	public MobileElement passwordInput;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'submitButton')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
	private MobileElement signInBtn;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'WindowsAzureMultiFactorAuthentication')]")
	@iOSXCUITFindBy(xpath = "//*[contains(@resource-id,'WindowsAzureMultiFactorAuthentication')]")
	private MobileElement azurAuthenticationLink;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'usernameError')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'We couldn't find an account')]")
	public MobileElement invalidUseridValidationMsg;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'errorText')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Incorrect user ID or password. Type the correct user ID and password, and try again.')]")
	public MobileElement loginPageValidationMsg;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'android:id/button1')]")
	@iOSXCUITFindBy(xpath = "//*[contains(@resource-id,'android:id/button1')]")
	public MobileElement okBtnExitPopup;

	public void enterUserName(String userName) {
		sendKeys(usernameTxt, userName, " UserName ");
	}

	public void clickOnNextBtn() {
		click(nextBtn, " Next Btn ");
	}

	public void enterUserNameInput(String userName) {
		sendKeys(usernameInput, userName, " userName ");
	}

	public void enterPasswordInput(String password) {
		sendKeys(passwordInput, password, " Password ");
	}

	public void clickSignBtn() {
		click(signInBtn, " Sign In Button ");
	}

	public void clickOkBtnExitPopup() {
		click(okBtnExitPopup, "Exit Popup OK button");
	}

	public void clickOnAzurAuthenticationLink() {
		click(azurAuthenticationLink, " azurAuthenticationLink ");
	}

	public String getUsernameValidationMsg() {
		return getAttributeValue(invalidUseridValidationMsg, "UserID Error Message", "text");
	}

	public String getLoginValidationMsg() {
		return getAttributeValue(loginPageValidationMsg, "Login Error Message", "text");
	}

	/**
	 * Login
	 * 
	 * @param userName
	 * @param password
	 * @param azureAuthentication - 'true' if azureAuthentication is enabled for the
	 *                            user
	 */
	public void login(String userName, String password, boolean azureAuthentication) {
		enterUserName(userName);
		clickOnNextBtn();
		enterPasswordInput(password);
		clickSignBtn();
		if (azureAuthentication) {
			clickOnAzurAuthenticationLink();
		}
	}

	

}
