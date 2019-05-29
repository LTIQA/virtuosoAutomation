package com.virtuoso.suites.testcases.mobile;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.pages.ActionCenterPage;
import com.virtuoso.pages.BasePage;
import com.virtuoso.pages.LoginPage;
import com.virtuoso.pages.MorePage;
import com.virtuoso.suites.testGroupNames.P2;
import com.virtuoso.suites.testGroupNames.P3;
import com.virtuoso.suites.testGroupNames.P4;
import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.P1;
import com.virtuoso.suites.testGroupNames.Regression;
import com.virtuoso.suites.testGroupNames.SmokeTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class UserAccess extends AppiumEngine {
	private final Logger LOG = Logger.getLogger(getClass().getName());

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Login")
	@DisplayName("Test Case : 306875(2). Verify that an authorized user is able to login to “My Virtuoso” Mobile application with valid credentials "
			+ "++ 9. verify the process to login is done by an Azure authentication page")
	@Category({ P1.class, SmokeTests.class, Regression.class, All.class })
	public void loginVerificationWithValidCredentials() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : loginVerificationWithValidCredentials - Start +++++++++++++++");
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		MorePage MorePage = new MorePage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ActionCenterPage.clickMoreBtn();
		MorePage.assertStringMatching(MorePage.getProfileName(), getUserProfileName(1));
		LOG.info("+++++++++++++++ TestName : loginVerificationWithValidCredentials - End ++++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Login")
	@DisplayName("Test Case : 306876(3) Verify that an unauthorized user is unable to login to “My Virtuoso” Mobile application with Invalid Id(not microsoft domain) "
			+ "++ 306877(4). Verify that an unauthorized user is unable to login to “My Virtuoso” Mobile application with Invalid Id( microsoft domain)"
			+ "++ 311457(1). Verify any invalid user which is not Virtuoso DB")
	@Category({ P2.class, All.class })
	public void loginVerificationWithInvalidCredentials() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : loginVerificationWithInvalidCredentials - Start +++++++++++++++");
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.enterUserName("virww1Invalid");
		LoginPage.clickOnNextBtn();
		LoginPage.assertStringContains(LoginPage.getUsernameValidationMsg(), "couldn't find an account");
		LoginPage.enterUserName("virww1Invalid@microsoft.com");
		LoginPage.clickOnNextBtn();
		LoginPage.enterPasswordInput("InvalidPassword");
		LoginPage.clickSignBtn();
		LoginPage.assertStringContains(LoginPage.getLoginValidationMsg(), "Incorrect user ID or password");
		LoginPage.enterUserNameInput(getUserID(1));
		LoginPage.enterPasswordInput("InvalidPassword");
		LoginPage.clickSignBtn();
		LoginPage.assertStringContains(LoginPage.getLoginValidationMsg(), "Incorrect user ID or password");
		LOG.info("+++++++++++++++ TestName : loginVerificationWithInvalidCredentials - End +++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Login")
	@DisplayName("Test Case : 306878(5). verify the Action centre page is displayed after Login"
			+ "++ 311548(13). Navigation to Action Center."
			+ "++ 311536(Action Center View-1) Navigation to Action Center."
			+ "++ 311538(Action Center View-3) Validate the Action Segments in Action Center screen.")
	@Category({ P4.class, All.class })
	public void verificationOfActionCenterUI() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : verificationOfActionCenterUI - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		LoginPage.assertBooleanTrue(
				ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.approvalsTab, "Approvals Tab"),
				"Approvals Tab Is Enabled");
		LoginPage.assertBooleanTrue(
				ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.remindersTab, "Reminders Tab"),
				"Reminders Tab Is Enabled");
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterBtn,
				"Action Center Button At Bottom"), "Action Center Button At Bottom Is Enabled");
		LoginPage.assertBooleanTrue(
				ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.dashboardBtn, "Dashboard Button At Bottom"),
				"Dashboard Button At Bottom Is Enabled");
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"My Projects Button At Bottom"), "My Projects Button At Bottom Is Enabled");
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"More Button At Bottom"), "MoreButton At Bottom Is Enabled");
		LOG.info("+++++++++++++++ TestName : verificationOfActionCenterUI - End +++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Login")
	@DisplayName("Test Case : 306897(10). verify whether the application opens when we click back post login ")
	@Category({ P3.class, All.class })
	public void exitVerificationBySingleClick() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : exitVerificationBySingleClick - Start +++++++++++++++");

		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			BasePage BasePage = new BasePage(driver);
			LoginPage LoginPage = new LoginPage(driver);
			ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
			BasePage.clickOnLoginBtn();
			LoginPage.login(getUserID(1), getPassword(1), false);
			LoginPage.assertBooleanTrue(ActionCenterPage
					.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt, "Action Center Header Text"),
					"ActionCenter Text Is Enabled");
			LoginPage.pressDeviceBackButton();
			LoginPage.clickOkBtnExitPopup();
			LoginPage.assertBooleanFalse(ActionCenterPage
					.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt, "Action Center Header Text", 3),
					"ActionCenter Text Is Not Enabled");
			LoginPage.appLaunch();
			LoginPage.assertBooleanTrue(ActionCenterPage
					.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt, "Action Center Header Text"),
					"ActionCenter Text Is Enabled");
		}
		LOG.info("+++++++++++++++ TestName : exitVerificationBySingleClick - End +++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Login")
	@DisplayName("Test Case : 306896(9). Verify whether the password is masked on the screen while entering the password")
	@Category({ P3.class, All.class })
	public void verificationOfPasswordIsMasked() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : verificationOfPasswordIsMasked - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		BasePage.clickOnLoginBtn();
		LoginPage.enterUserName(getUserID(1));
		LoginPage.clickOnNextBtn();
		LoginPage.enterPasswordInput("password");
		LoginPage.assertStringMatching(LoginPage.getText(LoginPage.passwordInput, "Password Text Field"), "••••••••");
		LOG.info("+++++++++++++++ TestName : verificationOfPasswordIsMasked - End +++++++++++++++");
	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Logout")
	@DisplayName("Test Case : " + "   306912(1). Verify whether the user is able to logout once he login to the application "
			+ "++ 306913(2).verify whether the user can cancel logout on tapping cancel when the user prompt shows “ Are you sure you want to logout?” with “Yes” and “Cancel” "
			+ "++ 306914(3). Verify whether the Mobile App Login Screen is displayed after logout "
			+ "++ 306916(5).Verify what happens when the user clicks back button after logging out")
	@Category({ P1.class, SmokeTests.class, Regression.class , All.class})
	public void logoutVerification() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : logoutVerification - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);
		MorePage MorePage = new MorePage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ActionCenterPage.clickMoreBtn();
		MorePage.assertStringMatching(MorePage.getProfileName(), getUserProfileName(1));
		MorePage.clickLogoutBtn();
		MorePage.assertStringMatching(MorePage.getText(MorePage.messageLogoutPopup, "Logout popup Message"),
				"Are you sure, you want to logout?");
		MorePage.assertStringMatching(MorePage.getText(MorePage.okBtnLogoutPopup, "OK Button"), "OK");
		MorePage.clickCancelBtnInLogoutPopup();
		MorePage.clickLogoutBtn();
		MorePage.clickOkBtnLogoutPopup();
		MorePage.clickOkBtnLogoutPopup();
		BasePage.assertBooleanTrue(BasePage.verifyLoginBtnIsEnabled(BasePage.defaultWaitTime), "Login Button Should Display");
		BasePage.pressDeviceBackButton();
		LoginPage.clickOkBtnExitPopup();
		BasePage.assertBooleanFalse(BasePage.verifyLoginBtnIsEnabled(4),"Login Button Is Not Enabled");
		LoginPage.appLaunch();
		LoginPage.assertBooleanTrue(BasePage.waitUntilElementIsEnabled(BasePage.loginBtns.get(BasePage.loginBtns.size() - 1), "Login Button"),
				"Login Button");
		LOG.info("+++++++++++++++ TestName : logoutVerification - End +++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Logout")
	@DisplayName("Test Case : 306915(4). Verify whether the usernames displayed in 'More' are not same when we logged in with two different users ")
	@Category({ P3.class, All.class })
	public void loginWithDifferentUsers() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : loginWithDifferentUsers - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		MorePage MorePage = new MorePage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ActionCenterPage.clickMoreBtn();
		MorePage.clickLogoutBtn();
		MorePage.clickOkBtnLogoutPopup();
		MorePage.clickOkBtnLogoutPopup();
		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(2), getPassword(2), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		ActionCenterPage.clickMoreBtn();
		MorePage.assertStringMatching(MorePage.getProfileName(), getUserProfileName(2));
		LOG.info("+++++++++++++++ TestName : loginWithDifferentUsers - End +++++++++++++++");
	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Logout")
	@DisplayName("Test Case : 306919(7). Verify whether the user land on home page on opening the app if user earlier kill the app without logout")
	@Category({ P3.class, All.class })
	public void appKillAndLaunchVerification() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : appKillAndLaunchVerification - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		LoginPage.terminateApp();
		LoginPage.activateApp();
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		LOG.info("+++++++++++++++ TestName : appKillAndLaunchVerification - End +++++++++++++++");

	}

	@Test
	@Feature("Feature : User Access")
	@Story("User Story : Logout")
	@DisplayName("Test Case : 306921(8). Verify whether the user is needed to login again if he/she clears all the data from settings")
	@Category({ P3.class, All.class })
	public void appClearCacheVerification() throws InterruptedException {
		LOG.info("+++++++++++++++ TestName : appClearCacheVerification - Start +++++++++++++++");

		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		ActionCenterPage ActionCenterPage = new ActionCenterPage(driver);

		BasePage.clickOnLoginBtn();
		LoginPage.login(getUserID(1), getPassword(1), false);
		LoginPage.assertBooleanTrue(ActionCenterPage.waitUntilElementIsEnabled(ActionCenterPage.actionCenterHeaderTxt,
				"Action Center Header Text"), "ActionCenter Text Is Enabled");
		LoginPage.resetApp();
		BasePage.clickNotificationsAllowBtn();
		BasePage.verifyLoginBtnIsEnabled(BasePage.defaultWaitTime);
		LOG.info("+++++++++++++++ TestName : appClearCacheVerification - End +++++++++++++++");
	}

}
