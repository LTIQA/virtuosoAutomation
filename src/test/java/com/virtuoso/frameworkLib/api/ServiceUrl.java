package com.virtuoso.frameworkLib.api;

import org.apache.log4j.Logger;

import com.virtuoso.frameworkLib.Constants.Generics;

public class ServiceUrl {

	private static final Logger LOG = Logger.getLogger(ServiceUrl.class.getName());

	// ++++++++++++++++++++++++++ Url Constants ++++++++++++++++++++++++

	public static final String BaseUrl = Generics.getPropValueConfig("baseUrl_" + Generics.getExecutionServer());
	public static final String getReminderNotifications = BaseUrl
			+ "api/notification/GetReminderNotifications/{userAlias}";
	public static final String putCreateProjectRiskReserve = BaseUrl + "api/riskreserve/CreateProjectRiskReserve";

	public static final String contentTypeAppJson = "application/json";

	public static final String getApprovals = BaseUrl
			+ "api/riskreserve/GetApprovals/{consumedAmount}/{requestedAmount}/{totalAmount}/{deal}/{requiredHours}/{requestType}/{projectId}/{requestSubtype}";

	public static final String getProjectRiskReserveInfo = BaseUrl
			+ "api/riskreserve/GetProjectRiskReserveInfo/{projectId}";

	public static final String putUpdateProjectRiskReserve = BaseUrl + "api/riskreserve/UpdateProjectRiskReserve";

	// ++++++++++++++++++++++++++ API Constants ++++++++++++++++++++++++

	public static final String azureClientID = Generics.getPropValueConfig("clientID_" + Generics.getPlatformName());
	public static final String azureAuthorityUrl = "https://login.microsoftonline.com/microsoft.onmicrosoft.com/oauth2";

	public String getCallerClassName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getClassName();
	}

	public String getCallerMethodName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getMethodName();
	}

}
