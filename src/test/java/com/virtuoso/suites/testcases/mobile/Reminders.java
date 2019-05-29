package com.virtuoso.suites.testcases.mobile;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import com.virtuoso.frameworkLib.appium.AppiumUtilities;
import com.virtuoso.frameworkLib.appium.InitDriver;
import com.virtuoso.pages.BasePage;
import com.virtuoso.pages.LoginPage;
import com.virtuoso.suites.testGroupNames.All;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class Reminders {
	AppiumDriver<?> driver;
	public void scrollDown_Mobile(AppiumDriver<?> driver,String OS, int ScrollCount)  {

		for (int i = 1; i <= ScrollCount; i++) {
			if (OS.equalsIgnoreCase("Android")) {
				Dimension dimensions = driver.manage().window().getSize();
				Double screenHeightStart = dimensions.getHeight() * 0.4;
				int scrollStart = screenHeightStart.intValue();
				Double screenHeightEnd = dimensions.getHeight() * 0.2;
				int scrollEnd = screenHeightEnd.intValue();

				TouchAction<AndroidTouchAction> action = new TouchAction<AndroidTouchAction>(driver);
				action.press(PointOption.point(0, scrollStart));
				action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)));
				action.moveTo(PointOption.point(0, scrollEnd));
				action.release();
				action.perform();
			} else if (OS.equalsIgnoreCase("iOS")) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				js.executeScript("mobile: scroll", scrollObject);
			}
		}
	}


	//@Test
	@Feature("Feature : Reminders ")
	@Story("User Story : Receive Reminders to DMM ")
	@DisplayName("Reciving Reminders Test)")
	//@Category({ All.class})
	public void exampleTest() throws InterruptedException, MalformedURLException {
		driver = InitDriver.androidAppLaunch(driver);
		BasePage BasePage = new BasePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
System.out.println(LoginPage.invalidUseridValidationMsg);
System.out.println(LoginPage.invalidUseridValidationMsg+"(1)");

		// BasePage.clickOnLoginBtn();
		// LoginPage.login(UserAccessConstants.getUserID(2),
		// UserAccessConstants.getPassword(2), false);
		AppiumUtilities.sleep(15);
		// scrollDown_Mobile(driver, "android", 2);
		/*
		 * TouchActions action = new TouchActions(driver);
		 * action.scroll(driver.findElement(MobileBy.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView"
		 * )), 10, 100); action.perform();
		 */

		/*
		 * AppiumUtilities.sleep(10); MobileElement el =
		 * ((FindsByAndroidUIAutomator<MobileElement>)
		 * driver).findElementByAndroidUIAutomator( "new UiScrollable(" +
		 * "new UiSelector().scrollable(true)).scrollIntoView(" +
		 * "new UiSelector().textContains(\"Reminders\"));"); el.click();
		 */
	}

}
