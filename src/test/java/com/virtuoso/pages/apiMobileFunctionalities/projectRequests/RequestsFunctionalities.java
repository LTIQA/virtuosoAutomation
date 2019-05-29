package com.virtuoso.pages.apiMobileFunctionalities.projectRequests;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import com.virtuoso.apiResponse.requests.getProjectRiskReserveInfo.GetProjectRiskReserveInfo;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.RestUtils;
import com.virtuoso.frameworkLib.api.ServiceUrl;

public class RequestsFunctionalities extends RestActions {
	public List<GetProjectRiskReserveInfo> getProjectRiskReserveInfo(String accessToken, String projectId)
			throws JsonParseException, JsonMappingException, IOException {
		String getProjectRiskReserveInfoUrl = ServiceUrl.getProjectRiskReserveInfo.replace("{projectId}", projectId);
		ClientResponse cr = getClientResponse(getProjectRiskReserveInfoUrl, RestUtils.createStandardHeader(accessToken),
				null, ServiceUrl.contentTypeAppJson);
		String resp = cr.getEntity(String.class);
		ObjectMapper mapper = RestUtils.printJson(resp);
		List<GetProjectRiskReserveInfo> respObj = mapper.readValue(resp,
				mapper.getTypeFactory().constructParametricType(List.class, GetProjectRiskReserveInfo.class));
		return respObj;
	}

}
