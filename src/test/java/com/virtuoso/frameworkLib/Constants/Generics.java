package com.virtuoso.frameworkLib.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author ashok
 *
 */
public class Generics {
	private final static Logger LOG = Logger.getLogger(Generics.class.getName());

	static String Dir = System.getProperty("user.dir");

	public static String getPlatformName() {
		String platform;
		String envPlatform = System.getenv("ENV_Platform");
		if (envPlatform != null) {
			platform = envPlatform;
		} else {
			platform = Generics.getPropValueConfig("PlatformName");
		}
		return platform.toLowerCase();
	}

	public static String getExecutionEnvironment() {
		String executionEnvironment;
		String envName = System.getenv("ENV_Name");
		if (envName != null) {
			executionEnvironment = envName;
		} else {
			executionEnvironment = Generics.getPropValueConfig("ExecutionEnvironment");
		}
		return executionEnvironment.toLowerCase();
	}

	public static String getExecutionServer() {
		return Generics.getPropValueConfig("ExecutionServer").toLowerCase();
	}

	// DB Config Data

	public static String getHostNameDB() {
		return Generics.getPropValueConfig("hostName_DB_" + getExecutionServer());
	}

	public static String getDBName() {
		return Generics.getPropValueConfig("dbName_DB_" + getExecutionServer());
	}

	public static String getUserNameDB() {
		return Generics.getPropValueConfig("username_DB_" + getExecutionServer());
	}

	public static String getPasswordDB() {
		return Generics.getPropValueConfig("password_DB_" + getExecutionServer());
	}

	/**
	 * 
	 * @param propertFilePath
	 * @param propertyFileKey
	 * @return
	 */

	public static String getPropertyValue(String propertFilePath, String propertyFileKey) {
		String propertyFileValue = "Please check property file key";
		InputStream is = null;
		Properties prop = null;
		try {
			prop = new Properties();
			is = new FileInputStream(new File(propertFilePath));
			prop.load(is);
			propertyFileValue = prop.getProperty(propertyFileKey);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return propertyFileValue;
	}

	/**
	 * 
	 * @param propertyFileKey
	 * @return
	 */

	public static String getPropValueConfig(String propertyFileKey) {
		Generics generics = new Generics();
		return getPropertyValue(generics.getFilePath("Config.properties"), propertyFileKey);
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public String getFilePath(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		String absolutePath = file.getAbsolutePath();
		// System.out.println(fileName + " absolute path is : " + absolutePath);
		return absolutePath;
	}

	/**
	 * 
	 * @param propertyFileKey
	 * @return
	 */

	public static String getPropValueTestData(String propertyFileKey) {
		Generics generics = new Generics();
		return getPropertyValue(generics.getFilePath("mobileTestData.properties"), propertyFileKey);
	}

	public static String getAppPath() {
		Generics generics = new Generics();
		String appPath = null;
		if (getPlatformName().equalsIgnoreCase("android")) {
			appPath = generics.getFilePath(Generics.getPropValueConfig("ProjectName") + ".apk");
		} else if (getPlatformName().equalsIgnoreCase("ios")) {
			appPath = generics.getFilePath(Generics.getPropValueConfig("ProjectName") + ".ipa");
		} else {
			System.out.println("Please check platform name configuration");
		}

		return appPath;
	}

	public static String getTodayDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public static int currentMonthDays() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
		LocalDateTime now = LocalDateTime.now();
		YearMonth yearMonthObject = YearMonth.of(2018, convertStringToInt(dtf.format(now)));
		int daysInMonth = yearMonthObject.lengthOfMonth();
		LOG.info("Currnt month and days" + dtf.format(now) + ":" + daysInMonth);
		return daysInMonth;
	}

	public static int convertStringToInt(String stringValue) {
		int result = 0;
		try {
			result = Integer.parseInt(stringValue);
		} catch (Exception e) {
			result = (int) Double.parseDouble(stringValue);
		}
		return result;
	}

	public static double convertStringToDouble(String stringValue) {
		double result = Double.parseDouble(stringValue);
		return result;
	}

	public static String convertIntToString(int intValue) {
		String s = String.valueOf(intValue);
		return s;
	}

	public static String removeSpaceInStr(String value) {

		return value.replaceAll("\\s+", "");

	}

	public static String randomString(int len) {
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();

		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public static String randomNumString(int len) {
		String AB = "123456789987654321";
		SecureRandom rnd = new SecureRandom();

		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public static int randomNumInteger(int len) {

		String number = randomNumString(len);
		int result = Integer.parseInt(number);
		return result;
	}

	public static String getNumberFromString(String StringValue) {
		String str = StringValue;
		String numberOnly = str.replaceAll("[^0-9]", "");
		return numberOnly;
	}

	public static void copyFile(String sourcePath, String destPath) {
		try {
			Path source = Paths.get(sourcePath);
			Path dest = Paths.get(destPath);
			Files.copy(source, dest);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
