package com.virtuoso.payloads.requests.payloadRR;

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
"Name",
"UserId",
"Alias",
"Role",
"StartDate",
"EndDate",
"IsUserActive",
"IsActive",
"ProjectTimeZone",
"Timezone",
"Domain",
"ApproverId",
"RoleId",
"ProjectId",
"rojectRiskReserveId",
"Sequence",
"RiskReserveRuleId"
})
public class RiskReserveApproval {

@JsonProperty("Id")
private Integer id;
@JsonProperty("Name")
private String name;
@JsonProperty("UserId")
private Integer userId;
@JsonProperty("Alias")
private String alias;
@JsonProperty("Role")
private Role role;
@JsonProperty("StartDate")
private String startDate;
@JsonProperty("EndDate")
private Object endDate;
@JsonProperty("IsUserActive")
private Boolean isUserActive;
@JsonProperty("IsActive")
private Boolean isActive;
@JsonProperty("ProjectTimeZone")
private String projectTimeZone;
@JsonProperty("Timezone")
private Object timezone;
@JsonProperty("Domain")
private Object domain;
@JsonProperty("ApproverId")
private Integer approverId;
@JsonProperty("RoleId")
private Integer roleId;
@JsonProperty("ProjectId")
private String projectId;
@JsonProperty("rojectRiskReserveId")
private Integer rojectRiskReserveId;
@JsonProperty("Sequence")
private Integer sequence;
@JsonProperty("RiskReserveRuleId")
private Integer riskReserveRuleId;
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

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("UserId")
public Integer getUserId() {
return userId;
}

@JsonProperty("UserId")
public void setUserId(Integer userId) {
this.userId = userId;
}

@JsonProperty("Alias")
public String getAlias() {
return alias;
}

@JsonProperty("Alias")
public void setAlias(String alias) {
this.alias = alias;
}

@JsonProperty("Role")
public Role getRole() {
return role;
}

@JsonProperty("Role")
public void setRole(Role role) {
this.role = role;
}

@JsonProperty("StartDate")
public String getStartDate() {
return startDate;
}

@JsonProperty("StartDate")
public void setStartDate(String startDate) {
this.startDate = startDate;
}

@JsonProperty("EndDate")
public Object getEndDate() {
return endDate;
}

@JsonProperty("EndDate")
public void setEndDate(Object endDate) {
this.endDate = endDate;
}

@JsonProperty("IsUserActive")
public Boolean getIsUserActive() {
return isUserActive;
}

@JsonProperty("IsUserActive")
public void setIsUserActive(Boolean isUserActive) {
this.isUserActive = isUserActive;
}

@JsonProperty("IsActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("IsActive")
public void setIsActive(Boolean isActive) {
this.isActive = isActive;
}

@JsonProperty("ProjectTimeZone")
public String getProjectTimeZone() {
return projectTimeZone;
}

@JsonProperty("ProjectTimeZone")
public void setProjectTimeZone(String projectTimeZone) {
this.projectTimeZone = projectTimeZone;
}

@JsonProperty("Timezone")
public Object getTimezone() {
return timezone;
}

@JsonProperty("Timezone")
public void setTimezone(Object timezone) {
this.timezone = timezone;
}

@JsonProperty("Domain")
public Object getDomain() {
return domain;
}

@JsonProperty("Domain")
public void setDomain(Object domain) {
this.domain = domain;
}

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
public String getProjectId() {
return projectId;
}

@JsonProperty("ProjectId")
public void setProjectId(String projectId) {
this.projectId = projectId;
}

@JsonProperty("rojectRiskReserveId")
public Integer getRojectRiskReserveId() {
return rojectRiskReserveId;
}

@JsonProperty("rojectRiskReserveId")
public void setRojectRiskReserveId(Integer rojectRiskReserveId) {
this.rojectRiskReserveId = rojectRiskReserveId;
}

@JsonProperty("Sequence")
public Integer getSequence() {
return sequence;
}

@JsonProperty("Sequence")
public void setSequence(Integer sequence) {
this.sequence = sequence;
}

@JsonProperty("RiskReserveRuleId")
public Integer getRiskReserveRuleId() {
return riskReserveRuleId;
}

@JsonProperty("RiskReserveRuleId")
public void setRiskReserveRuleId(Integer riskReserveRuleId) {
this.riskReserveRuleId = riskReserveRuleId;
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

