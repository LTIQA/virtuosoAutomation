package com.virtuoso.suites.testcases.mobile;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.pages.ActionCenterPage;
import com.virtuoso.pages.ApprovalDetailsPageNBUE;
import com.virtuoso.pages.ApprovalsTabPage;
import com.virtuoso.pages.BasePage;
import com.virtuoso.pages.LoginPage;
import com.virtuoso.pages.RequestDetailsPage;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;
import com.virtuoso.pages.apiMobileFunctionalities.projectRequests.RequestsNBUEAPI;
import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.Enable;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class RequestNBUE extends AppiumEngine {

	private final Logger LOG = Logger.getLogger(getClass().getName());

	AuthenticateAPI authenticate = new AuthenticateAPI();
	RequestsNBUEAPI apiRequestNBUE = new RequestsNBUEAPI();

	/*
	 * @Test
	 * 
	 * @Feature("Feature : Requests")
	 * 
	 * @Story("User Story : Create NBUE Request")
	 * 
	 * @DisplayName("Test Case : Creating NBUE Request")
	 * 
	 * @Category({ All.class, Enable.class })
	 */
	public void verificationCreateRequestNBUE() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageNBUE ApprovalDetailsPageNBUE = new ApprovalDetailsPageNBUE(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);
		String projectId = getTestDataNBUE("projectId");
		String reqAmount = getTestDataNBUE("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String reqHours = getTestDataNBUE("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataNBUE("baseLineHours"));
		String aliasUserId1 = getTestDataNBUE("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataNBUE("approverId1"));
		String aliasUserId2 = getTestDataNBUE("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataNBUE("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation NBUE";
		String reqComments = "Comments " + Generics.randomString(10);
		apiRequestNBUE.createRequestNBUE_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, reqComments, reqHours, baseLineHours, aliasUserId1, approverId1, aliasUserId2,
				approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		ApprovalDetailsPageNBUE.assertStringMatching(ApprovalDetailsPageNBUE.getRequestTitleName(), reqTitle);
		ApprovalDetailsPageNBUE.scrollDownMobile(3);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);
		RequestDetailsPage.scrollDownMobile(2);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(0), "DMM - Domain");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(0), getUserProfileName(2));
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(0), "Pending");

		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(1), "SPL - Domain");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(1), "Yuan-Hong Rong");
		// RequestDetailsPage.clickRejectBtn();

	}

	@Test
	@Feature("Feature : Requests")
	@Story("User Story : Reject NBUE Request")
	@DisplayName("Test Case : 311504(2). Verify DMM user can Reject the NBUE Request created by PJM."
			+ "++ 311521(11). Verify DMM User is able to Reject from Action center."
			+ "++ 311549(1). Verify the navigation of Request details screen."
			+ "++ 311554(6).Validate the RR Request rejection from details screen."
			+ "++ 311552(4).Validate Approvers status in details screen")
	@Category({ All.class, Enable.class })
	public void verificationRejectRequestNBUE() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageNBUE ApprovalDetailsPageNBUE = new ApprovalDetailsPageNBUE(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);
		String projectId = getTestDataNBUE("projectId");
		String reqAmount = getTestDataNBUE("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String reqHours = getTestDataNBUE("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataNBUE("baseLineHours"));
		String aliasUserId1 = getTestDataNBUE("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataNBUE("approverId1"));
		String aliasUserId2 = getTestDataNBUE("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataNBUE("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation NBUE";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		apiRequestNBUE.createRequestNBUE_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, reqComments, reqHours, baseLineHours, aliasUserId1, approverId1, aliasUserId2,
				approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		RequestDetailsPage.assertStringMatching(ApprovalDetailsPageNBUE.getRequestTitleName(), reqTitle);
		RequestDetailsPage.scrollDownMobile(3);
		RequestDetailsPage.clickRejectBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupRejectBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Rejected Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();

	}

	@Test
	@Feature("Feature : Requests")
	@Story("User Story : Approve NBUE Request")
	@DisplayName("Test Case : 311503(1). Verify DMM user can Approve the NBUE Request created by PJM."
			+ "++ 311520(10). Verify DMM User is able to Approve from Action center."
			+ "++ 311553(5). Validate the NBUE Request Approve from details screen.")
	@Category({ All.class, Enable.class })
	public void verificationApproveRequestNBUE() throws Throwable {
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageNBUE ApprovalDetailsPageNBUE = new ApprovalDetailsPageNBUE(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);
		String projectId = getTestDataNBUE("projectId");
		String reqAmount = getTestDataNBUE("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String reqHours = getTestDataNBUE("reqHours");
		Double baseLineHours = Generics.convertStringToDouble(getTestDataNBUE("baseLineHours"));
		String aliasUserId1 = getTestDataNBUE("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataNBUE("approverId1"));
		String aliasUserId2 = getTestDataNBUE("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataNBUE("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation NBUE";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		apiRequestNBUE.createRequestNBUE_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, reqComments, reqHours, baseLineHours, aliasUserId1, approverId1, aliasUserId2,
				approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);
		RequestDetailsPage.assertStringMatching(ApprovalDetailsPageNBUE.getRequestTitleName(), reqTitle);
		RequestDetailsPage.scrollDownMobile(3);

		// Approve Verification
		RequestDetailsPage.clickApproveBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupApproveBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Approved Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();

	}

}
