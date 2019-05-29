package com.virtuoso.apiResponse.requests.getProjectRiskReserveInfo;

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
"FinancialInfo",
"CurrencyCode",
"ProjectRiskReserves",
"UserRoles",
"OverallHealthStatus",
"ProjectDetailsInfo",
"Currency",
"ProjectContractType",
"TotalRRApproved",
"TotalTPHApproved",
"TotalNBUEApproved",
"BaseLineHours",
"IsNBUE",
"IsTPH",
"IsRR",
"IsRPTEnabled",
"RptRequests"
})
public class GetProjectRiskReserveInfo {

@JsonProperty("FinancialInfo")
private FinancialInfo financialInfo;
@JsonProperty("CurrencyCode")
private Object currencyCode;
@JsonProperty("ProjectRiskReserves")
private List<ProjectRiskReserf> projectRiskReserves = null;
@JsonProperty("UserRoles")
private UserRoles userRoles;
@JsonProperty("OverallHealthStatus")
private Integer overallHealthStatus;
@JsonProperty("ProjectDetailsInfo")
private Object projectDetailsInfo;
@JsonProperty("Currency")
private Object currency;
@JsonProperty("ProjectContractType")
private String projectContractType;
@JsonProperty("TotalRRApproved")
private Double totalRRApproved;
@JsonProperty("TotalTPHApproved")
private Double totalTPHApproved;
@JsonProperty("TotalNBUEApproved")
private Double totalNBUEApproved;
@JsonProperty("BaseLineHours")
private Object baseLineHours;
@JsonProperty("IsNBUE")
private Boolean isNBUE;
@JsonProperty("IsTPH")
private Boolean isTPH;
@JsonProperty("IsRR")
private Boolean isRR;
@JsonProperty("IsRPTEnabled")
private Boolean isRPTEnabled;
@JsonProperty("RptRequests")
private List<Object> rptRequests = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("FinancialInfo")
public FinancialInfo getFinancialInfo() {
return financialInfo;
}

@JsonProperty("FinancialInfo")
public void setFinancialInfo(FinancialInfo financialInfo) {
this.financialInfo = financialInfo;
}

@JsonProperty("CurrencyCode")
public Object getCurrencyCode() {
return currencyCode;
}

@JsonProperty("CurrencyCode")
public void setCurrencyCode(Object currencyCode) {
this.currencyCode = currencyCode;
}

@JsonProperty("ProjectRiskReserves")
public List<ProjectRiskReserf> getProjectRiskReserves() {
return projectRiskReserves;
}

@JsonProperty("ProjectRiskReserves")
public void setProjectRiskReserves(List<ProjectRiskReserf> projectRiskReserves) {
this.projectRiskReserves = projectRiskReserves;
}

@JsonProperty("UserRoles")
public UserRoles getUserRoles() {
return userRoles;
}

@JsonProperty("UserRoles")
public void setUserRoles(UserRoles userRoles) {
this.userRoles = userRoles;
}

@JsonProperty("OverallHealthStatus")
public Integer getOverallHealthStatus() {
return overallHealthStatus;
}

@JsonProperty("OverallHealthStatus")
public void setOverallHealthStatus(Integer overallHealthStatus) {
this.overallHealthStatus = overallHealthStatus;
}

@JsonProperty("ProjectDetailsInfo")
public Object getProjectDetailsInfo() {
return projectDetailsInfo;
}

@JsonProperty("ProjectDetailsInfo")
public void setProjectDetailsInfo(Object projectDetailsInfo) {
this.projectDetailsInfo = projectDetailsInfo;
}

@JsonProperty("Currency")
public Object getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(Object currency) {
this.currency = currency;
}

@JsonProperty("ProjectContractType")
public String getProjectContractType() {
return projectContractType;
}

@JsonProperty("ProjectContractType")
public void setProjectContractType(String projectContractType) {
this.projectContractType = projectContractType;
}

@JsonProperty("TotalRRApproved")
public Double getTotalRRApproved() {
return totalRRApproved;
}

@JsonProperty("TotalRRApproved")
public void setTotalRRApproved(Double totalRRApproved) {
this.totalRRApproved = totalRRApproved;
}

@JsonProperty("TotalTPHApproved")
public Double getTotalTPHApproved() {
return totalTPHApproved;
}

@JsonProperty("TotalTPHApproved")
public void setTotalTPHApproved(Double totalTPHApproved) {
this.totalTPHApproved = totalTPHApproved;
}

@JsonProperty("TotalNBUEApproved")
public Double getTotalNBUEApproved() {
return totalNBUEApproved;
}

@JsonProperty("TotalNBUEApproved")
public void setTotalNBUEApproved(Double totalNBUEApproved) {
this.totalNBUEApproved = totalNBUEApproved;
}

@JsonProperty("BaseLineHours")
public Object getBaseLineHours() {
return baseLineHours;
}

@JsonProperty("BaseLineHours")
public void setBaseLineHours(Object baseLineHours) {
this.baseLineHours = baseLineHours;
}

@JsonProperty("IsNBUE")
public Boolean getIsNBUE() {
return isNBUE;
}

@JsonProperty("IsNBUE")
public void setIsNBUE(Boolean isNBUE) {
this.isNBUE = isNBUE;
}

@JsonProperty("IsTPH")
public Boolean getIsTPH() {
return isTPH;
}

@JsonProperty("IsTPH")
public void setIsTPH(Boolean isTPH) {
this.isTPH = isTPH;
}

@JsonProperty("IsRR")
public Boolean getIsRR() {
return isRR;
}

@JsonProperty("IsRR")
public void setIsRR(Boolean isRR) {
this.isRR = isRR;
}

@JsonProperty("IsRPTEnabled")
public Boolean getIsRPTEnabled() {
return isRPTEnabled;
}

@JsonProperty("IsRPTEnabled")
public void setIsRPTEnabled(Boolean isRPTEnabled) {
this.isRPTEnabled = isRPTEnabled;
}

@JsonProperty("RptRequests")
public List<Object> getRptRequests() {
return rptRequests;
}

@JsonProperty("RptRequests")
public void setRptRequests(List<Object> rptRequests) {
this.rptRequests = rptRequests;
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

