package com.virtuoso.frameworkLib.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.microsoft.appcenter.appium.Factory;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.pages.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * 
 * @author ashok
 *
 */
public class InitDriver {
	static File dir = new File(System.getProperty("user.dir"));
	// public final int SHORT_TIMEOUT = 5;
	static AppiumDriverLocalService service;

	/**
	 * Android Appium Setup
	 * 
	 * @param driver
	 * @param driverUrl
	 * @return
	 * @throws MalformedURLException
	 */
	public static AppiumDriver<?> androidConfig(AppiumDriver<?> driver, URL driverUrl) throws MalformedURLException {
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
					.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1").usingAnyFreePort());
		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ignored");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("newCommandTimeout", Generics.getPropValueConfig("newCommandTimeout_android"));

		capabilities.setCapability(MobileCapabilityType.APP, Generics.getAppPath());
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			driver = Factory.createAndroidDriver(service, capabilities);
		} else {
			driver = Factory.createAndroidDriver(driverUrl, capabilities);
		}
		return driver;
		// driver.manage().timeouts().implicitlyWait(SHORT_TIMEOUT, TimeUnit.SECONDS);
	}
	
	/**
	 * Android Appium Setup
	 * 
	 * @param driver
	 * @param driverUrl
	 * @return
	 * @throws MalformedURLException
	 */
	public static AppiumDriver<?> androidAppLaunch(AppiumDriver<?> driver) throws MalformedURLException {
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
					.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1").usingAnyFreePort());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("newCommandTimeout", Generics.getPropValueConfig("newCommandTimeout_android"));
		capabilities.setCapability("appPackage", Generics.getPropValueConfig("appPackage"));
		capabilities.setCapability("appActivity", Generics.getPropValueConfig("appActivity"));

		driver = new AndroidDriver<AndroidElement>(service, capabilities);

		return driver;
		// driver.manage().timeouts().implicitlyWait(SHORT_TIMEOUT, TimeUnit.SECONDS);
	}


	/**
	 * iOS Appium Setup
	 * 
	 * @param driver
	 * @param platform
	 * @param driverUrl
	 * @return
	 */

	public static AppiumDriver<?> iosConfig(AppiumDriver<?> driver, URL driverUrl) {
		
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
					.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1").usingAnyFreePort());
		}
		// Use .ipa for physical device

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "11.3");
		capabilities.setCapability("deviceName", "ignored");
		capabilities.setCapability("app", Generics.getAppPath());
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("xcodeOrgId",  Generics.getPropValueConfig("xcodeOrgId"));
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		capabilities.setCapability("udid", Generics.getPropValueConfig("udid_ios"));
		capabilities.setCapability("showXcodeLog", true);
		capabilities.setCapability("newCommandTimeout",  Generics.getPropValueConfig("newCommandTimeout_android"));
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		System.out.println("APP PATH IN IOS DRIVER CONFIG : "+Generics.getAppPath());
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			driver = Factory.createIOSDriver(service, capabilities);
		} else {
			driver = Factory.createIOSDriver(driverUrl, capabilities);
		}
		/*
		 * BasePage BasePage = new BasePage(driver);
		 * BasePage.clickNotificationsAllowBtn(20);
		 */		// driver.manage().timeouts().implicitlyWait(SHORT_TIMEOUT, TimeUnit.SECONDS);
		return driver;
	}

	public static void androidAppInstallAndDelete(AppiumDriver<?> driver) {
		AppiumDriverLocalService service1 = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
						.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1").usingAnyFreePort());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ignored");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("fullReset", true);
		capabilities.setCapability(MobileCapabilityType.APP, Generics.getAppPath());
		driver = Factory.createAndroidDriver(service1, capabilities);
		service1.stop();
		// driver.quit();
	}
	
	public static void iosAppInstallAndDelete(AppiumDriver<?> driver) {
		AppiumDriverLocalService service1 = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
						.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1").usingAnyFreePort());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ignored");
		capabilities.setCapability("platformName", "ios");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("fullReset", true);
		capabilities.setCapability("platformVersion", "11.3");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("xcodeOrgId",  Generics.getPropValueConfig("xcodeOrgId"));
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		capabilities.setCapability("udid", Generics.getPropValueConfig("udid_ios"));
		// capabilities.setCapability("showXcodeLog", true);
		
		capabilities.setCapability("app", Generics.getAppPath());

		driver = Factory.createIOSDriver(service1, capabilities);
		service1.stop();
		// driver.quit();
	}

	public static void resetApp(AppiumDriver<?> driver) {
		driver.resetApp();
	}

}
