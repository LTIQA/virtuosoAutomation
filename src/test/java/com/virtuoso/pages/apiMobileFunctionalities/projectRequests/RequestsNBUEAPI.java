package com.virtuoso.pages.apiMobileFunctionalities.projectRequests;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.apiResponse.CreateProjectRiskReserveResp;
import com.virtuoso.frameworkLib.Constants.Constants;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.frameworkLib.api.ServiceUrl;
import com.virtuoso.frameworkLib.appium.AppiumEngine;
import com.virtuoso.payloads.requests.payloadNBUE.CreateProjectRiskReserve;
import com.virtuoso.payloads.requests.payloadNBUE.RiskReserveApproval;

public class RequestsNBUEAPI extends RestActions {

	static ClientResponse ClientResponse;
	static ObjectMapper mapper = new ObjectMapper();

	public List<CreateProjectRiskReserveResp> createRequestNBUE_L2Approvers(String accessToken, String projectId,
			String reqTitle, String reqAmount, String reqExecutiveSummary, String reqBusineJustification,
			String reqComments, String reqHours, Double baseLineHours, String aliasUserId1, int approvaerId1,
			String aliasUserId2, int approvaerId2) throws Throwable {

		CreateProjectRiskReserve createProjectRiskReserve = new CreateProjectRiskReserve();
		RiskReserveApproval riskReserveApproval[] = new RiskReserveApproval[2];
		riskReserveApproval[0] = new RiskReserveApproval();
		riskReserveApproval[1] = new RiskReserveApproval();
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
		createProjectRiskReserve.setRequestType("3");
		createProjectRiskReserve.setRequiredHours(reqHours);
		createProjectRiskReserve.setBaseLineHours(baseLineHours);
		createProjectRiskReserve.setReason("Change Request");

		riskReserveApproval[0].setAlias(aliasUserId1);
		riskReserveApproval[0].setApproverId(approvaerId1);
		riskReserveApproval[0].setRoleId(4);
		riskReserveApproval[0].setSequence(1);
		riskReserveApproval[0].setRiskReserveRuleId(38);

		riskReserveApproval[1].setAlias(aliasUserId2);
		riskReserveApproval[1].setApproverId(approvaerId2);
		riskReserveApproval[1].setRoleId(159);
		riskReserveApproval[1].setSequence(2);
		riskReserveApproval[1].setRiskReserveRuleId(38);

		riskReserveApprovalList.add(riskReserveApproval[0]);
		riskReserveApprovalList.add(riskReserveApproval[1]);

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

	

}
