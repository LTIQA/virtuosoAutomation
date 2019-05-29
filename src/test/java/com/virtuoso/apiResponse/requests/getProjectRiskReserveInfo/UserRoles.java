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
"IsDELead",
"IsRemotePJM",
"IsManager",
"IsDEManagerLead",
"ProjectId",
"IsReviewer",
"IsServiceLeaderFindingRole",
"IsServiceLeaderReviewer",
"IsStatusContributor",
"IsSBDReviewer",
"IsSystemLevelUser",
"IsSupportStaff",
"IsUpdateDEIQuestionnaire",
"IsDevOpsAdmin",
"IsDevLead",
"IsDevOpsBuildReleaseLead",
"IsDevOpsMember",
"IsProjectMember",
"IsProcessTailoringMember",
"IsRRCreator",
"IsQgAccessible",
"IsLeadProjectManager",
"IsDeleadDomain",
"IsNotTeamMember",
"SALRequestor",
"IsDevOpsMaturityEditable",
"IsDevOpsAdminRole"
})
public class UserRoles {

@JsonProperty("IsDELead")
private Boolean isDELead;
@JsonProperty("IsRemotePJM")
private Boolean isRemotePJM;
@JsonProperty("IsManager")
private Boolean isManager;
@JsonProperty("IsDEManagerLead")
private Boolean isDEManagerLead;
@JsonProperty("ProjectId")
private Integer projectId;
@JsonProperty("IsReviewer")
private Boolean isReviewer;
@JsonProperty("IsServiceLeaderFindingRole")
private Boolean isServiceLeaderFindingRole;
@JsonProperty("IsServiceLeaderReviewer")
private Boolean isServiceLeaderReviewer;
@JsonProperty("IsStatusContributor")
private Boolean isStatusContributor;
@JsonProperty("IsSBDReviewer")
private Boolean isSBDReviewer;
@JsonProperty("IsSystemLevelUser")
private Boolean isSystemLevelUser;
@JsonProperty("IsSupportStaff")
private Boolean isSupportStaff;
@JsonProperty("IsUpdateDEIQuestionnaire")
private Boolean isUpdateDEIQuestionnaire;
@JsonProperty("IsDevOpsAdmin")
private Boolean isDevOpsAdmin;
@JsonProperty("IsDevLead")
private Boolean isDevLead;
@JsonProperty("IsDevOpsBuildReleaseLead")
private Boolean isDevOpsBuildReleaseLead;
@JsonProperty("IsDevOpsMember")
private Boolean isDevOpsMember;
@JsonProperty("IsProjectMember")
private Boolean isProjectMember;
@JsonProperty("IsProcessTailoringMember")
private Boolean isProcessTailoringMember;
@JsonProperty("IsRRCreator")
private Boolean isRRCreator;
@JsonProperty("IsQgAccessible")
private Boolean isQgAccessible;
@JsonProperty("IsLeadProjectManager")
private Boolean isLeadProjectManager;
@JsonProperty("IsDeleadDomain")
private Boolean isDeleadDomain;
@JsonProperty("IsNotTeamMember")
private Boolean isNotTeamMember;
@JsonProperty("SALRequestor")
private Boolean sALRequestor;
@JsonProperty("IsDevOpsMaturityEditable")
private Boolean isDevOpsMaturityEditable;
@JsonProperty("IsDevOpsAdminRole")
private Boolean isDevOpsAdminRole;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("IsDELead")
public Boolean getIsDELead() {
return isDELead;
}

@JsonProperty("IsDELead")
public void setIsDELead(Boolean isDELead) {
this.isDELead = isDELead;
}

@JsonProperty("IsRemotePJM")
public Boolean getIsRemotePJM() {
return isRemotePJM;
}

@JsonProperty("IsRemotePJM")
public void setIsRemotePJM(Boolean isRemotePJM) {
this.isRemotePJM = isRemotePJM;
}

@JsonProperty("IsManager")
public Boolean getIsManager() {
return isManager;
}

@JsonProperty("IsManager")
public void setIsManager(Boolean isManager) {
this.isManager = isManager;
}

@JsonProperty("IsDEManagerLead")
public Boolean getIsDEManagerLead() {
return isDEManagerLead;
}

@JsonProperty("IsDEManagerLead")
public void setIsDEManagerLead(Boolean isDEManagerLead) {
this.isDEManagerLead = isDEManagerLead;
}

@JsonProperty("ProjectId")
public Integer getProjectId() {
return projectId;
}

@JsonProperty("ProjectId")
public void setProjectId(Integer projectId) {
this.projectId = projectId;
}

@JsonProperty("IsReviewer")
public Boolean getIsReviewer() {
return isReviewer;
}

@JsonProperty("IsReviewer")
public void setIsReviewer(Boolean isReviewer) {
this.isReviewer = isReviewer;
}

@JsonProperty("IsServiceLeaderFindingRole")
public Boolean getIsServiceLeaderFindingRole() {
return isServiceLeaderFindingRole;
}

@JsonProperty("IsServiceLeaderFindingRole")
public void setIsServiceLeaderFindingRole(Boolean isServiceLeaderFindingRole) {
this.isServiceLeaderFindingRole = isServiceLeaderFindingRole;
}

@JsonProperty("IsServiceLeaderReviewer")
public Boolean getIsServiceLeaderReviewer() {
return isServiceLeaderReviewer;
}

@JsonProperty("IsServiceLeaderReviewer")
public void setIsServiceLeaderReviewer(Boolean isServiceLeaderReviewer) {
this.isServiceLeaderReviewer = isServiceLeaderReviewer;
}

@JsonProperty("IsStatusContributor")
public Boolean getIsStatusContributor() {
return isStatusContributor;
}

@JsonProperty("IsStatusContributor")
public void setIsStatusContributor(Boolean isStatusContributor) {
this.isStatusContributor = isStatusContributor;
}

@JsonProperty("IsSBDReviewer")
public Boolean getIsSBDReviewer() {
return isSBDReviewer;
}

@JsonProperty("IsSBDReviewer")
public void setIsSBDReviewer(Boolean isSBDReviewer) {
this.isSBDReviewer = isSBDReviewer;
}

@JsonProperty("IsSystemLevelUser")
public Boolean getIsSystemLevelUser() {
return isSystemLevelUser;
}

@JsonProperty("IsSystemLevelUser")
public void setIsSystemLevelUser(Boolean isSystemLevelUser) {
this.isSystemLevelUser = isSystemLevelUser;
}

@JsonProperty("IsSupportStaff")
public Boolean getIsSupportStaff() {
return isSupportStaff;
}

@JsonProperty("IsSupportStaff")
public void setIsSupportStaff(Boolean isSupportStaff) {
this.isSupportStaff = isSupportStaff;
}

@JsonProperty("IsUpdateDEIQuestionnaire")
public Boolean getIsUpdateDEIQuestionnaire() {
return isUpdateDEIQuestionnaire;
}

@JsonProperty("IsUpdateDEIQuestionnaire")
public void setIsUpdateDEIQuestionnaire(Boolean isUpdateDEIQuestionnaire) {
this.isUpdateDEIQuestionnaire = isUpdateDEIQuestionnaire;
}

@JsonProperty("IsDevOpsAdmin")
public Boolean getIsDevOpsAdmin() {
return isDevOpsAdmin;
}

@JsonProperty("IsDevOpsAdmin")
public void setIsDevOpsAdmin(Boolean isDevOpsAdmin) {
this.isDevOpsAdmin = isDevOpsAdmin;
}

@JsonProperty("IsDevLead")
public Boolean getIsDevLead() {
return isDevLead;
}

@JsonProperty("IsDevLead")
public void setIsDevLead(Boolean isDevLead) {
this.isDevLead = isDevLead;
}

@JsonProperty("IsDevOpsBuildReleaseLead")
public Boolean getIsDevOpsBuildReleaseLead() {
return isDevOpsBuildReleaseLead;
}

@JsonProperty("IsDevOpsBuildReleaseLead")
public void setIsDevOpsBuildReleaseLead(Boolean isDevOpsBuildReleaseLead) {
this.isDevOpsBuildReleaseLead = isDevOpsBuildReleaseLead;
}

@JsonProperty("IsDevOpsMember")
public Boolean getIsDevOpsMember() {
return isDevOpsMember;
}

@JsonProperty("IsDevOpsMember")
public void setIsDevOpsMember(Boolean isDevOpsMember) {
this.isDevOpsMember = isDevOpsMember;
}

@JsonProperty("IsProjectMember")
public Boolean getIsProjectMember() {
return isProjectMember;
}

@JsonProperty("IsProjectMember")
public void setIsProjectMember(Boolean isProjectMember) {
this.isProjectMember = isProjectMember;
}

@JsonProperty("IsProcessTailoringMember")
public Boolean getIsProcessTailoringMember() {
return isProcessTailoringMember;
}

@JsonProperty("IsProcessTailoringMember")
public void setIsProcessTailoringMember(Boolean isProcessTailoringMember) {
this.isProcessTailoringMember = isProcessTailoringMember;
}

@JsonProperty("IsRRCreator")
public Boolean getIsRRCreator() {
return isRRCreator;
}

@JsonProperty("IsRRCreator")
public void setIsRRCreator(Boolean isRRCreator) {
this.isRRCreator = isRRCreator;
}

@JsonProperty("IsQgAccessible")
public Boolean getIsQgAccessible() {
return isQgAccessible;
}

@JsonProperty("IsQgAccessible")
public void setIsQgAccessible(Boolean isQgAccessible) {
this.isQgAccessible = isQgAccessible;
}

@JsonProperty("IsLeadProjectManager")
public Boolean getIsLeadProjectManager() {
return isLeadProjectManager;
}

@JsonProperty("IsLeadProjectManager")
public void setIsLeadProjectManager(Boolean isLeadProjectManager) {
this.isLeadProjectManager = isLeadProjectManager;
}

@JsonProperty("IsDeleadDomain")
public Boolean getIsDeleadDomain() {
return isDeleadDomain;
}

@JsonProperty("IsDeleadDomain")
public void setIsDeleadDomain(Boolean isDeleadDomain) {
this.isDeleadDomain = isDeleadDomain;
}

@JsonProperty("IsNotTeamMember")
public Boolean getIsNotTeamMember() {
return isNotTeamMember;
}

@JsonProperty("IsNotTeamMember")
public void setIsNotTeamMember(Boolean isNotTeamMember) {
this.isNotTeamMember = isNotTeamMember;
}

@JsonProperty("SALRequestor")
public Boolean getSALRequestor() {
return sALRequestor;
}

@JsonProperty("SALRequestor")
public void setSALRequestor(Boolean sALRequestor) {
this.sALRequestor = sALRequestor;
}

@JsonProperty("IsDevOpsMaturityEditable")
public Boolean getIsDevOpsMaturityEditable() {
return isDevOpsMaturityEditable;
}

@JsonProperty("IsDevOpsMaturityEditable")
public void setIsDevOpsMaturityEditable(Boolean isDevOpsMaturityEditable) {
this.isDevOpsMaturityEditable = isDevOpsMaturityEditable;
}

@JsonProperty("IsDevOpsAdminRole")
public Boolean getIsDevOpsAdminRole() {
return isDevOpsAdminRole;
}

@JsonProperty("IsDevOpsAdminRole")
public void setIsDevOpsAdminRole(Boolean isDevOpsAdminRole) {
this.isDevOpsAdminRole = isDevOpsAdminRole;
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