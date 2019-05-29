package com.virtuoso.pages;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ActionCenterPage extends DriverActions {

	public ActionCenterPage(AppiumDriver<?> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Action Centre') and @index='0']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Action Centre']")
	public MobileElement actionCenterHeaderTxt;

	@AndroidFindBy(accessibility = "remindersTab")
	@iOSXCUITFindBy(accessibility = "remindersTab")
	public MobileElement remindersTab;

	@AndroidFindBy(accessibility = "approvalsTab")
	@iOSXCUITFindBy(accessibility = "approvalsTab")
	public MobileElement approvalsTab;

	@AndroidFindBy(accessibility = "remindersTab")
	@iOSXCUITFindBy(accessibility = "remindersTab")
	public MobileElement actionCenterBtn;

	@AndroidFindBy(accessibility = "dashboard")
	@iOSXCUITFindBy(accessibility = "dashboard")
	public MobileElement dashboardBtn;
	
	@AndroidFindBy(accessibility = "myProject")
	@iOSXCUITFindBy(accessibility = "myProject")
	public MobileElement myProjectsBtn;
	
	@AndroidFindBy(accessibility = "more")
	@iOSXCUITFindBy(accessibility = "more")
	public MobileElement moreBtn;

	public void clickRemindersTab() {
		click(remindersTab, "Reminders Tab");
	}

	public void clickApprovalsTab() {
		click(approvalsTab, "Approvals Tab");
	}

	public void clickActionCenterBtn() {
		click(actionCenterBtn, "ActionCenter Bottom Btn");
	}

	public void clickDashbordBtn() {
		click(dashboardBtn, "Dashboard Bottom Btn");
	}

	public void clickMyProjectsBtn() {
		click(myProjectsBtn, "My Projects Bottom Btn");
	}

	public void clickMoreBtn() {
		click(moreBtn, " More Bottom Btn ");
	}

}
