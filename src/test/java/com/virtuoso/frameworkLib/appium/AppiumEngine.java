package com.virtuoso.frameworkLib.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import com.microsoft.appcenter.appium.Factory;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.pages.BasePage;

import io.appium.java_client.AppiumDriver;

public class AppiumEngine extends ConstantData{
	private final Logger LOG = Logger.getLogger(getClass().getName());
	protected static AppiumDriver<?> driver;

	public String getCallerClassName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getClassName();
	}

	public String getCallerMethodName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getMethodName();
	}
	@Rule
	public TestWatcher watcher = Factory.createWatcher();

	/**
	 * Initiating appium driver before class methods execution
	 * 
	 * @throws MalformedURLException
	 */
	@BeforeClass
	public static void appiumDriver() throws MalformedURLException {
		System.out.println("Execution Platform Name : " + Generics.getPlatformName());
		System.out.println("Execution Environment Name : " + Generics.getExecutionEnvironment());
		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			// InitDriver.androidAppInstallAndDelete(driver);
			driver = InitDriver.androidConfig(driver, new URL("http://localhost:4723/wd/hub"));
		} else if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			// InitDriver.iosAppInstallAndDelete(driver);
			driver = InitDriver.iosConfig(driver, new URL("http://localhost:4723/wd/hub"));
		}

		new DriverActions(driver).addLogs("BeforeClass installing an application");

	}

	/**
	 * Resetting the application before every test
	 * 
	 * @throws MalformedURLException
	 */
	@Before
	public void beforeEveryTest() throws MalformedURLException {
		testDataSequenceNumber=1;
		System.out.println("TestDataSequenceNumber :" + testDataSequenceNumber);
		BasePage BasePage = new BasePage(driver);
		BasePage.resetApp();
		BasePage.clickNotificationsAllowBtn();
		BasePage.verifyLoginBtnIsEnabled(BasePage.defaultWaitTime);
		// new DriverActions(driver).addScreenshot("Taking screenshot after test
		// execution");
	}

	/**
	 * Taking screenshot after every test
	 */
	@After
	public void afterEveryTest() {
		// new DriverActions(driver).addScreenshot("Taking screenshot after test
		// execution");
	}

	/**
	 * Quitting the driver after class methods execution
	 */
	@AfterClass
	public static void QuitDriver() {
		if (driver != null) {
			new DriverActions(driver).addLogs("closing driver");
			driver.quit();
		} else {
			new DriverActions(driver).addLogs("Driver initiation not done");
		}
	}

}
