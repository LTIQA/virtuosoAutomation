package com.virtuoso.payloads.requests.payloadNBUE;

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
"RoleId",
"Name",
"RoleCategory",
"RoleCategoryId"
})
public class Role {

@JsonProperty("RoleId")
private Integer roleId;
@JsonProperty("Name")
private String name;
@JsonProperty("RoleCategory")
private String roleCategory;
@JsonProperty("RoleCategoryId")
private Integer roleCategoryId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("RoleId")
public Integer getRoleId() {
return roleId;
}

@JsonProperty("RoleId")
public void setRoleId(Integer roleId) {
this.roleId = roleId;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("RoleCategory")
public String getRoleCategory() {
return roleCategory;
}

@JsonProperty("RoleCategory")
public void setRoleCategory(String roleCategory) {
this.roleCategory = roleCategory;
}

@JsonProperty("RoleCategoryId")
public Integer getRoleCategoryId() {
return roleCategoryId;
}

@JsonProperty("RoleCategoryId")
public void setRoleCategoryId(Integer roleCategoryId) {
this.roleCategoryId = roleCategoryId;
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