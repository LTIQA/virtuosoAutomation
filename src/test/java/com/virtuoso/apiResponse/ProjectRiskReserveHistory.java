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
"Id",
"RiskReserveId",
"Title",
"StatusName",
"UpdatedBy",
"UpdatedByName",
"RequestAmount",
"ApproverName",
"ApprovedByName",
"ApprovedDate",
"UpdatedDate",
"Comments",
"RiskReserveConsumedAmount",
"RiskReserveConsumedPercent",
"PreviousStatusName",
"UpdatedByRole",
"UpdatedByInitials"
})
public class ProjectRiskReserveHistory {

@JsonProperty("Id")
private Integer id;
@JsonProperty("RiskReserveId")
private Integer riskReserveId;
@JsonProperty("Title")
private String title;
@JsonProperty("StatusName")
private String statusName;
@JsonProperty("UpdatedBy")
private String updatedBy;
@JsonProperty("UpdatedByName")
private String updatedByName;
@JsonProperty("RequestAmount")
private Double requestAmount;
@JsonProperty("ApproverName")
private String approverName;
@JsonProperty("ApprovedByName")
private Object approvedByName;
@JsonProperty("ApprovedDate")
private Object approvedDate;
@JsonProperty("UpdatedDate")
private String updatedDate;
@JsonProperty("Comments")
private String comments;
@JsonProperty("RiskReserveConsumedAmount")
private Double riskReserveConsumedAmount;
@JsonProperty("RiskReserveConsumedPercent")
private Double riskReserveConsumedPercent;
@JsonProperty("PreviousStatusName")
private String previousStatusName;
@JsonProperty("UpdatedByRole")
private String updatedByRole;
@JsonProperty("UpdatedByInitials")
private String updatedByInitials;
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

@JsonProperty("RiskReserveId")
public Integer getRiskReserveId() {
return riskReserveId;
}

@JsonProperty("RiskReserveId")
public void setRiskReserveId(Integer riskReserveId) {
this.riskReserveId = riskReserveId;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("StatusName")
public String getStatusName() {
return statusName;
}

@JsonProperty("StatusName")
public void setStatusName(String statusName) {
this.statusName = statusName;
}

@JsonProperty("UpdatedBy")
public String getUpdatedBy() {
return updatedBy;
}

@JsonProperty("UpdatedBy")
public void setUpdatedBy(String updatedBy) {
this.updatedBy = updatedBy;
}

@JsonProperty("UpdatedByName")
public String getUpdatedByName() {
return updatedByName;
}

@JsonProperty("UpdatedByName")
public void setUpdatedByName(String updatedByName) {
this.updatedByName = updatedByName;
}

@JsonProperty("RequestAmount")
public Double getRequestAmount() {
return requestAmount;
}

@JsonProperty("RequestAmount")
public void setRequestAmount(Double requestAmount) {
this.requestAmount = requestAmount;
}

@JsonProperty("ApproverName")
public String getApproverName() {
return approverName;
}

@JsonProperty("ApproverName")
public void setApproverName(String approverName) {
this.approverName = approverName;
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

@JsonProperty("UpdatedDate")
public String getUpdatedDate() {
return updatedDate;
}

@JsonProperty("UpdatedDate")
public void setUpdatedDate(String updatedDate) {
this.updatedDate = updatedDate;
}

@JsonProperty("Comments")
public String getComments() {
return comments;
}

@JsonProperty("Comments")
public void setComments(String comments) {
this.comments = comments;
}

@JsonProperty("RiskReserveConsumedAmount")
public Double getRiskReserveConsumedAmount() {
return riskReserveConsumedAmount;
}

@JsonProperty("RiskReserveConsumedAmount")
public void setRiskReserveConsumedAmount(Double riskReserveConsumedAmount) {
this.riskReserveConsumedAmount = riskReserveConsumedAmount;
}

@JsonProperty("RiskReserveConsumedPercent")
public Double getRiskReserveConsumedPercent() {
return riskReserveConsumedPercent;
}

@JsonProperty("RiskReserveConsumedPercent")
public void setRiskReserveConsumedPercent(Double riskReserveConsumedPercent) {
this.riskReserveConsumedPercent = riskReserveConsumedPercent;
}

@JsonProperty("PreviousStatusName")
public String getPreviousStatusName() {
return previousStatusName;
}

@JsonProperty("PreviousStatusName")
public void setPreviousStatusName(String previousStatusName) {
this.previousStatusName = previousStatusName;
}

@JsonProperty("UpdatedByRole")
public String getUpdatedByRole() {
return updatedByRole;
}

@JsonProperty("UpdatedByRole")
public void setUpdatedByRole(String updatedByRole) {
this.updatedByRole = updatedByRole;
}

@JsonProperty("UpdatedByInitials")
public String getUpdatedByInitials() {
return updatedByInitials;
}

@JsonProperty("UpdatedByInitials")
public void setUpdatedByInitials(String updatedByInitials) {
this.updatedByInitials = updatedByInitials;
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

