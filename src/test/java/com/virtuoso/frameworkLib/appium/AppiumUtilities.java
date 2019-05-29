package com.virtuoso.frameworkLib.appium;

import io.qameta.allure.Step;

public class AppiumUtilities {
	
	@Step("Sleeping till'{0}' seconds")
	public static void sleep(int sleepTimeInSeconds) {
		try {
			Thread.sleep(sleepTimeInSeconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
