
package com.virtuoso.payloads.requests.payloadRR;

import java.util.HashMap;
import java.util.List;
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
"Title",
"ApproverId",
"RptRequestId",
"ApprovedById",
"ApprovedDate",
"RequestAmount",
"ExecutiveSummary",
"BusinessJustification",
"RecoveryPlan",
"SupportingLinks",
"RisksV1",
"IssuesV1",
"Comments",
"FileAttachments",
"ActionType",
"RiskReserveApprovals",
"ConsumedPercentage",
"ConsumedAmount",
"PlannedAmount",
"ApprovalType",
"RequestType",
"TPHRRSubRequestType",
"RequiredHours",
"TaskPlanedHours",
"BaseLineHours",
"IsEdit",
"Reason"
})
public class CreateProjectRiskReserve {

@JsonProperty("Id")
private Integer id;
@JsonProperty("ProjectId")
private String projectId;
@JsonProperty("Title")
private String title;
@JsonProperty("ApproverId")
private Object approverId;
@JsonProperty("RptRequestId")
private Object rptRequestId;
@JsonProperty("ApprovedById")
private Object approvedById;
@JsonProperty("ApprovedDate")
private Object approvedDate;
@JsonProperty("RequestAmount")
private String requestAmount;
@JsonProperty("ExecutiveSummary")
private String executiveSummary;
@JsonProperty("BusinessJustification")
private String businessJustification;
@JsonProperty("RecoveryPlan")
private String recoveryPlan;
@JsonProperty("SupportingLinks")
private List<Object> supportingLinks = null;
@JsonProperty("RisksV1")
private List<Object> risksV1 = null;
@JsonProperty("IssuesV1")
private List<Object> issuesV1 = null;
@JsonProperty("Comments")
private String comments;
@JsonProperty("FileAttachments")
private FileAttachments fileAttachments;
@JsonProperty("ActionType")
private String actionType;
@JsonProperty("RiskReserveApprovals")
private List<RiskReserveApproval> riskReserveApprovals = null;
@JsonProperty("ConsumedPercentage")
private String consumedPercentage;
@JsonProperty("ConsumedAmount")
private Integer consumedAmount;
@JsonProperty("PlannedAmount")
private Double plannedAmount;
@JsonProperty("ApprovalType")
private String approvalType;
@JsonProperty("RequestType")
private String requestType;
@JsonProperty("TPHRRSubRequestType")
private Integer tPHRRSubRequestType;
@JsonProperty("RequiredHours")
private Integer requiredHours;
@JsonProperty("TaskPlanedHours")
private Integer taskPlanedHours;
@JsonProperty("BaseLineHours")
private Integer baseLineHours;
@JsonProperty("IsEdit")
private Boolean isEdit;
@JsonProperty("Reason")
private String reason;
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
public String getProjectId() {
return projectId;
}

@JsonProperty("ProjectId")
public void setProjectId(String projectId) {
this.projectId = projectId;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("ApproverId")
public Object getApproverId() {
return approverId;
}

@JsonProperty("ApproverId")
public void setApproverId(Object approverId) {
this.approverId = approverId;
}

@JsonProperty("RptRequestId")
public Object getRptRequestId() {
return rptRequestId;
}

@JsonProperty("RptRequestId")
public void setRptRequestId(Object rptRequestId) {
this.rptRequestId = rptRequestId;
}

@JsonProperty("ApprovedById")
public Object getApprovedById() {
return approvedById;
}

@JsonProperty("ApprovedById")
public void setApprovedById(Object approvedById) {
this.approvedById = approvedById;
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
public String getRequestAmount() {
return requestAmount;
}

@JsonProperty("RequestAmount")
public void setRequestAmount(String requestAmount) {
this.requestAmount = requestAmount;
}

@JsonProperty("ExecutiveSummary")
public String getExecutiveSummary() {
return executiveSummary;
}

@JsonProperty("ExecutiveSummary")
public void setExecutiveSummary(String executiveSummary) {
this.executiveSummary = executiveSummary;
}

@JsonProperty("BusinessJustification")
public String getBusinessJustification() {
return businessJustification;
}

@JsonProperty("BusinessJustification")
public void setBusinessJustification(String businessJustification) {
this.businessJustification = businessJustification;
}

@JsonProperty("RecoveryPlan")
public String getRecoveryPlan() {
return recoveryPlan;
}

@JsonProperty("RecoveryPlan")
public void setRecoveryPlan(String recoveryPlan) {
this.recoveryPlan = recoveryPlan;
}

@JsonProperty("SupportingLinks")
public List<Object> getSupportingLinks() {
return supportingLinks;
}

@JsonProperty("SupportingLinks")
public void setSupportingLinks(List<Object> supportingLinks) {
this.supportingLinks = supportingLinks;
}

@JsonProperty("RisksV1")
public List<Object> getRisksV1() {
return risksV1;
}

@JsonProperty("RisksV1")
public void setRisksV1(List<Object> risksV1) {
this.risksV1 = risksV1;
}

@JsonProperty("IssuesV1")
public List<Object> getIssuesV1() {
return issuesV1;
}

@JsonProperty("IssuesV1")
public void setIssuesV1(List<Object> issuesV1) {
this.issuesV1 = issuesV1;
}

@JsonProperty("Comments")
public String getComments() {
return comments;
}

@JsonProperty("Comments")
public void setComments(String comments) {
this.comments = comments;
}

@JsonProperty("FileAttachments")
public FileAttachments getFileAttachments() {
return fileAttachments;
}

@JsonProperty("FileAttachments")
public void setFileAttachments(FileAttachments fileAttachments) {
this.fileAttachments = fileAttachments;
}

@JsonProperty("ActionType")
public String getActionType() {
return actionType;
}

@JsonProperty("ActionType")
public void setActionType(String actionType) {
this.actionType = actionType;
}

@JsonProperty("RiskReserveApprovals")
public List<RiskReserveApproval> getRiskReserveApprovals() {
return riskReserveApprovals;
}

@JsonProperty("RiskReserveApprovals")
public void setRiskReserveApprovals(List<RiskReserveApproval> riskReserveApprovals) {
this.riskReserveApprovals = riskReserveApprovals;
}

@JsonProperty("ConsumedPercentage")
public String getConsumedPercentage() {
return consumedPercentage;
}

@JsonProperty("ConsumedPercentage")
public void setConsumedPercentage(String consumedPercentage) {
this.consumedPercentage = consumedPercentage;
}

@JsonProperty("ConsumedAmount")
public Integer getConsumedAmount() {
return consumedAmount;
}

@JsonProperty("ConsumedAmount")
public void setConsumedAmount(Integer consumedAmount) {
this.consumedAmount = consumedAmount;
}

@JsonProperty("PlannedAmount")
public Double getPlannedAmount() {
return plannedAmount;
}

@JsonProperty("PlannedAmount")
public void setPlannedAmount(Double plannedAmount) {
this.plannedAmount = plannedAmount;
}

@JsonProperty("ApprovalType")
public String getApprovalType() {
return approvalType;
}

@JsonProperty("ApprovalType")
public void setApprovalType(String approvalType) {
this.approvalType = approvalType;
}

@JsonProperty("RequestType")
public String getRequestType() {
return requestType;
}

@JsonProperty("RequestType")
public void setRequestType(String requestType) {
this.requestType = requestType;
}

@JsonProperty("TPHRRSubRequestType")
public Integer getTPHRRSubRequestType() {
return tPHRRSubRequestType;
}

@JsonProperty("TPHRRSubRequestType")
public void setTPHRRSubRequestType(Integer tPHRRSubRequestType) {
this.tPHRRSubRequestType = tPHRRSubRequestType;
}

@JsonProperty("RequiredHours")
public Integer getRequiredHours() {
return requiredHours;
}

@JsonProperty("RequiredHours")
public void setRequiredHours(Integer requiredHours) {
this.requiredHours = requiredHours;
}

@JsonProperty("TaskPlanedHours")
public Integer getTaskPlanedHours() {
return taskPlanedHours;
}

@JsonProperty("TaskPlanedHours")
public void setTaskPlanedHours(Integer taskPlanedHours) {
this.taskPlanedHours = taskPlanedHours;
}

@JsonProperty("BaseLineHours")
public Integer getBaseLineHours() {
return baseLineHours;
}

@JsonProperty("BaseLineHours")
public void setBaseLineHours(Integer baseLineHours) {
this.baseLineHours = baseLineHours;
}

@JsonProperty("IsEdit")
public Boolean getIsEdit() {
return isEdit;
}

@JsonProperty("IsEdit")
public void setIsEdit(Boolean isEdit) {
this.isEdit = isEdit;
}

@JsonProperty("Reason")
public String getReason() {
return reason;
}

@JsonProperty("Reason")
public void setReason(String reason) {
this.reason = reason;
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

