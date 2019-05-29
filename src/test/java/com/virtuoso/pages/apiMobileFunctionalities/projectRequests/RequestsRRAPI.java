package com.virtuoso.pages.apiMobileFunctionalities.projectRequests;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.apiResponse.CreateProjectRiskReserveResp;
import com.virtuoso.apiResponse.requests.getProjectRiskReserveInfo.GetProjectRiskReserveInfo;
import com.virtuoso.apiResponse.requests.updateProjectRiskReserve.UpdateProjectRiskReserve;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.frameworkLib.api.ServiceUrl;
import com.virtuoso.frameworkLib.db.DBUtils;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;
import com.virtuoso.payloads.requests.payloadRR.CreateProjectRiskReserve;
import com.virtuoso.payloads.requests.payloadRR.RiskReserveApproval;
import com.virtuoso.payloads.requests.payloadRR.Role;

public class RequestsRRAPI extends RestActions {


	public List<CreateProjectRiskReserveResp> createRequestRR_L2Approvers(String accessToken, String projectId,
			String reqTitle, String reqAmount, String reqExecutiveSummary, String reqBusineJustification,
			String recoveryPlan, String reqComments,Double plannedAmount,int consumedAmount,String aliasUserId1,
			int approverId1, String aliasUserId2, int approverId2) throws Throwable {

		//RequestsFunctionalities rf=new RequestsFunctionalities();
// List<GetProjectRiskReserveInfo> getProjectRiskReserveInfo=rf.getProjectRiskReserveInfo(accessToken, projectId);

		CreateProjectRiskReserve createProjectRiskReserve = new CreateProjectRiskReserve();
		RiskReserveApproval riskReserveApproval[] = new RiskReserveApproval[2];
		riskReserveApproval[0] = new RiskReserveApproval();
		riskReserveApproval[1] = new RiskReserveApproval();

		Role role[] = new Role[2];
		role[0] = new Role();
		role[1] = new Role();
		List<RiskReserveApproval> riskReserveApprovalList = new ArrayList<RiskReserveApproval>();

		List<CreateProjectRiskReserveResp> createProjectRiskReserveRespObj = new ArrayList<CreateProjectRiskReserveResp>();

		createProjectRiskReserve.setProjectId(projectId);
		createProjectRiskReserve.setTitle(reqTitle);
		createProjectRiskReserve.setRequestAmount(reqAmount);
		createProjectRiskReserve.setExecutiveSummary(reqExecutiveSummary);
		createProjectRiskReserve.setBusinessJustification(reqBusineJustification);
		createProjectRiskReserve.setRecoveryPlan(recoveryPlan);
		createProjectRiskReserve.setComments(reqComments);
		createProjectRiskReserve.setActionType("Create");
		createProjectRiskReserve.setApprovalType("2");
		createProjectRiskReserve.setRequestType("1");
		createProjectRiskReserve.setPlannedAmount(plannedAmount);
		createProjectRiskReserve.setConsumedAmount(consumedAmount);
		riskReserveApproval[0].setAlias(aliasUserId2);
		riskReserveApproval[0].setApproverId(approverId2);
		riskReserveApproval[0].setRoleId(4);
		riskReserveApproval[0].setProjectId(projectId);
		riskReserveApproval[0].setSequence(1);
		riskReserveApproval[0].setRiskReserveRuleId(2);

		riskReserveApproval[1].setAlias(aliasUserId1);
		riskReserveApproval[1].setApproverId(approverId1);
		riskReserveApproval[1].setRoleId(163);
		riskReserveApproval[1].setSequence(0);
		riskReserveApproval[1].setProjectId(projectId);
		riskReserveApproval[1].setRiskReserveRuleId(2);

		riskReserveApprovalList.add(riskReserveApproval[0]);
		riskReserveApprovalList.add(riskReserveApproval[1]);

		createProjectRiskReserve.setRiskReserveApprovals(riskReserveApprovalList);

		ObjectMapper mapper = new ObjectMapper();

		// Convert object to JSON string
		String jsonInput = mapper.writeValueAsString(createProjectRiskReserve);
		System.out.println("json Input : " + jsonInput);

		ClientResponse clientResponse = putClientResponse(ServiceUrl.putCreateProjectRiskReserve, jsonInput,
				RestUtils.createStandardHeader(accessToken), null, ServiceUrl.contentTypeAppJson);
		System.out.println("Client Responce : " + clientResponse.getEntity(String.class));
		return createProjectRiskReserveRespObj;

	}
	
	/*
	 * public void updateRequestRR(String accessToken,String projectId) throws
	 * JsonParseException, JsonMappingException, IOException {
	 * RequestsFunctionalities rf=new RequestsFunctionalities();
	 * List<GetProjectRiskReserveInfo>
	 * getProjectRiskReserveInfo=rf.getProjectRiskReserveInfo(accessToken,
	 * projectId);
	 * 
	 * for(int i=0;i<10;i++) { int reqType =
	 * getProjectRiskReserveInfo.get(0).getProjectRiskReserves().get(i).
	 * getRequestType(); if(reqType == 1) { String
	 * statusName=getProjectRiskReserveInfo.get(0).getProjectRiskReserves().get(i).
	 * getStatusName(); if(statusName.contains("Pending")) { // call cancel API
	 * 
	 * UpdateProjectRiskReserve UpdateProjectRiskReserve = new
	 * UpdateProjectRiskReserve();
	 * 
	 * UpdateProjectRiskReserve.setId(getProjectRiskReserveInfo.get(0).
	 * getProjectRiskReserves().get(i).getId());
	 * UpdateProjectRiskReserve.setProjectId(projectId); UpdateProjectRiskReserve.
	 * UpdateProjectRiskReserve. UpdateProjectRiskReserve. UpdateProjectRiskReserve.
	 * UpdateProjectRiskReserve. UpdateProjectRiskReserve.
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */
}
