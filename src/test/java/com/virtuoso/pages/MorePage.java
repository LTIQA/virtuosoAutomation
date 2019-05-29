package com.virtuoso.pages;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MorePage extends DriverActions {

	public MorePage(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "logoutButton")
	@iOSXCUITFindBy(accessibility = "logoutButton")
	private MobileElement logoutBtn;

	@AndroidFindBy(accessibility = "userName")
	@iOSXCUITFindBy(accessibility = "userName")
	private MobileElement profileName;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'android:id/button2')]")
	@iOSXCUITFindBy(accessibility = "Cancel")
	public MobileElement cancelBtnLogoutPopup;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'android:id/button1')]")
	@iOSXCUITFindBy(accessibility = "OK")
	public MobileElement okBtnLogoutPopup;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'android:id/message')]")
	@iOSXCUITFindBy(accessibility = "Are you sure, you want to logout?")
	public MobileElement messageLogoutPopup;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'android:id/message')]")
	@iOSXCUITFindBy(accessibility = "You are Logged out of My Virtuoso")
	public MobileElement successMessageLogoutPopup;
	

	public void clickLogoutBtn() {
		click(logoutBtn, " Logout Btn ");
	}

	public String getProfileName() {
		return getAttributeValue(profileName, " Profile Name","text");
	}

	public void clickOkBtnLogoutPopup() {
		click(okBtnLogoutPopup, "Logout popup OK button");
	}
	
	public void clickCancelBtnInLogoutPopup() {
		click(cancelBtnLogoutPopup, "Logout popup CANCEL button");
	}

}
