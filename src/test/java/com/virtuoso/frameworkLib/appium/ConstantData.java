package com.virtuoso.frameworkLib.appium;

import com.virtuoso.frameworkLib.Constants.Generics;

public class ConstantData {
	
	public  String Dir = System.getProperty("user.dir");
	protected int testDataSequenceNumber;

	public  String getUserID(int userIDNumber) {
		return Generics.getPropValueTestData("userID" + userIDNumber);
	}

	public  String getPassword(int passwordNumber) {
		return Generics.getPropValueTestData("password" + passwordNumber);
	}

	public  String getUserProfileName(int userProfileNameNumber) {
		return Generics.getPropValueTestData("profileName" + userProfileNameNumber);
	}
	
	public String getTestDataTPH(String keyInTestDataPropFile) {
		return Generics.getPropValueTestData(keyInTestDataPropFile + "_TPH_" + testDataSequenceNumber);
	}

	public String getTestDataNBUE(String keyInTestDataPropFile) {
		return Generics.getPropValueTestData(keyInTestDataPropFile + "_NBUE_" + testDataSequenceNumber);
	}
	
	public String getTestDataRR(String keyInTestDataPropFile) {
		return Generics.getPropValueTestData(keyInTestDataPropFile + "_RR_" + testDataSequenceNumber);
	}

}
