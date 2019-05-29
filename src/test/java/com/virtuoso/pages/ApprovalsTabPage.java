package com.virtuoso.pages;

import java.util.List;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApprovalsTabPage extends DriverActions {

	public ApprovalsTabPage(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "requestType")
	@iOSXCUITFindBy(accessibility = "requestType")
	private List<MobileElement> requestTitles;

	public void ClickRequestTitle(String expectedTitle) {

		int index = scrollDownUntilTextEqualsAndReturnIndexValue(requestTitles, "Request Title", expectedTitle, 10);
		click(requestTitles.get(index), "Request Title");

	}

}