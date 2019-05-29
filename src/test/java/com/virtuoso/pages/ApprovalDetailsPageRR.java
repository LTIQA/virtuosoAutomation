package com.virtuoso.pages;

import java.util.List;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApprovalDetailsPageRR extends DriverActions {

	public ApprovalDetailsPageRR(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "requestDetailTitle")
	@iOSXCUITFindBy(accessibility = "requestDetailTitle")
	public MobileElement requestTitleName;

	
	
	public String getRequestTitleName() {
		return getText(requestTitleName, "Request Title Name");

	}


}
