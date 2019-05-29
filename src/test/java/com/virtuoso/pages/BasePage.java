package com.virtuoso.pages;

import java.util.List;

import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * 
 * @author ashok
 *
 */
public class BasePage extends DriverActions {

	/**
	 * Driver Initialization
	 * 
	 * @param driver
	 */
	public BasePage(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "Allow")
	@iOSXCUITFindBy(accessibility = "Allow")
	private MobileElement notificationAllowBtn;

	@AndroidFindBy(accessibility = "Allow")
	@iOSXCUITFindBy(accessibility = "Don’t Allow")
	private MobileElement notificationDontAllowBtn;

	@AndroidFindBy(accessibility = "loginButton")
	@iOSXCUITFindBy(accessibility = "loginButton")
	public List<MobileElement> loginBtns;

	public void clickNotificationsAllowBtn() {
		if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			try {
				click(notificationAllowBtn, "Notification Allow Btn");
			} catch (Exception e) {
				System.out.println("Allow button not there");
			}
		}
	}

	public void clickNotificationsDontAllowBtn() {
		if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			click(notificationDontAllowBtn, "Notification Don`t Allow Btn");
		}
	}

	/**
	 * Clicking on login button base page
	 * 
	 * @return clicking status
	 */
	public boolean clickOnLoginBtn() {
		waitUntilElementIsEnabled(loginBtns.get(0), " Login Button ");
		return click(loginBtns.get(loginBtns.size() - 1), " Login Button ");
	}

	/**
	 * Verification of login button is enabled or not in base page
	 * 
	 * @return
	 */
	public boolean verifyLoginBtnIsEnabled(int waitTime) {
		waitUntilElementIsEnabled(loginBtns.get(0), " Login Button ");
		return waitUntilElementIsEnabled(loginBtns.get(loginBtns.size() - 1), " Login Button ", waitTime);
	}

}
