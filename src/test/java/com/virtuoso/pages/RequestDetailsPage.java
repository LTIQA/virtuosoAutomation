package com.virtuoso.pages;

import java.util.List;

import com.virtuoso.frameworkLib.appium.DriverActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RequestDetailsPage extends DriverActions{
	
	public RequestDetailsPage(AppiumDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "btnRej")
	@iOSXCUITFindBy(accessibility = "btnRej")
	private MobileElement rejectBtn;

	@AndroidFindBy(accessibility = "btnAppr")
	@iOSXCUITFindBy(accessibility = "btnAppr")
	private MobileElement approveBtn;
	
	@AndroidFindBy(accessibility = "valueExecutiveSummary")
	@iOSXCUITFindBy(accessibility = "valueExecutiveSummary")
	public MobileElement executiveSummary;
	
	@AndroidFindBy(accessibility = "valueBusinessJustification")
	@iOSXCUITFindBy(accessibility = "valueBusinessJustification")
	public MobileElement businessJustification;
	
	@AndroidFindBy(accessibility = "valueComments")
	@iOSXCUITFindBy(accessibility = "valueComments")
	public MobileElement riskReserveComments;

	@AndroidFindBy(accessibility = "actionCenterTxt")
	@iOSXCUITFindBy(accessibility = "actionCenterTxt")
	public MobileElement actionCenterHeader;
	
	@AndroidFindBy(accessibility = "reasonText")
	@iOSXCUITFindBy(accessibility = "reasonText")
	public MobileElement popupCommentsTxt;
	
	@AndroidFindBy(accessibility = "cancelBtn")
	@iOSXCUITFindBy(accessibility = "cancelBtn")
	public MobileElement popupCancelBtn;
	
	@AndroidFindBy(accessibility = "btnReject")
	@iOSXCUITFindBy(accessibility = "btnReject")
	public MobileElement popupRejectBtn;
	
	@AndroidFindBy(accessibility = "btnApprove")
	@iOSXCUITFindBy(accessibility = "btnApprove")
	public MobileElement popupApproveBtn;
	
	@AndroidFindBy(accessibility = "msgText")
	@iOSXCUITFindBy(accessibility = "msgText")
	public MobileElement popupSuccessMsg;
	
	@AndroidFindBy(accessibility = "messageOkButton")
	@iOSXCUITFindBy(accessibility = "messageOkButton")
	public MobileElement popupSuccessOkBtn;
	
	@AndroidFindBy(accessibility = "roleName")
	@iOSXCUITFindBy(accessibility = "roleName")
	private List<MobileElement> roles;
	
	@AndroidFindBy(accessibility = "approverName")
	@iOSXCUITFindBy(accessibility = "approverName")
	private List<MobileElement> approverNames;
	
	@AndroidFindBy(accessibility = "statusName")
	@iOSXCUITFindBy(accessibility = "statusName")
	private List<MobileElement> statusNames;
	
	
	public String getApprovalRole(int ApprovalLevelNumber) {
		return getText(roles.get(ApprovalLevelNumber), "Role Of Approval Level : "+ApprovalLevelNumber);

	}
	
	public String getApprovalName(int ApprovalLevelNumber) {
		return getText(approverNames.get(ApprovalLevelNumber), "Name Of Approval Level : "+ApprovalLevelNumber);

	}
	
	public String getApprovalStatus(int ApprovalLevelNumber) {
		return getText(statusNames.get(ApprovalLevelNumber), "Status Of Approval Level : "+ApprovalLevelNumber);

	}
	
	public String getActionCenterHeader() {
		return getText(actionCenterHeader, "Action Center Header");

	}
	
	public String getRiskReserveComments() {
		return getText(riskReserveComments, "Risk Reserve Comments");

	}

	public String getBusinessJustification() {
		return getText(businessJustification, "Business Justification");

	}

	public String getExecutiveSummary() {
		return getText(executiveSummary, "Executive Summary");

	}
	
	public void clickRejectBtn() {
		click(rejectBtn, "Reject Btn");

	}

	public void clickApproveBtn() {
		click(approveBtn, "Approve Btn");
	}
	
	public void clickPopupRejectBtn() {
		click(popupRejectBtn, "Reject Btn");
	}

	public void clickPopupApproveBtn() {
		click(popupApproveBtn, "Approve Btn");
	}
	
	public void clickPopupSuccessOkBtn() {
		click(popupSuccessOkBtn, "Popup Success OK button");
	}
	
	
	public void enterCommentsInPopupMsgBox(String msg) {
		sendKeys(popupCommentsTxt, msg, "Comments");
	}
	
	public String getPopupSuccessMsg() {
		return getText(popupSuccessMsg, "Success Msg");
	}

}
