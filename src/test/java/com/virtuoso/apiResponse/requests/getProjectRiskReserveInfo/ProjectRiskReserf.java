package com.virtuoso.apiResponse.requests.getProjectRiskReserveInfo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Id",
"ProjectId",
"ActionType",
"IsEdit",
"Title",
"StatusId",
"StatusName",
"RequestDate",
"CreatedBy",
"RequestedByName",
"ApproverId",
"ApproverName",
"ApprovedById",
"ApprovedByName",
"ApprovedDate",
"RequestAmount",
"ExecutiveSummary",
"BusinessJustification",
"RecoveryPlan",
"SupportingLinks",
"Risks",
"RisksV1",
"RisksJson",
"Issues",
"IssuesV1",
"IssuesJson",
"Comments",
"FileAttachments",
"UpdatedDate",
"ModifiedBy",
"UpdatedByName",
"ProjectRiskReserveHistories",
"RiskReserveApprovals",
"ApprovalType",
"PlannedAmount",
"ConsumedAmount",
"ConsumedPercentage",
"HasOnBehalfApproverAccess",
"HasApproverAccess",
"AvailableRiskReserveStatus",
"Currency",
"RequestType",
"TaskPlanedHours",
"RequiredHours",
"RiskReserveConsumedPercent",
"Reason",
"IsLeadProjectManager",
"IsRequestCreatedByLeadProjectManager",
"BaseLineHours",
"TotalNBUEApproved",
"TotalTPHApproved",
"CumulativeConsumedPercent",
"FinancialInfo",
"RptRequestId",
"IsFromChangePoint",
"TPHRRSubRequestType",
"CPEngagementSummary"
})
public class ProjectRiskReserf {

@JsonProperty("Id")
private Integer id;
@JsonProperty("ProjectId")
private Integer projectId;
@JsonProperty("ActionType")
private Integer actionType;
@JsonProperty("IsEdit")
private Boolean isEdit;
@JsonProperty("Title")
private String title;
@JsonProperty("StatusId")
private Integer statusId;
@JsonProperty("StatusName")
private String statusName;
@JsonProperty("RequestDate")
private String requestDate;
@JsonProperty("CreatedBy")
private String createdBy;
@JsonProperty("RequestedByName")
private String requestedByName;
@JsonProperty("ApproverId")
private Integer approverId;
@JsonProperty("ApproverName")
private String approverName;
@JsonProperty("ApprovedById")
private Object approvedById;
@JsonProperty("ApprovedByName")
private Object approvedByName;
@JsonProperty("ApprovedDate")
private Object approvedDate;
@JsonProperty("RequestAmount")
private Double requestAmount;
@JsonProperty("ExecutiveSummary")
private Object executiveSummary;
@JsonProperty("BusinessJustification")
private Object businessJustification;
@JsonProperty("RecoveryPlan")
private Object recoveryPlan;
@JsonProperty("SupportingLinks")
private Object supportingLinks;
@JsonProperty("Risks")
private Object risks;
@JsonProperty("RisksV1")
private Object risksV1;
@JsonProperty("RisksJson")
private String risksJson;
@JsonProperty("Issues")
private Object issues;
@JsonProperty("IssuesV1")
private Object issuesV1;
@JsonProperty("IssuesJson")
private String issuesJson;
@JsonProperty("Comments")
private Object comments;
@JsonProperty("FileAttachments")
private Object fileAttachments;
@JsonProperty("UpdatedDate")
private String updatedDate;
@JsonProperty("ModifiedBy")
private String modifiedBy;
@JsonProperty("UpdatedByName")
private String updatedByName;
@JsonProperty("ProjectRiskReserveHistories")
private Object projectRiskReserveHistories;
@JsonProperty("RiskReserveApprovals")
private Object riskReserveApprovals;
@JsonProperty("ApprovalType")
private Integer approvalType;
@JsonProperty("PlannedAmount")
private Double plannedAmount;
@JsonProperty("ConsumedAmount")
private Double consumedAmount;
@JsonProperty("ConsumedPercentage")
private Double consumedPercentage;
@JsonProperty("HasOnBehalfApproverAccess")
private Boolean hasOnBehalfApproverAccess;
@JsonProperty("HasApproverAccess")
private Boolean hasApproverAccess;
@JsonProperty("AvailableRiskReserveStatus")
private Object availableRiskReserveStatus;
@JsonProperty("Currency")
private Object currency;
@JsonProperty("RequestType")
private Integer requestType;
@JsonProperty("TaskPlanedHours")
private Double taskPlanedHours;
@JsonProperty("RequiredHours")
private Double requiredHours;
@JsonProperty("RiskReserveConsumedPercent")
private Double riskReserveConsumedPercent;
@JsonProperty("Reason")
private String reason;
@JsonProperty("IsLeadProjectManager")
private Boolean isLeadProjectManager;
@JsonProperty("IsRequestCreatedByLeadProjectManager")
private Boolean isRequestCreatedByLeadProjectManager;
@JsonProperty("BaseLineHours")
private Double baseLineHours;
@JsonProperty("TotalNBUEApproved")
private Double totalNBUEApproved;
@JsonProperty("TotalTPHApproved")
private Double totalTPHApproved;
@JsonProperty("CumulativeConsumedPercent")
private Double cumulativeConsumedPercent;
@JsonProperty("FinancialInfo")
private Object financialInfo;
@JsonProperty("RptRequestId")
private Object rptRequestId;
@JsonProperty("IsFromChangePoint")
private Boolean isFromChangePoint;
@JsonProperty("TPHRRSubRequestType")
private Integer tPHRRSubRequestType;
@JsonProperty("CPEngagementSummary")
private Object cPEngagementSummary;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("ProjectId")
public Integer getProjectId() {
return projectId;
}

@JsonProperty("ProjectId")
public void setProjectId(Integer projectId) {
this.projectId = projectId;
}

@JsonProperty("ActionType")
public Integer getActionType() {
return actionType;
}

@JsonProperty("ActionType")
public void setActionType(Integer actionType) {
this.actionType = actionType;
}

@JsonProperty("IsEdit")
public Boolean getIsEdit() {
return isEdit;
}

@JsonProperty("IsEdit")
public void setIsEdit(Boolean isEdit) {
this.isEdit = isEdit;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("StatusId")
public Integer getStatusId() {
return statusId;
}

@JsonProperty("StatusId")
public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

@JsonProperty("StatusName")
public String getStatusName() {
return statusName;
}

@JsonProperty("StatusName")
public void setStatusName(String statusName) {
this.statusName = statusName;
}

@JsonProperty("RequestDate")
public String getRequestDate() {
return requestDate;
}

@JsonProperty("RequestDate")
public void setRequestDate(String requestDate) {
this.requestDate = requestDate;
}

@JsonProperty("CreatedBy")
public String getCreatedBy() {
return createdBy;
}

@JsonProperty("CreatedBy")
public void setCreatedBy(String createdBy) {
this.createdBy = createdBy;
}

@JsonProperty("RequestedByName")
public String getRequestedByName() {
return requestedByName;
}

@JsonProperty("RequestedByName")
public void setRequestedByName(String requestedByName) {
this.requestedByName = requestedByName;
}

@JsonProperty("ApproverId")
public Integer getApproverId() {
return approverId;
}

@JsonProperty("ApproverId")
public void setApproverId(Integer approverId) {
this.approverId = approverId;
}

@JsonProperty("ApproverName")
public String getApproverName() {
return approverName;
}

@JsonProperty("ApproverName")
public void setApproverName(String approverName) {
this.approverName = approverName;
}

@JsonProperty("ApprovedById")
public Object getApprovedById() {
return approvedById;
}

@JsonProperty("ApprovedById")
public void setApprovedById(Object approvedById) {
this.approvedById = approvedById;
}

@JsonProperty("ApprovedByName")
public Object getApprovedByName() {
return approvedByName;
}

@JsonProperty("ApprovedByName")
public void setApprovedByName(Object approvedByName) {
this.approvedByName = approvedByName;
}

@JsonProperty("ApprovedDate")
public Object getApprovedDate() {
return approvedDate;
}

@JsonProperty("ApprovedDate")
public void setApprovedDate(Object approvedDate) {
this.approvedDate = approvedDate;
}

@JsonProperty("RequestAmount")
public Double getRequestAmount() {
return requestAmount;
}

@JsonProperty("RequestAmount")
public void setRequestAmount(Double requestAmount) {
this.requestAmount = requestAmount;
}

@JsonProperty("ExecutiveSummary")
public Object getExecutiveSummary() {
return executiveSummary;
}

@JsonProperty("ExecutiveSummary")
public void setExecutiveSummary(Object executiveSummary) {
this.executiveSummary = executiveSummary;
}

@JsonProperty("BusinessJustification")
public Object getBusinessJustification() {
return businessJustification;
}

@JsonProperty("BusinessJustification")
public void setBusinessJustification(Object businessJustification) {
this.businessJustification = businessJustification;
}

@JsonProperty("RecoveryPlan")
public Object getRecoveryPlan() {
return recoveryPlan;
}

@JsonProperty("RecoveryPlan")
public void setRecoveryPlan(Object recoveryPlan) {
this.recoveryPlan = recoveryPlan;
}

@JsonProperty("SupportingLinks")
public Object getSupportingLinks() {
return supportingLinks;
}

@JsonProperty("SupportingLinks")
public void setSupportingLinks(Object supportingLinks) {
this.supportingLinks = supportingLinks;
}

@JsonProperty("Risks")
public Object getRisks() {
return risks;
}

@JsonProperty("Risks")
public void setRisks(Object risks) {
this.risks = risks;
}

@JsonProperty("RisksV1")
public Object getRisksV1() {
return risksV1;
}

@JsonProperty("RisksV1")
public void setRisksV1(Object risksV1) {
this.risksV1 = risksV1;
}

@JsonProperty("RisksJson")
public String getRisksJson() {
return risksJson;
}

@JsonProperty("RisksJson")
public void setRisksJson(String risksJson) {
this.risksJson = risksJson;
}

@JsonProperty("Issues")
public Object getIssues() {
return issues;
}

@JsonProperty("Issues")
public void setIssues(Object issues) {
this.issues = issues;
}

@JsonProperty("IssuesV1")
public Object getIssuesV1() {
return issuesV1;
}

@JsonProperty("IssuesV1")
public void setIssuesV1(Object issuesV1) {
this.issuesV1 = issuesV1;
}

@JsonProperty("IssuesJson")
public String getIssuesJson() {
return issuesJson;
}

@JsonProperty("IssuesJson")
public void setIssuesJson(String issuesJson) {
this.issuesJson = issuesJson;
}

@JsonProperty("Comments")
public Object getComments() {
return comments;
}

@JsonProperty("Comments")
public void setComments(Object comments) {
this.comments = comments;
}

@JsonProperty("FileAttachments")
public Object getFileAttachments() {
return fileAttachments;
}

@JsonProperty("FileAttachments")
public void setFileAttachments(Object fileAttachments) {
this.fileAttachments = fileAttachments;
}

@JsonProperty("UpdatedDate")
public String getUpdatedDate() {
return updatedDate;
}

@JsonProperty("UpdatedDate")
public void setUpdatedDate(String updatedDate) {
this.updatedDate = updatedDate;
}

@JsonProperty("ModifiedBy")
public String getModifiedBy() {
return modifiedBy;
}

@JsonProperty("ModifiedBy")
public void setModifiedBy(String modifiedBy) {
this.modifiedBy = modifiedBy;
}

@JsonProperty("UpdatedByName")
public String getUpdatedByName() {
return updatedByName;
}

@JsonProperty("UpdatedByName")
public void setUpdatedByName(String updatedByName) {
this.updatedByName = updatedByName;
}

@JsonProperty("ProjectRiskReserveHistories")
public Object getProjectRiskReserveHistories() {
return projectRiskReserveHistories;
}

@JsonProperty("ProjectRiskReserveHistories")
public void setProjectRiskReserveHistories(Object projectRiskReserveHistories) {
this.projectRiskReserveHistories = projectRiskReserveHistories;
}

@JsonProperty("RiskReserveApprovals")
public Object getRiskReserveApprovals() {
return riskReserveApprovals;
}

@JsonProperty("RiskReserveApprovals")
public void setRiskReserveApprovals(Object riskReserveApprovals) {
this.riskReserveApprovals = riskReserveApprovals;
}

@JsonProperty("ApprovalType")
public Integer getApprovalType() {
return approvalType;
}

@JsonProperty("ApprovalType")
public void setApprovalType(Integer approvalType) {
this.approvalType = approvalType;
}

@JsonProperty("PlannedAmount")
public Double getPlannedAmount() {
return plannedAmount;
}

@JsonProperty("PlannedAmount")
public void setPlannedAmount(Double plannedAmount) {
this.plannedAmount = plannedAmount;
}

@JsonProperty("ConsumedAmount")
public Double getConsumedAmount() {
return consumedAmount;
}

@JsonProperty("ConsumedAmount")
public void setConsumedAmount(Double consumedAmount) {
this.consumedAmount = consumedAmount;
}

@JsonProperty("ConsumedPercentage")
public Double getConsumedPercentage() {
return consumedPercentage;
}

@JsonProperty("ConsumedPercentage")
public void setConsumedPercentage(Double consumedPercentage) {
this.consumedPercentage = consumedPercentage;
}

@JsonProperty("HasOnBehalfApproverAccess")
public Boolean getHasOnBehalfApproverAccess() {
return hasOnBehalfApproverAccess;
}

@JsonProperty("HasOnBehalfApproverAccess")
public void setHasOnBehalfApproverAccess(Boolean hasOnBehalfApproverAccess) {
this.hasOnBehalfApproverAccess = hasOnBehalfApproverAccess;
}

@JsonProperty("HasApproverAccess")
public Boolean getHasApproverAccess() {
return hasApproverAccess;
}

@JsonProperty("HasApproverAccess")
public void setHasApproverAccess(Boolean hasApproverAccess) {
this.hasApproverAccess = hasApproverAccess;
}

@JsonProperty("AvailableRiskReserveStatus")
public Object getAvailableRiskReserveStatus() {
return availableRiskReserveStatus;
}

@JsonProperty("AvailableRiskReserveStatus")
public void setAvailableRiskReserveStatus(Object availableRiskReserveStatus) {
this.availableRiskReserveStatus = availableRiskReserveStatus;
}

@JsonProperty("Currency")
public Object getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(Object currency) {
this.currency = currency;
}

@JsonProperty("RequestType")
public Integer getRequestType() {
return requestType;
}

@JsonProperty("RequestType")
public void setRequestType(Integer requestType) {
this.requestType = requestType;
}

@JsonProperty("TaskPlanedHours")
public Double getTaskPlanedHours() {
return taskPlanedHours;
}

@JsonProperty("TaskPlanedHours")
public void setTaskPlanedHours(Double taskPlanedHours) {
this.taskPlanedHours = taskPlanedHours;
}

@JsonProperty("RequiredHours")
public Double getRequiredHours() {
return requiredHours;
}

@JsonProperty("RequiredHours")
public void setRequiredHours(Double requiredHours) {
this.requiredHours = requiredHours;
}

@JsonProperty("RiskReserveConsumedPercent")
public Double getRiskReserveConsumedPercent() {
return riskReserveConsumedPercent;
}

@JsonProperty("RiskReserveConsumedPercent")
public void setRiskReserveConsumedPercent(Double riskReserveConsumedPercent) {
this.riskReserveConsumedPercent = riskReserveConsumedPercent;
}

@JsonProperty("Reason")
public String getReason() {
return reason;
}

@JsonProperty("Reason")
public void setReason(String reason) {
this.reason = reason;
}

@JsonProperty("IsLeadProjectManager")
public Boolean getIsLeadProjectManager() {
return isLeadProjectManager;
}

@JsonProperty("IsLeadProjectManager")
public void setIsLeadProjectManager(Boolean isLeadProjectManager) {
this.isLeadProjectManager = isLeadProjectManager;
}

@JsonProperty("IsRequestCreatedByLeadProjectManager")
public Boolean getIsRequestCreatedByLeadProjectManager() {
return isRequestCreatedByLeadProjectManager;
}

@JsonProperty("IsRequestCreatedByLeadProjectManager")
public void setIsRequestCreatedByLeadProjectManager(Boolean isRequestCreatedByLeadProjectManager) {
this.isRequestCreatedByLeadProjectManager = isRequestCreatedByLeadProjectManager;
}

@JsonProperty("BaseLineHours")
public Double getBaseLineHours() {
return baseLineHours;
}

@JsonProperty("BaseLineHours")
public void setBaseLineHours(Double baseLineHours) {
this.baseLineHours = baseLineHours;
}

@JsonProperty("TotalNBUEApproved")
public Double getTotalNBUEApproved() {
return totalNBUEApproved;
}

@JsonProperty("TotalNBUEApproved")
public void setTotalNBUEApproved(Double totalNBUEApproved) {
this.totalNBUEApproved = totalNBUEApproved;
}

@JsonProperty("TotalTPHApproved")
public Double getTotalTPHApproved() {
return totalTPHApproved;
}

@JsonProperty("TotalTPHApproved")
public void setTotalTPHApproved(Double totalTPHApproved) {
this.totalTPHApproved = totalTPHApproved;
}

@JsonProperty("CumulativeConsumedPercent")
public Double getCumulativeConsumedPercent() {
return cumulativeConsumedPercent;
}

@JsonProperty("CumulativeConsumedPercent")
public void setCumulativeConsumedPercent(Double cumulativeConsumedPercent) {
this.cumulativeConsumedPercent = cumulativeConsumedPercent;
}

@JsonProperty("FinancialInfo")
public Object getFinancialInfo() {
return financialInfo;
}

@JsonProperty("FinancialInfo")
public void setFinancialInfo(Object financialInfo) {
this.financialInfo = financialInfo;
}

@JsonProperty("RptRequestId")
public Object getRptRequestId() {
return rptRequestId;
}

@JsonProperty("RptRequestId")
public void setRptRequestId(Object rptRequestId) {
this.rptRequestId = rptRequestId;
}

@JsonProperty("IsFromChangePoint")
public Boolean getIsFromChangePoint() {
return isFromChangePoint;
}

@JsonProperty("IsFromChangePoint")
public void setIsFromChangePoint(Boolean isFromChangePoint) {
this.isFromChangePoint = isFromChangePoint;
}

@JsonProperty("TPHRRSubRequestType")
public Integer getTPHRRSubRequestType() {
return tPHRRSubRequestType;
}

@JsonProperty("TPHRRSubRequestType")
public void setTPHRRSubRequestType(Integer tPHRRSubRequestType) {
this.tPHRRSubRequestType = tPHRRSubRequestType;
}

@JsonProperty("CPEngagementSummary")
public Object getCPEngagementSummary() {
return cPEngagementSummary;
}

@JsonProperty("CPEngagementSummary")
public void setCPEngagementSummary(Object cPEngagementSummary) {
this.cPEngagementSummary = cPEngagementSummary;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

