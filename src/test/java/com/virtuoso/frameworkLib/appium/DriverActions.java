package com.virtuoso.frameworkLib.appium;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.appcenter.appium.LabellingDriver;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

/**
 * 
 * @author ashok
 *
 */
public class DriverActions {

	private final Logger LOG = Logger.getLogger(getClass().getName());

	// private int defaultMaxWaitTime = 120;
	public int defaultWaitTime = 150;
	// private int defaultMinWaitTime = 10;
	protected AppiumDriver<?> driver;

	public DriverActions(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	/*
	 * private AppiumDriver<?> driver;
	 * 
	 * public DriverActions(AppiumDriver<?> driver) { this.driver = driver;
	 * PageFactory.initElements(new AppiumFieldDecorator(driver), this); }
	 */

	/**
	 * Quitting the driver
	 * 
	 * @param driver
	 */
	public void driverQuit(AppiumDriver<?> driver) {
		if (driver != null) {
			driver.quit();
		}
	}

	public String getCallerClassName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[4].getClassName();
	}

	public String getCallerMethodName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[4].getMethodName();
	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLogAllureReports(String logDescription) {
		return logDescription;
	}

	@Attachment(value = "{0}", type = "image/png")
	public byte[] saveScreenshotAllureReports(String screenshotDescription) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	public void addLogs(String logsDescription) {
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
			saveTextLogAllureReports(logsDescription);
			LOG.info("Logs added successfully successfully");
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}

