package com.virtuoso.apiResponse;

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
"ApproverId",
"RoleId",
"ProjectId",
"ProjectRiskReserveId",
"RiskReserveRuleId",
"IsOnBehalfOf",
"StatusId",
"Sequence",
"ActualApprover",
"ApprovedByUser",
"Status",
"IsUpdated",
"IsDMMApproved",
"IsSPLApproved",
"IsTZApproved",
"IsDomainLeaderApproved",
"IsLeadProjectManagerApproved",
"ApprovalDate",
"DisplayStatus"
})
public class RiskReserveApproval {

@JsonProperty("ApproverId")
private Integer approverId;
@JsonProperty("RoleId")
private Integer roleId;
@JsonProperty("ProjectId")
private Integer projectId;
@JsonProperty("ProjectRiskReserveId")
private Integer projectRiskReserveId;
@JsonProperty("RiskReserveRuleId")
private Integer riskReserveRuleId;
@JsonProperty("IsOnBehalfOf")
private Boolean isOnBehalfOf;
@JsonProperty("StatusId")
private Integer statusId;
@JsonProperty("Sequence")
private Integer sequence;
@JsonProperty("ActualApprover")
private ActualApprover actualApprover;
@JsonProperty("ApprovedByUser")
private Object approvedByUser;
@JsonProperty("Status")
private Integer status;
@JsonProperty("IsUpdated")
private Boolean isUpdated;
@JsonProperty("IsDMMApproved")
private Boolean isDMMApproved;
@JsonProperty("IsSPLApproved")
private Boolean isSPLApproved;
@JsonProperty("IsTZApproved")
private Boolean isTZApproved;
@JsonProperty("IsDomainLeaderApproved")
private Boolean isDomainLeaderApproved;
@JsonProperty("IsLeadProjectManagerApproved")
private Boolean isLeadProjectManagerApproved;
@JsonProperty("ApprovalDate")
private String approvalDate;
@JsonProperty("DisplayStatus")
private Object displayStatus;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ApproverId")
public Integer getApproverId() {
return approverId;
}

@JsonProperty("ApproverId")
public void setApproverId(Integer approverId) {
this.approverId = approverId;
}

@JsonProperty("RoleId")
public Integer getRoleId() {
return roleId;
}

@JsonProperty("RoleId")
public void setRoleId(Integer roleId) {
this.roleId = roleId;
}

@JsonProperty("ProjectId")
public Integer getProjectId() {
return projectId;
}

@JsonProperty("ProjectId")
public void setProjectId(Integer projectId) {
this.projectId = projectId;
}

@JsonProperty("ProjectRiskReserveId")
public Integer getProjectRiskReserveId() {
return projectRiskReserveId;
}

@JsonProperty("ProjectRiskReserveId")
public void setProjectRiskReserveId(Integer projectRiskReserveId) {
this.projectRiskReserveId = projectRiskReserveId;
}

@JsonProperty("RiskReserveRuleId")
public Integer getRiskReserveRuleId() {
return riskReserveRuleId;
}

@JsonProperty("RiskReserveRuleId")
public void setRiskReserveRuleId(Integer riskReserveRuleId) {
this.riskReserveRuleId = riskReserveRuleId;
}

@JsonProperty("IsOnBehalfOf")
public Boolean getIsOnBehalfOf() {
return isOnBehalfOf;
}

@JsonProperty("IsOnBehalfOf")
public void setIsOnBehalfOf(Boolean isOnBehalfOf) {
this.isOnBehalfOf = isOnBehalfOf;
}

@JsonProperty("StatusId")
public Integer getStatusId() {
return statusId;
}

@JsonProperty("StatusId")
public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

@JsonProperty("Sequence")
public Integer getSequence() {
return sequence;
}

@JsonProperty("Sequence")
public void setSequence(Integer sequence) {
this.sequence = sequence;
}

@JsonProperty("ActualApprover")
public ActualApprover getActualApprover() {
return actualApprover;
}

@JsonProperty("ActualApprover")
public void setActualApprover(ActualApprover actualApprover) {
this.actualApprover = actualApprover;
}

@JsonProperty("ApprovedByUser")
public Object getApprovedByUser() {
return approvedByUser;
}

@JsonProperty("ApprovedByUser")
public void setApprovedByUser(Object approvedByUser) {
this.approvedByUser = approvedByUser;
}

@JsonProperty("Status")
public Integer getStatus() {
return status;
}

@JsonProperty("Status")
public void setStatus(Integer status) {
this.status = status;
}

@JsonProperty("IsUpdated")
public Boolean getIsUpdated() {
return isUpdated;
}

@JsonProperty("IsUpdated")
public void setIsUpdated(Boolean isUpdated) {
this.isUpdated = isUpdated;
}

@JsonProperty("IsDMMApproved")
public Boolean getIsDMMApproved() {
return isDMMApproved;
}

@JsonProperty("IsDMMApproved")
public void setIsDMMApproved(Boolean isDMMApproved) {
this.isDMMApproved = isDMMApproved;
}

@JsonProperty("IsSPLApproved")
public Boolean getIsSPLApproved() {
return isSPLApproved;
}

@JsonProperty("IsSPLApproved")
public void setIsSPLApproved(Boolean isSPLApproved) {
this.isSPLApproved = isSPLApproved;
}

@JsonProperty("IsTZApproved")
public Boolean getIsTZApproved() {
return isTZApproved;
}

@JsonProperty("IsTZApproved")
public void setIsTZApproved(Boolean isTZApproved) {
this.isTZApproved = isTZApproved;
}

@JsonProperty("IsDomainLeaderApproved")
public Boolean getIsDomainLeaderApproved() {
return isDomainLeaderApproved;
}

@JsonProperty("IsDomainLeaderApproved")
public void setIsDomainLeaderApproved(Boolean isDomainLeaderApproved) {
this.isDomainLeaderApproved = isDomainLeaderApproved;
}

@JsonProperty("IsLeadProjectManagerApproved")
public Boolean getIsLeadProjectManagerApproved() {
return isLeadProjectManagerApproved;
}

@JsonProperty("IsLeadProjectManagerApproved")
public void setIsLeadProjectManagerApproved(Boolean isLeadProjectManagerApproved) {
this.isLeadProjectManagerApproved = isLeadProjectManagerApproved;
}

@JsonProperty("ApprovalDate")
public String getApprovalDate() {
return approvalDate;
}

@JsonProperty("ApprovalDate")
public void setApprovalDate(String approvalDate) {
this.approvalDate = approvalDate;
}

@JsonProperty("DisplayStatus")
public Object getDisplayStatus() {
return displayStatus;
}

@JsonProperty("DisplayStatus")
public void setDisplayStatus(Object displayStatus) {
this.displayStatus = displayStatus;
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