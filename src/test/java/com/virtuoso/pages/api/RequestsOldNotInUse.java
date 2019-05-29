package com.virtuoso.pages.api;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.apiResponse.CreateProjectRiskReserveResp;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.frameworkLib.api.ServiceUrl;

public class RequestsOldNotInUse extends RestActions {
	/*
	 * 
	 * static ClientResponse ClientResponse; static ClientResponse ClientResponse1;
	 * 
	 * static String resp = ""; static String jsonStr = ""; static ObjectMapper
	 * mapper = new ObjectMapper();
	 * 
	 * public List<CreateProjectRiskReserveResp> createRequestTPH(String
	 * accessToken, String reqTitle, String reqExecutiveSummary, String
	 * reqBusineJustification, String reqComments) throws Throwable {
	 * 
	 * CreateProjectRiskReserve createProjectRiskReserve = new
	 * CreateProjectRiskReserve(); Role role = new Role(); RiskReserveApproval
	 * riskReserveApproval = new RiskReserveApproval();
	 * 
	 * List<RiskReserveApproval> riskReserveApprovalList = new
	 * ArrayList<RiskReserveApproval>();
	 * 
	 * List<CreateProjectRiskReserveResp> createProjectRiskReserveRespObj = new
	 * ArrayList<CreateProjectRiskReserveResp>();
	 * 
	 * createProjectRiskReserve.setId(0);
	 * createProjectRiskReserve.setProjectId("19554");
	 * createProjectRiskReserve.setTitle(reqTitle);
	 * createProjectRiskReserve.setRequestAmount("10000.00");
	 * createProjectRiskReserve.setExecutiveSummary(reqExecutiveSummary);
	 * createProjectRiskReserve.setBusinessJustification(reqBusineJustification);
	 * createProjectRiskReserve.setComments(reqComments);
	 * createProjectRiskReserve.setActionType("Create");
	 * createProjectRiskReserve.setConsumedPercentage("28.04");
	 * createProjectRiskReserve.setConsumedAmount(0);
	 * createProjectRiskReserve.setApprovalType("2");
	 * createProjectRiskReserve.setRequestType("2");
	 * createProjectRiskReserve.setTPHRRSubRequestType(0);
	 * createProjectRiskReserve.setRequiredHours("1000.00");
	 * createProjectRiskReserve.setTaskPlanedHours(0);
	 * createProjectRiskReserve.setBaseLineHours(3566.02);
	 * createProjectRiskReserve.setIsEdit(true);
	 * createProjectRiskReserve.setReason("Change Request");
	 * 
	 * riskReserveApproval.setId(1572700);
	 * riskReserveApproval.setName("VirtuosoWWTest2");
	 * riskReserveApproval.setUserId(224326);
	 * riskReserveApproval.setAlias("virww2@microsoft.com");
	 * riskReserveApproval.setStartDate("/Date(1549065600000)/");
	 * riskReserveApproval.setIsActive(true);
	 * riskReserveApproval.setProjectTimeZone("India Standard Time");
	 * riskReserveApproval.setApproverId(224326); riskReserveApproval.setRoleId(4);
	 * riskReserveApproval.setProjectId("19554");
	 * riskReserveApproval.setRojectRiskReserveId(0);
	 * riskReserveApproval.setSequence(1);
	 * riskReserveApproval.setRiskReserveRuleId(62);
	 * 
	 * role.setRoleId(4); role.setName("DMM - Domain");
	 * role.setRoleCategory("DMM - Domain"); role.setRoleCategoryId(4);
	 * 
	 * riskReserveApproval.setRole(role);
	 * riskReserveApprovalList.add(riskReserveApproval);
	 * createProjectRiskReserve.setRiskReserveApprovals(riskReserveApprovalList);
	 * 
	 * // Convert object to JSON string String jsonInput =
	 * mapper.writeValueAsString(createProjectRiskReserve);
	 * System.out.println("json Input : " + jsonInput);
	 * 
	 * ClientResponse = putClientResponse(ServiceUrl.CreateProjectRiskReserve,
	 * jsonInput, RestUtils.createStandardHeader(accessToken), null,
	 * ServiceUrl.contentTypeAppJson); System.out.println("Client Responce : " +
	 * ClientResponse.getEntity(String.class));
	 * 
	 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	 * createProjectRiskReserveRespObj = mapper.readValue(resp,
	 * mapper.getTypeFactory().constructParametricType(List.class,
	 * CreateProjectRiskReserveResp.class));
	 * 
	 * System.out.println("1 : "+createProjectRiskReserveRespObj);
	 * System.out.println("2 : "+createProjectRiskReserveRespObj.get(0).getId());
	 * System.out.println("3 : "+createProjectRiskReserveRespObj.get(0).
	 * getProjectRiskReserveHistories().get(0).getId());
	 * 
	 * return createProjectRiskReserveRespObj;
	 * 
	 * }
	 * 
	 * public List<CreateProjectRiskReserveResp> createRequestRR(String accessToken,
	 * String reqTitle, String reqExecutiveSummary, String reqBusineJustification,
	 * String reqComments) throws Throwable {
	 * 
	 * CreateProjectRiskReserve createProjectRiskReserve = new
	 * CreateProjectRiskReserve(); Role role = new Role(); RiskReserveApproval
	 * riskReserveApproval = new RiskReserveApproval();
	 * 
	 * List<RiskReserveApproval> riskReserveApprovalList = new
	 * ArrayList<RiskReserveApproval>();
	 * 
	 * List<CreateProjectRiskReserveResp> createProjectRiskReserveRespObj = new
	 * ArrayList<CreateProjectRiskReserveResp>();
	 * 
	 * createProjectRiskReserve.setId(0);
	 * createProjectRiskReserve.setProjectId("19554");
	 * createProjectRiskReserve.setTitle(reqTitle);
	 * createProjectRiskReserve.setRequestAmount("10.00");
	 * createProjectRiskReserve.setExecutiveSummary(reqExecutiveSummary);
	 * createProjectRiskReserve.setBusinessJustification(reqBusineJustification);
	 * createProjectRiskReserve.setComments(reqComments);
	 * createProjectRiskReserve.setActionType("Create");
	 * createProjectRiskReserve.setConsumedPercentage("0.00");
	 * createProjectRiskReserve.setConsumedAmount(0);
	 * createProjectRiskReserve.setApprovalType("2");
	 * createProjectRiskReserve.setRequestType("1");
	 * createProjectRiskReserve.setIsEdit(true);
	 * createProjectRiskReserve.setReason("NA");
	 * 
	 * riskReserveApproval.setId(1572700);
	 * riskReserveApproval.setName("VirtuosoWWTest2");
	 * riskReserveApproval.setUserId(224326);
	 * riskReserveApproval.setAlias("virww2@microsoft.com");
	 * riskReserveApproval.setStartDate("/Date(1549065600000)/");
	 * riskReserveApproval.setIsActive(true);
	 * riskReserveApproval.setProjectTimeZone("India Standard Time");
	 * riskReserveApproval.setApproverId(224326); riskReserveApproval.setRoleId(4);
	 * riskReserveApproval.setProjectId("19554");
	 * riskReserveApproval.setRojectRiskReserveId(0);
	 * riskReserveApproval.setSequence(1);
	 * riskReserveApproval.setRiskReserveRuleId(62);
	 * 
	 * role.setRoleId(4); role.setName("DMM - Domain");
	 * role.setRoleCategory("DMM - Domain"); role.setRoleCategoryId(4);
	 * 
	 * riskReserveApproval.setRole(role);
	 * riskReserveApprovalList.add(riskReserveApproval);
	 * createProjectRiskReserve.setRiskReserveApprovals(riskReserveApprovalList);
	 * 
	 * // Convert object to JSON string String jsonInput =
	 * mapper.writeValueAsString(createProjectRiskReserve);
	 * System.out.println("json Input : " + jsonInput);
	 * 
	 * ClientResponse = putClientResponse(ServiceUrl.CreateProjectRiskReserve,
	 * jsonInput, RestUtils.createStandardHeader(accessToken), null,
	 * ServiceUrl.contentTypeAppJson); System.out.println("Client Responce : " +
	 * ClientResponse.getEntity(String.class)); return
	 * createProjectRiskReserveRespObj; }
	 * 
	 * 
	 */}
