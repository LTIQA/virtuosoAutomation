
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
"Alias",
"Name",
"Role",
"RoleId",
"UserStartDate",
"UserEndDate",
"Initials",
"IsActive",
"IsReviewer",
"IsServiceLeaderFindingReviewer",
"IsSystemUser",
"IsSupportStaff",
"IsDevOpsAdmin",
"IsRiskRepositoryAdmin",
"ProjectTimeZone",
"EnableMail",
"DigestEmailDay",
"ShowBootUp",
"ViewSharedDate",
"IsAccessible",
"IsManageReviewUser",
"IsCpeVisible",
"IsPHFUser",
"IsAttestationEnable",
"ShowMessage",
"IsPMCSupportStaff",
"IsRecoveryCandidateUser",
"IsCloudConsumptionUser",
"CosmicContactId",
"IsModernDashboardUser",
"EnableDailyDigestEmail"
})
public class ActualApprover {

@JsonProperty("Id")
private Integer id;
@JsonProperty("Alias")
private Object alias;
@JsonProperty("Name")
private String name;
@JsonProperty("Role")
private Object role;
@JsonProperty("RoleId")
private Integer roleId;
@JsonProperty("UserStartDate")
private Object userStartDate;
@JsonProperty("UserEndDate")
private Object userEndDate;
@JsonProperty("Initials")
private String initials;
@JsonProperty("IsActive")
private Boolean isActive;
@JsonProperty("IsReviewer")
private Boolean isReviewer;
@JsonProperty("IsServiceLeaderFindingReviewer")
private Boolean isServiceLeaderFindingReviewer;
@JsonProperty("IsSystemUser")
private Boolean isSystemUser;
@JsonProperty("IsSupportStaff")
private Boolean isSupportStaff;
@JsonProperty("IsDevOpsAdmin")
private Boolean isDevOpsAdmin;
@JsonProperty("IsRiskRepositoryAdmin")
private Boolean isRiskRepositoryAdmin;
@JsonProperty("ProjectTimeZone")
private Object projectTimeZone;
@JsonProperty("EnableMail")
private Boolean enableMail;
@JsonProperty("DigestEmailDay")
private Integer digestEmailDay;
@JsonProperty("ShowBootUp")
private Boolean showBootUp;
@JsonProperty("ViewSharedDate")
private Object viewSharedDate;
@JsonProperty("IsAccessible")
private Boolean isAccessible;
@JsonProperty("IsManageReviewUser")
private Boolean isManageReviewUser;
@JsonProperty("IsCpeVisible")
private Boolean isCpeVisible;
@JsonProperty("IsPHFUser")
private Boolean isPHFUser;
@JsonProperty("IsAttestationEnable")
private Boolean isAttestationEnable;
@JsonProperty("ShowMessage")
private Boolean showMessage;
@JsonProperty("IsPMCSupportStaff")
private Boolean isPMCSupportStaff;
@JsonProperty("IsRecoveryCandidateUser")
private Boolean isRecoveryCandidateUser;
@JsonProperty("IsCloudConsumptionUser")
private Boolean isCloudConsumptionUser;
@JsonProperty("CosmicContactId")
private Object cosmicContactId;
@JsonProperty("IsModernDashboardUser")
private Boolean isModernDashboardUser;
@JsonProperty("EnableDailyDigestEmail")
private Boolean enableDailyDigestEmail;
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

@JsonProperty("Alias")
public Object getAlias() {
return alias;
}

@JsonProperty("Alias")
public void setAlias(Object alias) {
this.alias = alias;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("Role")
public Object getRole() {
return role;
}

@JsonProperty("Role")
public void setRole(Object role) {
this.role = role;
}

@JsonProperty("RoleId")
public Integer getRoleId() {
return roleId;
}

@JsonProperty("RoleId")
public void setRoleId(Integer roleId) {
this.roleId = roleId;
}

@JsonProperty("UserStartDate")
public Object getUserStartDate() {
return userStartDate;
}

@JsonProperty("UserStartDate")
public void setUserStartDate(Object userStartDate) {
this.userStartDate = userStartDate;
}

@JsonProperty("UserEndDate")
public Object getUserEndDate() {
return userEndDate;
}

@JsonProperty("UserEndDate")
public void setUserEndDate(Object userEndDate) {
this.userEndDate = userEndDate;
}

@JsonProperty("Initials")
public String getInitials() {
return initials;
}

@JsonProperty("Initials")
public void setInitials(String initials) {
this.initials = initials;
}

@JsonProperty("IsActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("IsActive")
public void setIsActive(Boolean isActive) {
this.isActive = isActive;
}

@JsonProperty("IsReviewer")
public Boolean getIsReviewer() {
return isReviewer;
}

@JsonProperty("IsReviewer")
public void setIsReviewer(Boolean isReviewer) {
this.isReviewer = isReviewer;
}

@JsonProperty("IsServiceLeaderFindingReviewer")
public Boolean getIsServiceLeaderFindingReviewer() {
return isServiceLeaderFindingReviewer;
}

@JsonProperty("IsServiceLeaderFindingReviewer")
public void setIsServiceLeaderFindingReviewer(Boolean isServiceLeaderFindingReviewer) {
this.isServiceLeaderFindingReviewer = isServiceLeaderFindingReviewer;
}

@JsonProperty("IsSystemUser")
public Boolean getIsSystemUser() {
return isSystemUser;
}

@JsonProperty("IsSystemUser")
public void setIsSystemUser(Boolean isSystemUser) {
this.isSystemUser = isSystemUser;
}

@JsonProperty("IsSupportStaff")
public Boolean getIsSupportStaff() {
return isSupportStaff;
}

@JsonProperty("IsSupportStaff")
public void setIsSupportStaff(Boolean isSupportStaff) {
this.isSupportStaff = isSupportStaff;
}

@JsonProperty("IsDevOpsAdmin")
public Boolean getIsDevOpsAdmin() {
return isDevOpsAdmin;
}

@JsonProperty("IsDevOpsAdmin")
public void setIsDevOpsAdmin(Boolean isDevOpsAdmin) {
this.isDevOpsAdmin = isDevOpsAdmin;
}

@JsonProperty("IsRiskRepositoryAdmin")
public Boolean getIsRiskRepositoryAdmin() {
return isRiskRepositoryAdmin;
}

@JsonProperty("IsRiskRepositoryAdmin")
public void setIsRiskRepositoryAdmin(Boolean isRiskRepositoryAdmin) {
this.isRiskRepositoryAdmin = isRiskRepositoryAdmin;
}

@JsonProperty("ProjectTimeZone")
public Object getProjectTimeZone() {
return projectTimeZone;
}

@JsonProperty("ProjectTimeZone")
public void setProjectTimeZone(Object projectTimeZone) {
this.projectTimeZone = projectTimeZone;
}

@JsonProperty("EnableMail")
public Boolean getEnableMail() {
return enableMail;
}

@JsonProperty("EnableMail")
public void setEnableMail(Boolean enableMail) {
this.enableMail = enableMail;
}

@JsonProperty("DigestEmailDay")
public Integer getDigestEmailDay() {
return digestEmailDay;
}

@JsonProperty("DigestEmailDay")
public void setDigestEmailDay(Integer digestEmailDay) {
this.digestEmailDay = digestEmailDay;
}

@JsonProperty("ShowBootUp")
public Boolean getShowBootUp() {
return showBootUp;
}

@JsonProperty("ShowBootUp")
public void setShowBootUp(Boolean showBootUp) {
this.showBootUp = showBootUp;
}

@JsonProperty("ViewSharedDate")
public Object getViewSharedDate() {
return viewSharedDate;
}

@JsonProperty("ViewSharedDate")
public void setViewSharedDate(Object viewSharedDate) {
this.viewSharedDate = viewSharedDate;
}

@JsonProperty("IsAccessible")
public Boolean getIsAccessible() {
return isAccessible;
}

@JsonProperty("IsAccessible")
public void setIsAccessible(Boolean isAccessible) {
this.isAccessible = isAccessible;
}

@JsonProperty("IsManageReviewUser")
public Boolean getIsManageReviewUser() {
return isManageReviewUser;
}

@JsonProperty("IsManageReviewUser")
public void setIsManageReviewUser(Boolean isManageReviewUser) {
this.isManageReviewUser = isManageReviewUser;
}

@JsonProperty("IsCpeVisible")
public Boolean getIsCpeVisible() {
return isCpeVisible;
}

@JsonProperty("IsCpeVisible")
public void setIsCpeVisible(Boolean isCpeVisible) {
this.isCpeVisible = isCpeVisible;
}

@JsonProperty("IsPHFUser")
public Boolean getIsPHFUser() {
return isPHFUser;
}

@JsonProperty("IsPHFUser")
public void setIsPHFUser(Boolean isPHFUser) {
this.isPHFUser = isPHFUser;
}

@JsonProperty("IsAttestationEnable")
public Boolean getIsAttestationEnable() {
return isAttestationEnable;
}

@JsonProperty("IsAttestationEnable")
public void setIsAttestationEnable(Boolean isAttestationEnable) {
this.isAttestationEnable = isAttestationEnable;
}

@JsonProperty("ShowMessage")
public Boolean getShowMessage() {
return showMessage;
}

@JsonProperty("ShowMessage")
public void setShowMessage(Boolean showMessage) {
this.showMessage = showMessage;
}

@JsonProperty("IsPMCSupportStaff")
public Boolean getIsPMCSupportStaff() {
return isPMCSupportStaff;
}

@JsonProperty("IsPMCSupportStaff")
public void setIsPMCSupportStaff(Boolean isPMCSupportStaff) {
this.isPMCSupportStaff = isPMCSupportStaff;
}

@JsonProperty("IsRecoveryCandidateUser")
public Boolean getIsRecoveryCandidateUser() {
return isRecoveryCandidateUser;
}

@JsonProperty("IsRecoveryCandidateUser")
public void setIsRecoveryCandidateUser(Boolean isRecoveryCandidateUser) {
this.isRecoveryCandidateUser = isRecoveryCandidateUser;
}

@JsonProperty("IsCloudConsumptionUser")
public Boolean getIsCloudConsumptionUser() {
return isCloudConsumptionUser;
}

@JsonProperty("IsCloudConsumptionUser")
public void setIsCloudConsumptionUser(Boolean isCloudConsumptionUser) {
this.isCloudConsumptionUser = isCloudConsumptionUser;
}

@JsonProperty("CosmicContactId")
public Object getCosmicContactId() {
return cosmicContactId;
}

@JsonProperty("CosmicContactId")
public void setCosmicContactId(Object cosmicContactId) {
this.cosmicContactId = cosmicContactId;
}

@JsonProperty("IsModernDashboardUser")
public Boolean getIsModernDashboardUser() {
return isModernDashboardUser;
}

@JsonProperty("IsModernDashboardUser")
public void setIsModernDashboardUser(Boolean isModernDashboardUser) {
this.isModernDashboardUser = isModernDashboardUser;
}

@JsonProperty("EnableDailyDigestEmail")
public Boolean getEnableDailyDigestEmail() {
return enableDailyDigestEmail;
}

@JsonProperty("EnableDailyDigestEmail")
public void setEnableDailyDigestEmail(Boolean enableDailyDigestEmail) {
this.enableDailyDigestEmail = enableDailyDigestEmail;
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

