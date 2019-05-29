package com.virtuoso.suites.testcases.mobile;

import java.sql.Connection;
import java.sql.ResultSet;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.frameworkLib.db.DBUtils;
import com.virtuoso.pages.ActionCenterPage;
import com.virtuoso.pages.ApprovalDetailsPageRR;
import com.virtuoso.pages.ApprovalsTabPage;
import com.virtuoso.pages.BasePage;
import com.virtuoso.pages.LoginPage;
import com.virtuoso.pages.RequestDetailsPage;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;
import com.virtuoso.pages.apiMobileFunctionalities.projectRequests.RequestsRRAPI;
import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.Enable;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class RequestRR extends AppiumEngine {

	private final Logger LOG = Logger.getLogger(getClass().getName());

	AuthenticateAPI authenticate = new AuthenticateAPI();
	RequestsRRAPI apiRequestRR = new RequestsRRAPI();

	/*
	 * @Test
	 * 
	 * @Feature("Feature : Requests")
	 * 
	 * @Story("User Story : Create RR Request")
	 * 
	 * @DisplayName("Test Case : Creating RR Request")
	 * 
	 * @Category({ All.class, Enable.class })
	 */
	public void verificationCreateRequestRR() throws Throwable {

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageRR ApprovalDetailsPageRR = new ApprovalDetailsPageRR(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		// Test Data for API request

		String projectId = getTestDataRR("projectId");
		String reqAmount = getTestDataRR("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String recoveryPlan = "Recovery Plan " + Generics.randomString(10);
		Double plannedAmount = Generics.convertStringToDouble(getTestDataRR("plannedAmount"));
		int consumedAmount = Generics.convertStringToInt(getTestDataRR("consumedAmount"));

		String aliasUserId1 = getTestDataRR("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataRR("approverId1"));
		String aliasUserId2 = getTestDataRR("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataRR("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation RR";
		String reqComments = "Comments " + Generics.randomString(10);

		// Calling API - Getting Access Token

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		// Calling API - RR Request

		apiRequestRR.createRequestRR_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, recoveryPlan, reqComments, plannedAmount,consumedAmount,aliasUserId1,
				approverId1, aliasUserId2, approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);

		// Asserts

		RequestDetailsPage.assertStringMatching(ApprovalDetailsPageRR.getRequestTitleName(), reqTitle);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);
		RequestDetailsPage.scrollDownMobile(2);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(0), "Lead Project Manager");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(0), "Approved");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(0), getUserProfileName(1));

		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(1), "DMM - Domain");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(1), "Pending");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(1), getUserProfileName(2));

	}

	@Test
	@Feature("Feature : Requests")
	@Story("User Story : Reject RR Request")
	@DisplayName("Test Case :  311445(2). Verify DMM user can Reject the RR Request created by PJM."
			+ "++ 311462(12) . Verify DMM User is able to Reject from Action center."
			+ "++ 311529(1). Verify the details of request raised by PJMs in Action Center."
			+ "++ 311535(7). Validate the RR Request rejection from details screen."
			+ "++ 311533(5). Validate Approvers status in details screen")
	@Category({ All.class, Enable.class })
	public void verificationRejectRequestRR() throws Throwable {

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageRR ApprovalDetailsPageRR = new ApprovalDetailsPageRR(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		// Test Data for API request

		String projectId = getTestDataRR("projectId");
		String reqAmount = getTestDataRR("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String recoveryPlan = "Recovery Plan " + Generics.randomString(10);
		Double plannedAmount = Generics.convertStringToDouble(getTestDataRR("plannedAmount"));
		int consumedAmount = Generics.convertStringToInt(getTestDataRR("consumedAmount"));

		String aliasUserId1 = getTestDataRR("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataRR("approverId1"));
		String aliasUserId2 = getTestDataRR("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataRR("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation RR";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		// Calling API - Getting Access Token

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		// Calling API - RR Request

		apiRequestRR.createRequestRR_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, recoveryPlan, reqComments, plannedAmount,consumedAmount,aliasUserId1,
				approverId1, aliasUserId2, approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);

		// Asserts

		RequestDetailsPage.assertStringMatching(ApprovalDetailsPageRR.getRequestTitleName(), reqTitle);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);
		RequestDetailsPage.scrollDownMobile(2);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(0), "Lead Project Manager");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(0), "Approved");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(0), getUserProfileName(1));

		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(1), "DMM - Domain");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(1), "Pending");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(1), getUserProfileName(2));
		// Reject Verification
		RequestDetailsPage.clickRejectBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupRejectBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Rejected Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();
	}

	/*
	 * @Test
	 * 
	 * @Feature("Feature : Requests")
	 * 
	 * @Story("User Story : Approve RR Request")
	 * 
	 * @DisplayName("Test Case : 311444(1). Verify DMM user can Approve the RR Request created by PJM."
	 * + "++ 311461(11). Verify DMM User is able to Approve from Action center." +
	 * "311534(6). Validate the RR Request Approve from details screen.")
	 * 
	 * @Category({ All.class, Enable.class })
	 */
	 
	public void verificationApproveRequestRR() throws Throwable {

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		ApprovalsTabPage ApprovalsTabPage = new ApprovalsTabPage(driver);
		ApprovalDetailsPageRR ApprovalDetailsPageRR = new ApprovalDetailsPageRR(driver);
		RequestDetailsPage RequestDetailsPage = new RequestDetailsPage(driver);

		// Test Data for API request

		String projectId = getTestDataRR("projectId");
		String reqAmount = getTestDataRR("reqAmount");
		String reqExecutiveSummary = "Executive Summary " + Generics.randomString(10);
		String reqBusineJustification = "Busine Justification " + Generics.randomString(10);
		String recoveryPlan = "Recovery Plan " + Generics.randomString(10);
		Double plannedAmount = Generics.convertStringToDouble(getTestDataRR("plannedAmount"));
		int consumedAmount = Generics.convertStringToInt(getTestDataRR("consumedAmount"));

		String aliasUserId1 = getTestDataRR("aliasUserId1");
		int approverId1 = Generics.convertStringToInt(getTestDataRR("approverId1"));
		String aliasUserId2 = getTestDataRR("aliasUserId2");
		int approverId2 = Generics.convertStringToInt(getTestDataRR("approverId2"));
		String reqTitle = Generics.randomString(10) + " Auomation RR";
		String reqComments = "Comments " + Generics.randomString(10);
		String ApproveRejectComments = "Automation Comments " + Generics.randomString(10);

		// Calling API - Getting Access Token

		AuthenticationResult authResult = authenticate.authenticateUser(getUserID(1), getPassword(1));
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);

		// Calling API - RR Request

		apiRequestRR.createRequestRR_L2Approvers(accessToken, projectId, reqTitle, reqAmount, reqExecutiveSummary,
				reqBusineJustification, recoveryPlan, reqComments, plannedAmount,consumedAmount,aliasUserId1,
				approverId1, aliasUserId2, approverId2);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ApprovalsTabPage.ClickRequestTitle(reqTitle);

		// Asserts

		RequestDetailsPage.assertStringMatching(ApprovalDetailsPageRR.getRequestTitleName(), reqTitle);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getExecutiveSummary(), reqExecutiveSummary);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getBusinessJustification(), reqBusineJustification);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getRiskReserveComments(), reqComments);
		RequestDetailsPage.scrollDownMobile(2);
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(0), "Lead Project Manager");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(0), "Approved");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(0), getUserProfileName(1));

		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalRole(1), "DMM - Domain");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalStatus(1), "Pending");
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getApprovalName(1), getUserProfileName(2));

		// Approve Verification
		RequestDetailsPage.clickApproveBtn();
		RequestDetailsPage.enterCommentsInPopupMsgBox(ApproveRejectComments);
		RequestDetailsPage.clickPopupApproveBtn();
		RequestDetailsPage.assertStringMatching(RequestDetailsPage.getPopupSuccessMsg(),
				"Request Approved Successfully !");
		RequestDetailsPage.clickPopupSuccessOkBtn();
	}

}