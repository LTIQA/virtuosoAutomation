package com.virtuoso.pages.apiMobileFunctionalities.projectRequests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.apiResponse.CreateProjectRiskReserveResp;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.frameworkLib.api.ServiceUrl;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;
import com.virtuoso.payloads.requests.payloadTPH.CreateProjectRiskReserve;
import com.virtuoso.payloads.requests.payloadTPH.RiskReserveApproval;
import com.virtuoso.payloads.requests.payloadTPH.Role;

public class RequestsTPHAPI extends RestActions {

	static ClientResponse ClientResponse;
	static ObjectMapper mapper = new ObjectMapper();

	public List<CreateProjectRiskReserveResp> createRequestTPH_L1Approver(String accessToken, String projectId,
			String reqTitle, String reqAmount, String reqHours, Double baseLineHours, String reqExecutiveSummary,
			String reqBusineJustification, String reqComments, String aliasUserId, int approvaerId) throws Throwable {

		CreateProjectRiskReserve createProjectRiskReserve = new CreateProjectRiskReserve();
		RiskReserveApproval riskReserveApproval = new RiskReserveApproval();

		List<RiskReserveApproval> riskReserveApprovalList = new ArrayList<RiskReserveApproval>();

		List<CreateProjectRiskReserveResp> createProjectRiskReserveRespObj = new ArrayList<CreateProjectRiskReserveResp>();

		createProjectRiskReserve.setProjectId(projectId);
		createProjectRiskReserve.setTitle(reqTitle);
		createProjectRiskReserve.setRequestAmount(reqAmount);
		createProjectRiskReserve.setExecutiveSummary(reqExecutiveSummary);
		createProjectRiskReserve.setBusinessJustification(reqBusineJustification);
		createProjectRiskReserve.setComments(reqComments);
		createProjectRiskReserve.setActionType("Create");
		createProjectRiskReserve.setApprovalType("2");
		createProjectRiskReserve.setRequestType("2");
		createProjectRiskReserve.setRequiredHours(reqHours);
		createProjectRiskReserve.setBaseLineHours(baseLineHours);
		createProjectRiskReserve.setReason("Change Request");

		riskReserveApproval.setAlias(aliasUserId);
		riskReserveApproval.setApproverId(approvaerId);
		riskReserveApproval.setRoleId(4);
		riskReserveApproval.setProjectId(projectId);
		riskReserveApproval.setSequence(1);
		riskReserveApproval.setRiskReserveRuleId(62);

		riskReserveApprovalList.add(riskReserveApproval);
		createProjectRiskReserve.setRiskReserveApprovals(riskReserveApprovalList);

		// Convert object to JSON string
		String jsonInput = mapper.writeValueAsString(createProjectRiskReserve);
		System.out.println("json Input : " + jsonInput);

		ClientResponse = putClientResponse(ServiceUrl.putCreateProjectRiskReserve, jsonInput,
				RestUtils.createStandardHeader(accessToken), null, ServiceUrl.contentTypeAppJson);
		System.out.println("Client Responce : " + ClientResponse.getEntity(String.class));
		/*
		 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		 * createProjectRiskReserveRespObj = mapper.readValue(resp,
		 * mapper.getTypeFactory().constructParametricType(List.class,
		 * CreateProjectRiskReserveResp.class));
		 * 
		 * System.out.println("1 : "+createProjectRiskReserveRespObj);
		 * System.out.println("2 : "+createProjectRiskReserveRespObj.get(0).getId());
		 * System.out.println("3 : "+createProjectRiskReserveRespObj.get(0).
		 * getProjectRiskReserveHistories().get(0).getId());
		 */
		return createProjectRiskReserveRespObj;

	}
	
	
	// @Test
	public void adsfa() throws Throwable {
		AuthenticateAPI authenticate = new AuthenticateAPI();

		AuthenticationResult authResult = authenticate.authenticateUser("virww1@microsoft.com", "Sep@2018");
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);
		String projectId ="19554";
		String reqAmount = "1.00";
		String reqHours = "1.00";
		Double baseLineHours = 3566.02;
		String reqExecutiveSummary = "Executive Summary ";
		String reqBusineJustification = "Busine Justification ";
		String aliasUserId = "virww2@microsoft.com";
		int approvaerId = 224326;
		String reqTitle =Generics.randomString(10)+" Auomation TPH";
		String reqComments = "Comments " + Generics.randomString(10);
		this.createRequestTPH_L1Approver(accessToken, projectId, reqTitle, reqAmount, reqHours, baseLineHours, reqExecutiveSummary, reqBusineJustification, reqComments, aliasUserId, approvaerId);
	}

	

}
