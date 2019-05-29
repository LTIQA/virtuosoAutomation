
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
"Planned",
"Approved",
"Unutilized",
"Consumed",
"Currency",
"OverallRRCostAllocated",
"RRPlanned",
"RRAvailable",
"RRUnassigned",
"OverallRRApproved",
"RRApproved",
"RRRemaining",
"ActualRRConsumed",
"EstimateAtCompleteRR",
"AverageCostRate",
"OverallRRPending",
"OverallRRUnassignedAmount",
"ForecastRRValue",
"BaseLineNBUE",
"BaseLineTPH"
})
public class FinancialInfo {

@JsonProperty("Planned")
private Object planned;
@JsonProperty("Approved")
private Object approved;
@JsonProperty("Unutilized")
private Object unutilized;
@JsonProperty("Consumed")
private Double consumed;
@JsonProperty("Currency")
private Object currency;
@JsonProperty("OverallRRCostAllocated")
private Double overallRRCostAllocated;
@JsonProperty("RRPlanned")
private Double rRPlanned;
@JsonProperty("RRAvailable")
private Double rRAvailable;
@JsonProperty("RRUnassigned")
private Double rRUnassigned;
@JsonProperty("OverallRRApproved")
private Double overallRRApproved;
@JsonProperty("RRApproved")
private Double rRApproved;
@JsonProperty("RRRemaining")
private Double rRRemaining;
@JsonProperty("ActualRRConsumed")
private Double actualRRConsumed;
@JsonProperty("EstimateAtCompleteRR")
private Double estimateAtCompleteRR;
@JsonProperty("AverageCostRate")
private Double averageCostRate;
@JsonProperty("OverallRRPending")
private Double overallRRPending;
@JsonProperty("OverallRRUnassignedAmount")
private Double overallRRUnassignedAmount;
@JsonProperty("ForecastRRValue")
private Double forecastRRValue;
@JsonProperty("BaseLineNBUE")
private Double baseLineNBUE;
@JsonProperty("BaseLineTPH")
private Double baseLineTPH;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Planned")
public Object getPlanned() {
return planned;
}

@JsonProperty("Planned")
public void setPlanned(Object planned) {
this.planned = planned;
}

@JsonProperty("Approved")
public Object getApproved() {
return approved;
}

@JsonProperty("Approved")
public void setApproved(Object approved) {
this.approved = approved;
}

@JsonProperty("Unutilized")
public Object getUnutilized() {
return unutilized;
}

@JsonProperty("Unutilized")
public void setUnutilized(Object unutilized) {
this.unutilized = unutilized;
}

@JsonProperty("Consumed")
public Double getConsumed() {
return consumed;
}

@JsonProperty("Consumed")
public void setConsumed(Double consumed) {
this.consumed = consumed;
}

@JsonProperty("Currency")
public Object getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(Object currency) {
this.currency = currency;
}

@JsonProperty("OverallRRCostAllocated")
public Double getOverallRRCostAllocated() {
return overallRRCostAllocated;
}

@JsonProperty("OverallRRCostAllocated")
public void setOverallRRCostAllocated(Double overallRRCostAllocated) {
this.overallRRCostAllocated = overallRRCostAllocated;
}

@JsonProperty("RRPlanned")
public Double getRRPlanned() {
return rRPlanned;
}

@JsonProperty("RRPlanned")
public void setRRPlanned(Double rRPlanned) {
this.rRPlanned = rRPlanned;
}

@JsonProperty("RRAvailable")
public Double getRRAvailable() {
return rRAvailable;
}

@JsonProperty("RRAvailable")
public void setRRAvailable(Double rRAvailable) {
this.rRAvailable = rRAvailable;
}

@JsonProperty("RRUnassigned")
public Double getRRUnassigned() {
return rRUnassigned;
}

@JsonProperty("RRUnassigned")
public void setRRUnassigned(Double rRUnassigned) {
this.rRUnassigned = rRUnassigned;
}

@JsonProperty("OverallRRApproved")
public Double getOverallRRApproved() {
return overallRRApproved;
}

@JsonProperty("OverallRRApproved")
public void setOverallRRApproved(Double overallRRApproved) {
this.overallRRApproved = overallRRApproved;
}

@JsonProperty("RRApproved")
public Double getRRApproved() {
return rRApproved;
}

@JsonProperty("RRApproved")
public void setRRApproved(Double rRApproved) {
this.rRApproved = rRApproved;
}

@JsonProperty("RRRemaining")
public Double getRRRemaining() {
return rRRemaining;
}

@JsonProperty("RRRemaining")
public void setRRRemaining(Double rRRemaining) {
this.rRRemaining = rRRemaining;
}

@JsonProperty("ActualRRConsumed")
public Double getActualRRConsumed() {
return actualRRConsumed;
}

@JsonProperty("ActualRRConsumed")
public void setActualRRConsumed(Double actualRRConsumed) {
this.actualRRConsumed = actualRRConsumed;
}

@JsonProperty("EstimateAtCompleteRR")
public Double getEstimateAtCompleteRR() {
return estimateAtCompleteRR;
}

@JsonProperty("EstimateAtCompleteRR")
public void setEstimateAtCompleteRR(Double estimateAtCompleteRR) {
this.estimateAtCompleteRR = estimateAtCompleteRR;
}

@JsonProperty("AverageCostRate")
public Double getAverageCostRate() {
return averageCostRate;
}

@JsonProperty("AverageCostRate")
public void setAverageCostRate(Double averageCostRate) {
this.averageCostRate = averageCostRate;
}

@JsonProperty("OverallRRPending")
public Double getOverallRRPending() {
return overallRRPending;
}

@JsonProperty("OverallRRPending")
public void setOverallRRPending(Double overallRRPending) {
this.overallRRPending = overallRRPending;
}

@JsonProperty("OverallRRUnassignedAmount")
public Double getOverallRRUnassignedAmount() {
return overallRRUnassignedAmount;
}

@JsonProperty("OverallRRUnassignedAmount")
public void setOverallRRUnassignedAmount(Double overallRRUnassignedAmount) {
this.overallRRUnassignedAmount = overallRRUnassignedAmount;
}

@JsonProperty("ForecastRRValue")
public Double getForecastRRValue() {
return forecastRRValue;
}

@JsonProperty("ForecastRRValue")
public void setForecastRRValue(Double forecastRRValue) {
this.forecastRRValue = forecastRRValue;
}

@JsonProperty("BaseLineNBUE")
public Double getBaseLineNBUE() {
return baseLineNBUE;
}

@JsonProperty("BaseLineNBUE")
public void setBaseLineNBUE(Double baseLineNBUE) {
this.baseLineNBUE = baseLineNBUE;
}

@JsonProperty("BaseLineTPH")
public Double getBaseLineTPH() {
return baseLineTPH;
}

@JsonProperty("BaseLineTPH")
public void setBaseLineTPH(Double baseLineTPH) {
this.baseLineTPH = baseLineTPH;
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

