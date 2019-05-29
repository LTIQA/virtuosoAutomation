package com.virtuoso.suites.testcases.mobile;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.pages.ActionCenterPage;
import com.virtuoso.pages.ApprovalDetailsPageTPH;
import com.virtuoso.pages.ApprovalsTabPage;
import com.virtuoso.pages.BasePage;
import com.virtuoso.pages.LoginPage;
import com.virtuoso.pages.RequestDetailsPage;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;
import com.virtuoso.pages.apiMobileFunctionalities.projectRequests.RequestsTPHAPI;
import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.Enable;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class RequestTPH extends AppiumEngine {

	private final Logger LOG = Logger.getLogger(getClass().getName());

	AuthenticateAPI authenticate = new AuthenticateAPI();
	RequestsTPHAPI apiRequestTPH = new RequestsTPHAPI();

	/*
	 * @Test
	 * 
	 * @Feature("Feature : Requests")
	 * 
	 * @Story("User Story : Create TPH Request")
	 * 
	 * @DisplayName("Test Case : Creating TPH Request")
	 * 
	 * @Category({ All.class, Enable.class })
	 */
	public void verificationCreateRequestTPH() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageTPH ApprovalsDetailsPage = new ApprovalDetailsPageTPH(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		String projectId = getTestDataTPH("projectId");
		String reqAmount = getTestDataTPH("reqAmount");
		String reqHours = getTestDataTPH("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataTPH("baseLineHours"));
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String aliasUserId = getTestDataTPH("aliasUserId");
		int approverId = Generics.convertStringToInt(getTestDataTPH("approverId"));
		String reqTitle = Generics.randomString(10) + " Auomation TPH";
		String reqComments = "Comments " + Generics.randomString(10);

		apiRequestTPH.createRequestTPH_L1Approver(accessToken, projectId, reqTitle, reqAmount, reqHours, baseLineHours,
				reqExecutiveSummary, reqBusineJustification, reqComments, aliasUserId, approverId);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		RequestDetailsPage.assertStringMatching(ApprovalsDetailsPage.getRequestTitleName(), reqTitle);
		RequestDetailsPage.scrollDownMobile(3);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);
	}

	@Test
	@Feature("Feature : Requests")
	@Story("User Story : Reject TPH Request")
	@DisplayName("Test Case : 311478(2). Verify DMM User is able to Reject from Action center."
			+ "++ 311495(11).Verify DMM User is able to Reject from Action center."
			+ "++ 311541(Action Center View - 4).Validate the Approvals list displayed in Action Center."
			+ "++ 311543(Action Center View - 5).Verify the screen navigation once tap on Approval Request."
			+ "++ 311549(1). Verify the navigation of Request details screen."
			+ "++ 311554(6).Validate the RR Request rejection from details screen."
			+ "++ 311552(4).Validate Approvers status in details screen")
	@Category({ All.class, Enable.class })
	public void verificationRejectRequestTPH() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageTPH ApprovalsDetailsPage = new ApprovalDetailsPageTPH(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		String projectId = getTestDataTPH("projectId");
		String reqAmount = getTestDataTPH("reqAmount");
		String reqHours = getTestDataTPH("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataTPH("baseLineHours"));
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String aliasUserId = getTestDataTPH("aliasUserId");
		int approverId = Generics.convertStringToInt(getTestDataTPH("approverId"));
		String reqTitle = Generics.randomString(10) + " Auomation TPH";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		apiRequestTPH.createRequestTPH_L1Approver(accessToken, projectId, reqTitle, reqAmount, reqHours, baseLineHours,
				reqExecutiveSummary, reqBusineJustification, reqComments, aliasUserId, approverId);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		RequestDetailsPage.assertStringMatching(ApprovalsDetailsPage.getRequestTitleName(), reqTitle);
		RequestDetailsPage.scrollDownMobile(3);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);

		// Reject Verification
		RequestDetailsPage.clickRejectBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupRejectBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Rejected Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();
	}

	@Test
	@Feature("Feature : Requests")
	@Story("User Story : Approve TPH Request")
	@DisplayName("Test Case : 311477(1). Verify DMM user can Approve the TPH Request created by PJM."
			+ "++ 311494(10). Verify DMM User is able to Approve from Action center."
			+ "++ 311553(5). Validate the TPH Request Approve from details screen.")
	@Category({ All.class , Enable.class})
	public void verificationApproveRequestTPH() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageTPH ApprovalsDetailsPage = new ApprovalDetailsPageTPH(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		String projectId = getTestDataTPH("projectId");
		String reqAmount = getTestDataTPH("reqAmount");
		String reqHours = getTestDataTPH("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataTPH("baseLineHours"));
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String aliasUserId = getTestDataTPH("aliasUserId");
		int approverId = Generics.convertStringToInt(getTestDataTPH("approverId"));
		String reqTitle = Generics.randomString(10) + " Auomation TPH";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		apiRequestTPH.createRequestTPH_L1Approver(accessToken, projectId, reqTitle, reqAmount, reqHours, baseLineHours,
				reqExecutiveSummary, reqBusineJustification, reqComments, aliasUserId, approverId);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		RequestDetailsPage.assertStringMatching(ApprovalsDetailsPage.getRequestTitleName(), reqTitle);
		RequestDetailsPage.scrollDownMobile(3);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);

		// Approve Verification
		RequestDetailsPage.clickApproveBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupApproveBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Approved Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();
	}

}
