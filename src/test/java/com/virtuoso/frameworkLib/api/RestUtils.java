package com.virtuoso.frameworkLib.api;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;

public class RestUtils {
	private final static Logger LOG = Logger.getLogger(RestUtils.class);

	private static Boolean lastApiCallSuccessful = null;
	private static int lastApiCallHTTPResponse = 0;

	public static Hashtable<String, String> createStandardHeader(String bearerToken) {
		Hashtable<String, String> headers = new Hashtable<>();
		// headers.put("appId", " ");
		// headers.put("mDevId", ArApiUtils.getMDevIdDefault());
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json;charset=UTF-8");
		headers.put("Cache-Control", "no-cache");
		if (bearerToken != null) {
			headers.put("Authorization", "Bearer " + bearerToken);
		}
		// Print header
		RestUtils.ConvertBodyToString(headers, "header");
		return headers;
	}

	public static String ConvertBodyToString(Hashtable<String, String> body, String description) {
		Boolean firstElement = true;
		String bodyString = "{ ";
		for (Entry<String, String> entry : body.entrySet()) {
			if (!firstElement) {
				bodyString += ","; // add separating comma from previous entry
			}
			bodyString += "\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"";
			firstElement = false;
		}
		bodyString += " }";
		LOG.info("Converted Hashtable of "+description+": "+body.toString()+" to "+bodyString);
		return bodyString;
	}

	public static boolean validateResponseCode(RestActions restActions, String expectedResponseCode,
			ClientResponse clientResponse) {
		int status = clientResponse.getStatus();

		LOG.info("Http Status is ... "+ status);
		// restActions.successReport("Http Response Status Code: ", ""+status);
		int statusExpected = Integer.parseInt(expectedResponseCode);

		if (status == statusExpected) {
			// restActions.successReport("Found expecting Http Response code
			// "+expectedResponseCode,"Actual Http Response code is ...." +status);
			setLastApiCallStatus(Boolean.TRUE, status);
			return true;
		} else {
			// restActions.failureReport("Expecting Http Response code is
			// "+expectedResponseCode,"Actual Http Response code is ...." +status);
			setLastApiCallStatus(Boolean.FALSE, status);
			return false;
		}

	}
	
	public static String getJsonFromObject(Object jsonObj) {
		String jsonStr="";
		Gson gson = new Gson();
		jsonStr = gson.toJson(jsonObj);
		return jsonStr;
	}

	public static void setLastApiCallStatus(Boolean status, int foundHTTPResponse) {
		lastApiCallSuccessful = status;
		lastApiCallHTTPResponse = foundHTTPResponse;
	}
	
	/*
	 * public static Hashtable<String, String> createQueryParameters(){
	 * Hashtable<String, String> query = new Hashtable<String, String>();
	 * 
	 * }
	 */
	
	public static ObjectMapper printJson(String resp) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		Object jsonObject = mapper.readValue(resp,Object.class);
		
		return mapper;
	}

}
