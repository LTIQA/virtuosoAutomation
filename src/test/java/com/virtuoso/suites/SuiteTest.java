package com.virtuoso.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.Enable;
import com.virtuoso.suites.testcases.api.APIUserAccess;
import com.virtuoso.suites.testcases.mobile.Reminders;
import com.virtuoso.suites.testcases.mobile.RequestNBUE;
import com.virtuoso.suites.testcases.mobile.RequestRR;
import com.virtuoso.suites.testcases.mobile.RequestTPH;
import com.virtuoso.suites.testcases.mobile.UserAccess;

@RunWith(Categories.class)
@Categories.IncludeCategory(Enable.class)
@Suite.SuiteClasses({ UserAccess.class, APIUserAccess.class, Reminders.class, RequestTPH.class, RequestRR.class,
		RequestNBUE.class })
public class SuiteTest {

	// Enable.class
	// All.class
	// P1.class
	// P2.class
	// P3.class
	// P4.class
	// Regression.class
	// SmokeTests.class

}
