package com.virtuoso.pages;

import java.util.List;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApprovalDetailsPageTPH extends DriverActions {

	public ApprovalDetailsPageTPH(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "requestDetailTitle")
	@iOSXCUITFindBy(accessibility = "requestDetailTitle")
	public MobileElement requestTitleName;

	@AndroidFindBy(accessibility = "RequestDate")
	@iOSXCUITFindBy(accessibility = "RequestDate")
	private MobileElement requestDate;

	@AndroidFindBy(accessibility = "CostImpact")
	@iOSXCUITFindBy(accessibility = "CostImpact")
	private MobileElement costImpact;

	@AndroidFindBy(accessibility = "StatusName")
	@iOSXCUITFindBy(accessibility = "StatusName")
	private MobileElement approvalStatus;

	@AndroidFindBy(accessibility = "Requiredhours")
	@iOSXCUITFindBy(accessibility = "Requiredhours")
	private MobileElement requiredhours;

	@AndroidFindBy(accessibility = "PercentOfContractHours")
	@iOSXCUITFindBy(accessibility = "PercentOfContractHours")
	private MobileElement percentOfContractHours;

	@AndroidFindBy(accessibility = "PercentOfContractHoursCummilative")
	@iOSXCUITFindBy(accessibility = "PercentOfContractHoursCummilative")
	private MobileElement percentOfContractHoursCummilative;

	@AndroidFindBy(accessibility = "BaseLineHours")
	@iOSXCUITFindBy(accessibility = "BaseLineHours")
	private MobileElement baseLineHours;


	
	
	
	public String getRequestTitleName() {
		return getText(requestTitleName, "Request Title Name");

	}
	
	
	public String getRequestDate() {
		return getText(requestDate, "Request Date");

	}

	public String getCostImpact() {
		return getText(costImpact, "Cost Impact");

	}

	public String getApprovalStatus() {
		return getText(approvalStatus, "Approval Status");

	}

	public String getRequiredhours() {
		return getText(requiredhours, "Hours Required");

	}

	public String getPercentOfContractHours() {
		return getText(percentOfContractHours, "Percent Of Contract Hours");

	}

	public String getPercentOfContractHoursCummilative() {
		return getText(percentOfContractHoursCummilative, "Percent Of Contract Hours (Cummilative)");

	}

	public String getBaseLineHours() {
		return getText(baseLineHours, "Base Line Hours");

	}

	

}
