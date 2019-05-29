package com.virtuoso.suites.testcases.api;

import java.io.IOException;
import org.junit.experimental.categories.Category;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestEngine;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.suites.testGroupNames.P2;
import com.virtuoso.suites.testGroupNames.All;
import com.virtuoso.suites.testGroupNames.Regression;
import com.virtuoso.suites.testGroupNames.SmokeTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class APIUserAccess extends RestEngine {

	RestActions ra = new RestActions();
	static String jsonStr, resp, TransitMediaId, ProductCatalogId, AllowedCurrency, FundingSourceId = "";
	static ClientResponse clientResponse;

	private static ObjectMapper jsonPrinter(String resp)
			throws IOException, JsonParseException, JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		Object jsonObject = mapper.readValue(resp, Object.class);
		System.out.println("API Response: \n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject));
		return mapper;
	}

	//@Test
	@Feature("Feature : API User Access ")
	@Story("User Story : Login")
	@DisplayName("Test Case : 1. Verify that an authorized user is able to login to “My Virtuoso” Mobile application with valid credentials")
	@Category({ P2.class, SmokeTests.class, Regression.class, All.class })
	public void getReminderNotifications() throws Throwable {
		
		  System.out.println("accessToken :"+accessToken);
		/*
		 * clientResponse = ra.getClientResponse(Constants.getReminderNotifications,
		 * RestUtils.createStandardHeader(accessToken), null, "application/json");
		 * 
		 * // Capture client response for Get TransitMedia API resp =
		 * clientResponse.getEntity(String.class);
		 */  
		 // ObjectMapper mapper = jsonPrinter(resp);
		  
		  // Reading the Json for Get TransitMedia API // 
		/*
		 * respObj = mapper.readValue(resp, //
		 * mapper.getTypeFactory().constructParametricType(List.class, //
		 * TransmitMedia.class));
		 */
		  String url = "https://virtuosodevapi.azurewebsites.net/api/riskreserve/CreateProjectRiskReserve";
		 String input="{\"Id\":0,\"ProjectId\":\"19554\",\"Title\":\"rwghresth\",\"ApproverId\":null,\"RptRequestId\":null,\"ApprovedById\":null,\"ApprovedDate\":null,\"RequestAmount\":\"10000.00\",\"ExecutiveSummary\":\"sdgfhdshgse\",\"BusinessJustification\":\"dgnds\",\"RecoveryPlan\":\"\",\"SupportingLinks\":[],\"RisksV1\":[],\"IssuesV1\":[],\"Comments\":\"sdgnhdsghds\",\"FileAttachments\":{},\"ActionType\":\"Create\",\"RiskReserveApprovals\":[{\"Id\":1572700,\"Name\":\"VirtuosoWWTest2\",\"UserId\":224326,\"Alias\":\"virww2@microsoft.com\",\"Role\":{\"RoleId\":4,\"Name\":\"DMM - Domain\",\"RoleCategory\":\"DMM - Domain\",\"RoleCategoryId\":4},\"StartDate\":\"/Date(1549065600000)/\",\"EndDate\":null,\"IsUserActive\":true,\"IsActive\":true,\"ProjectTimeZone\":\"India Standard Time\",\"Timezone\":null,\"Domain\":null,\"ApproverId\":224326,\"RoleId\":4,\"ProjectId\":\"19554\",\"rojectRiskReserveId\":0,\"Sequence\":1,\"RiskReserveRuleId\":62}],\"ConsumedPercentage\":\"28.04\",\"ConsumedAmount\":0,\"ApprovalType\":\"2\",\"RequestType\":\"2\",\"TPHRRSubRequestType\":0,\"RequiredHours\":\"1000.00\",\"TaskPlanedHours\":0,\"BaseLineHours\":3566.02,\"IsEdit\":true,\"Reason\":\"Change Request\"}";
		  clientResponse = ra.putClientResponse(url, input, RestUtils.createStandardHeader(accessToken), null, "application/json");
		clientResponse.getEntity(String.class);
		System.out.println("Done");
	}
}
