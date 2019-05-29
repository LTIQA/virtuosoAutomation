package com.virtuoso.suites;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.microsoft.appcenter.appium.Factory;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ExampleAppium {
	static AppiumDriverLocalService service;
	static AppiumDriver<?> driver;
	static File dir = new File(System.getProperty("user.dir"));
	static File app = null;

	@Test
	public void testAndroid() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		  capabilities.setCapability("deviceName", "ignored");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("automationName", "UiAutomator2");
		  capabilities.setCapability("appPackage", "com.virtuoso");
		  capabilities.setCapability("appActivity", "com.virtuoso.MainActivity");
		  capabilities.setCapability("noReset", true);
		 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		 Thread.sleep(3000);
		 List<MobileElement> loginBtns = (List<MobileElement>) driver.findElements(MobileBy.AccessibilityId("loginButton"));
		 
		 System.out.println(loginBtns.size());
		 loginBtns.get(0).click();
	}
	
	
	public void testIOS() throws InterruptedException, MalformedURLException {
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File(Generics.getPropValueConfig("nodeExecutablePath")))
				.withAppiumJS(new File(Generics.getPropValueConfig("appiumJS_Path"))).withIPAddress("127.0.0.1")
				.usingAnyFreePort());
		app = new File(dir, "/virtuoso.ipa");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		/*
		 * capabilities.setCapability("deviceName", "ignored");
		 * capabilities.setCapability("platformName", "Android");
		 * capabilities.setCapability("automationName", "UiAutomator2");
		 * capabilities.setCapability("appPackage", "com.virtuoso");
		 * capabilities.setCapability("appActivity", "com.virtuoso.MainActivity");
		 * capabilities.setCapability("noReset", true);
		 */

		capabilities.setCapability("platformVersion", "11.3");
		capabilities.setCapability("deviceName", "ignored");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("xcodeOrgId", "29DCFK99AA");
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		capabilities.setCapability("udid", "7ccd5e0277262ffcdd74cb940996e88df93555bc");
		capabilities.setCapability("newCommandTimeout", 600);

		// capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = Factory.createIOSDriver(service, capabilities);
		Thread.sleep(3000);
		// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();

		// ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));

		driver.resetApp();

		Thread.sleep(8000);

	}

}