	public void addScreenshot(String screenshotDescription) {
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			saveScreenshotAllureReports(screenshotDescription);
		} else if (Generics.getExecutionEnvironment().equalsIgnoreCase("cloud")) {
			if (Generics.getPlatformName().equalsIgnoreCase("android")) {
				((LabellingDriver) driver).label(screenshotDescription);
			} else if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
				((LabellingDriver) driver).label(screenshotDescription);
			}
		}
	}
	
	/*
	 * @Step("Verifying '{1}' is Visible or not...") public boolean
	 * waitUntilElementsVisible(List<MobileElement> elements, String locatorName) {
	 * boolean flag = false; try { LOG.info(
	 * "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	 * LOG.info("Class name :: " + getCallerClassName() + " Method name :: " +
	 * getCallerMethodName()); LOG.info("Method : " + getCallerMethodName() +
	 * "  ::  Locator : " + locatorName); try { WebDriverWait wait = new
	 * WebDriverWait(driver, defaultWaitTime);
	 * LOG.info("Waiting for element to be clickable");
	 * wait.until(ExpectedConditions.v LOG.info("Element is Visible "); } catch
	 * (Exception e) { System.out.println(e); } LOG.info(
	 * "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"); }
	 * catch (Exception e) { LOG.error(e); flag = false; } finally { if (!flag) { //
	 * failureReport("IsVisible : " + locatorName, locatorName + " Element is Not //
	 * Visible : "); } else { addScreenshot("IsVisible : " + locatorName); //
	 * successReport("IsVisible : " + locatorName, locatorName + " Element is //
	 * Visible : "); } } return flag; }
	 */

	/**
	 * Clicking on element
	 * 
	 * @param element
	 * @param locatorName which will be added as screenshot name
	 * @return
	 */
	@Step("Clicking on '{1}'")
	public boolean click(WebElement element, String locatorName) {
		boolean status = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
			LOG.info("Method : click  ::  Element : " + element);
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Clickable : " + locatorName);
			} catch (Exception e) {
				System.out.println(e);
			}
			element.click();
			LOG.info("identified the element and clicked successfully");
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			status = true;
		} catch (Exception e) {
			status = false;
			LOG.error(e);
			throw new RuntimeException(e);
		} finally {
			if (!status) {
			} else {
				addScreenshot("Clicked On " + locatorName);
			}
		}
		return status;
	}

	/**
	 * Clicking on element
	 * 
	 * @param element
	 * @param locatorName which will be added as screenshot name
	 * @return
	 */
	@Step("Clicking on '{1}'")
	public boolean click(WebElement element, String locatorName, int elementWaitTime) {
		boolean status = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
			LOG.info("Method : click  ::  Element : " + element);
			try {
				WebDriverWait wait = new WebDriverWait(driver, elementWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Clickable : " + locatorName);
			} catch (Exception e) {
				System.out.println(e);
			}
			element.click();
			LOG.info("identified the element and clicked successfully");
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			status = true;
		} catch (Exception e) {
			status = false;
			LOG.error(e);
			throw new RuntimeException(e);
		} finally {
			if (!status) {
			} else {
				addScreenshot("Clicked On " + locatorName);
			}
		}
		return status;
	}

	@Step("Typed - '{1}' in '{2}' field")
	public boolean sendKeys(WebElement element, String testData, String locatorName) {
		boolean status = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
			LOG.info("Method : Type  ::  Locator : " + locatorName + " :: Data :" + testData);
			WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
			LOG.info("Waiting for element :");
			wait.until(ExpectedConditions.elementToBeClickable(element));
			LOG.info("Locator is Clickable Now :: " + element);
			element.click();
			LOG.info("Clicked on the Locator : ");
			element.clear();
			LOG.info("Cleared the existing Locator data : ");
			element.sendKeys(testData);
			LOG.info("Typed the Locator data :: " + testData);
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			status = true;
		} catch (Exception e) {
			status = false;
			LOG.error(e);
			throw new RuntimeException(e);
		} finally {
			if (!status) {
				LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				// failureReport("Enter text in :: " + locatorName, "Unable To Type On " +
				// testData);
			} else {
				LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				addScreenshot("Entered Value " + testData + " in " + locatorName);
				// successReport("Enter text in :: " + locatorName, "Successfully Entered Value
				// " + testData);
			}
		}
		return status;
	}

	@Step("Getting Value from '{1}'")
	public String getText(WebElement element, String locatorName) {
		String text = "";
		boolean flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		try {
			if (waitUntilElementIsPresent(element, locatorName)) {
				text = element.getText();
				LOG.info("Locator is Visible and text is retrieved :: " + text);
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);
			throw new RuntimeException(e);
		} finally {
			if (!flag) {
				// warningReport("GetText :: ", "Unable to get Text from :: " + locatorName);
				LOG.info("GetText :: Unable to get Text from :: " + locatorName);
			} else {
				addScreenshot("text is retrieved :: " + locatorName);
				// successReport("GetText From element :: " + locatorName, "The Value of the
				// Element is :" + text);
				LOG.info("Locator is Visible and text is retrieved :: " + text);
			}
		}
		return text;
	}

	@Step("Trying to get value from '{1}'")
	public String getTextOptional(WebElement element, String locatorName) {
		String text = "E-M-P-T-Y";
		boolean flag = false;

		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		try {
			text = this.getText(element, locatorName);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);
		} finally {
			if (!flag) {
				LOG.info("GetText :: Unable to get Text from :: " + locatorName);
			} else {
				addScreenshot("text is retrieved :: " + locatorName);
				LOG.info("Locator is Visible and text is retrieved :: " + text);
			}
		}
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return text;
	}

	@Step("Getting Attribute : '{2}' Value from '{1}'")
	public String getAttributeValue(WebElement element, String locatorName, String attributeName) {
		String text = "";
		boolean flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		try {
			if (waitUntilElementIsPresent(element, locatorName)) {
				text = element.getAttribute(attributeName);
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);
			throw new RuntimeException(e);
		} finally {
			if (!flag) {
				LOG.info("GetAttributeValue :: Unable to get Text from :: " + locatorName);
			} else {
				addScreenshot(attributeName + " Value :: " + text);
				LOG.info("Attribute : " + attributeName + " and Value is :: " + text);
			}
		}
		return text;
	}

	@Step("Verifying '{1}' is Present or not...")
	public boolean waitUntilElementIsPresent(WebElement element, String locatorName) {
		WebElement ele;
		boolean status = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Visible ");
			} catch (Exception e) {
				System.out.println(e);
			}
			ele = element;
			status = true;
		} catch (Exception e) {
			status = false;
			LOG.error(e);
		} finally {
			if (!status) {
				LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			} else {
				LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				getClass();
				addScreenshot("isElementPresent" + locatorName);
			}
		}

		return status;
	}

	@Step("Verifying '{1}' is Visible or not...")
	public boolean waitUntilElementIsDisplayed(WebElement element, String locatorName) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());
			LOG.info("Method : " + getCallerMethodName() + "  ::  Locator : " + locatorName);
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Visible ");
			} catch (Exception e) {
				System.out.println(e);
			}

			flag = element.isDisplayed();
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
				// failureReport("IsVisible : " + locatorName, locatorName + " Element is Not
				// Visible : ");
			} else {
				addScreenshot("IsVisible : " + locatorName);
				// successReport("IsVisible : " + locatorName, locatorName + " Element is
				// Visible : ");
			}
		}
		return flag;
	}

	@Step("Verifying '{1}' is Enabled or not...")
	public boolean waitUntilElementIsEnabled(WebElement element, String locatorName) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());
			LOG.info("Method : " + getCallerMethodName() + "  ::  Locator : " + locatorName);
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Visible ");
			} catch (Exception e) {
				System.out.println(e);
			}
			flag = element.isEnabled();
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
			} else {
				addScreenshot("IsVisible : " + locatorName);
			}
		}
		return flag;
	}

	@Step("Verifying '{1}' is Enabled or not...")
	public boolean waitUntilElementIsInvisible(WebElement element, String locatorName) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());
			LOG.info("Method : " + getCallerMethodName() + "  ::  Locator : " + locatorName);
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.invisibilityOf(element));
				LOG.info("Element is Visible ");
			} catch (Exception e) {
				System.out.println(e);
			}
			flag = true;
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
			} else {
				addScreenshot("IsVisible : " + locatorName);
			}
		}
		return flag;
	}
	
	@Step("Verifying '{1}' is Enabled or not...")
	public boolean waitUntilElementIsEnableOptional(WebElement element, String locatorName) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());		
			flag = element.isEnabled();
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
			} else {
				addScreenshot("IsVisible : " + locatorName);
			}
		}
		return flag;
	}


	@Step("Verifying '{1}' is Enabled or not...& waitTime is : '{2}")
	public boolean waitUntilElementIsEnabled(WebElement element, String locatorName, int waitTime) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());
			LOG.info("Method : " + getCallerMethodName() + "  ::  Locator : " + locatorName);
			try {
				WebDriverWait wait = new WebDriverWait(driver, waitTime);
				LOG.info("Waiting for element to be clickable");
				wait.until(ExpectedConditions.visibilityOf(element));
				LOG.info("Element is Visible ");
			} catch (Exception e) {
				System.out.println(e);
			}
			flag = element.isEnabled();
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
			} else {
				addScreenshot("IsVisible : " + locatorName);
			}
		}
		return flag;
	}

	@Step("Verifying '{1}' is Clickable or not...")
	public boolean waitUntilElementIsClickable(WebElement element, String locatorName) {
		boolean flag = false;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name :: " + getCallerClassName() + " Method name :: " + getCallerMethodName());
			LOG.info("Method : " + getCallerMethodName() + "  ::  Locator : " + locatorName);
			try {
				WebDriverWait wait = new WebDriverWait(driver, defaultWaitTime);
				LOG.info("Waiting for element to be Clickable");
				wait.until(ExpectedConditions.elementToBeClickable(element));
				flag = true;
				LOG.info("Element is Clickable ");
			} catch (Exception e) {
				System.out.println(e);
			}
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Exception e) {
			LOG.error(e);
			flag = false;
		} finally {
			if (!flag) {
				LOG.info("+++++++++++++++++++       Failed     ++++++++++++++++++++++++++++++");
			} else {
				addScreenshot("IsVisible : " + locatorName);
			}
		}
		return flag;
	}

	@Step("assertTextStringMatching : Actual is - '{0}' & Expected is - '{1}'")
	public boolean assertStringMatching(String actText, String expText) {
		boolean flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		LOG.info("act - " + actText.trim());
		LOG.info("exp - " + expText.trim());
		String actualText = actText.trim();
		String expectedText = expText.trim();
		Assert.assertEquals(expectedText, actualText);
		addScreenshot("Assert: Exp txt : " + expText);
		flag = true;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return flag;
	}

	@Step("assertTextStringMatching : Actual is - '{0}' & Expected is - '{1}'")
	public boolean assertStringContains(String actText, String expText) {
		boolean flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		LOG.info("actValue - " + actText);
		LOG.info("expValue - " + expText);
		if (actText.contains(expText)) {
			flag = true;
		}
		Assert.assertTrue(flag);
		addScreenshot("Assert: Exp txt : " + expText);
		flag = true;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return flag;
	}

	@Step("AssertBooleanTrue : message is - '{1}'")
	public boolean assertBooleanTrue(boolean condition, String message) {
		boolean flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		Assert.assertTrue(condition);
		addScreenshot("assertBooleanTrue : " + message);
		flag = true;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return flag;
	}

	@Step("AssertBooleanFalse : message is - '{1}'")
	public boolean assertBooleanFalse(boolean condition, String message) {
		boolean flag = true;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		Assert.assertFalse(condition);
		addScreenshot("Assert : Expected - " + message);
		flag = false;
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return flag;
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	@Step("Launching Application")
	public void appLaunch() {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		driver.launchApp();
		addScreenshot("App Launched successfully");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Step("Pressed Device Back Button")
	public void pressDeviceBackButton() {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		} else {
			// Need to check for iOS

		}
		addScreenshot("Pressed Device BACK Button");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// Resetting the app
	public void resetApp() {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			driver.resetApp();
		} else if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			driver.removeApp(Generics.getPropValueConfig("bundleId"));
			String appPath = driver.getCapabilities().getCapability("app").toString();
			driver.installApp(appPath);
			driver.activateApp(Generics.getPropValueConfig("bundleId"));
		}
		addScreenshot("App Reset Done");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

	// Terminating the app
	public void terminateApp() {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			driver.terminateApp(Generics.getPropValueConfig("appPackage"));
		} else if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			driver.terminateApp(Generics.getPropValueConfig("bundleId"));
		}
		addScreenshot("App Reset Done");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

	// Terminating the app
	public void activateApp() {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name : " + getCallerClassName() + "Method name : " + getCallerMethodName());
		if (Generics.getPlatformName().equalsIgnoreCase("android")) {
			driver.activateApp(Generics.getPropValueConfig("appPackage"));
		} else if (Generics.getPlatformName().equalsIgnoreCase("ios")) {
			driver.activateApp(Generics.getPropValueConfig("bundleId"));
		}
		addScreenshot("App Reset Done");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

	/*
	 * public boolean scrollDownUntilElementIsEnable(WebElement element, String
	 * locatorName, int maxScrollCount) { String acText =
	 * this.waitUntilElementIsInvisible(element, locatorName) boolean f = false;
	 * 
	 * for (int i = 0; i < maxScrollCount; i++) { LOG.info("Actual Text : " + acText
	 * + " :: Expected Text : " + expectedText); if
	 * (acText.equalsIgnoreCase(expectedText)) { LOG.info(acText + " : " +
	 * expectedText); f = true; break; } else { this.scrollDownMobile(1); } } return
	 * f; }
	 */

	public boolean scrollDownUntilTextEquals(WebElement element, String locatorName, String expectedText,
			int maxScrollCount) {
		LOG.info("++++++++++++++++++++++++++++++Start Scroll Down  +++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		boolean f = false;

		for (int i = 0; i < maxScrollCount; i++) {
			String actText =this.getTextOptional(element, locatorName);
			LOG.info("Actual Text : " + actText + " :: Expected Text : " + expectedText);
			if (actText.equalsIgnoreCase(expectedText)) {
				LOG.info(actText + " : " + expectedText);
				f = true;
				break;
			} else if (i == maxScrollCount-1) {
				throw new RuntimeException("Expected text is not there in the list");
			}else {
				this.scrollDownMobile(1);
			}
		}
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		return f;
	}

	public int scrollDownUntilTextEqualsAndReturnIndexValue(List<MobileElement> elements, String locatorName,
			String expectedText, int maxScrollCount) {
		LOG.info("++++++++++++++++++++++++++++++Start Scroll Down  +++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		int i;
		int eleCount = elements.size();
		int scrollTotalCount = 0;
		for (i = 0; i < eleCount; i++) {
			String acText = this.getTextOptional(elements.get(i), locatorName);
			LOG.info("Actual Text : " + acText + " :: Expected Text : " + expectedText);
			if (acText.equalsIgnoreCase(expectedText)) {
				LOG.info(acText + " : " + expectedText);
				break;
			} else if (scrollTotalCount == maxScrollCount) {
				throw new RuntimeException("Expected text is not there in the list");
			}else if (i == eleCount - 1) {
				this.scrollDownMobile(1);
				i = 0;
				scrollTotalCount = scrollTotalCount + 1;
			} 

		}
		LOG.info("++++++++ index : " + i + " ScrollTotalCount : " + scrollTotalCount + " Elements Count : " + eleCount
				+ "++++++++");
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return i;

	}

	public void scrollDownMobile(int ScrollCount) {
		LOG.info("++++++++++++++++++++++++++++++Start Scroll Down  +++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
		for (int i = 1; i <= ScrollCount; i++) {
			if (Generics.getPlatformName().equalsIgnoreCase("Android")) {
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
			} else if (Generics.getPlatformName().equalsIgnoreCase("iOS")) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				js.executeScript("mobile: scroll", scrollObject);
			}
			addScreenshot("Scroll Down count : " + ScrollCount);
		}
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
