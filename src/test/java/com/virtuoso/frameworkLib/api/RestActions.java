package com.virtuoso.frameworkLib.api;

import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.virtuoso.frameworkLib.Constants.Generics;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import javax.naming.ServiceUnavailableException;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.log4j.Logger;

public class RestActions {
	private final Logger LOG = Logger.getLogger(getClass().getName());

	public String getCallerClassName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getClassName();
	}

	public String getCallerMethodName() {
		StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
		return stElements[3].getMethodName();
	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLogAllureReports(String logDescription) {
		return logDescription;
	}

	public void addLogs(String logsDescription) {
		if (Generics.getExecutionEnvironment().equalsIgnoreCase("local")) {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
			saveTextLogAllureReports(logsDescription);
			LOG.info("Logs added successfully successfully");
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}else if (Generics.getExecutionEnvironment().equalsIgnoreCase("cloud")) {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name" + getCallerClassName() + "Method name : " + getCallerMethodName());
			LOG.info(logsDescription);
			LOG.info("Logs added successfully successfully");
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}

	private MultivaluedMap<String, String> convertHashTableToMultivaluedMap(
			Hashtable<String, String> urlQueryParameters) throws Exception {
		MultivaluedMap<String, String> queryParams = null;
		if ((urlQueryParameters == null) || (urlQueryParameters.size() == 0)) {
			throw new Exception("url parameters are missing.");
		}

		queryParams = new MultivaluedMapImpl();
		for (String reqKey : urlQueryParameters.keySet()) {
			queryParams.add(reqKey, urlQueryParameters.get(reqKey));
		}

		return queryParams;
	}

	@Step("Resource url: '{0}'  urlQueryParameters : '{2}'   Content Type : '{3}'")
	public ClientResponse getClientResponse(String url, Hashtable<String, String> requestHeaders,
			Hashtable<String, String> urlQueryParameters, String contentType) {
		ClientResponse clientResponse = null;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name : " + getCallerClassName() + "Method name :" + getCallerMethodName());
			LOG.info("Method : getClientResponse");
			Client client = null;

			client = Client.create(new DefaultClientConfig());

			WebResource resource = client.resource(url);
			if ((urlQueryParameters != null) && (urlQueryParameters.keySet().toArray().length > 0)) {
				MultivaluedMap<String, String> queryParams = convertHashTableToMultivaluedMap(urlQueryParameters);
				resource = resource.queryParams(queryParams);
			}

			WebResource.Builder builder = resource.accept(new String[] { contentType });

			if ((requestHeaders != null) && (requestHeaders.keySet().toArray().length > 0)) {
				for (String key : requestHeaders.keySet()) {
					builder.header(key, requestHeaders.get(key));
				}
			}
			clientResponse = (ClientResponse) builder.get(ClientResponse.class);
			LOG.info("Response : " + clientResponse);
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} catch (Throwable e) {
			LOG.fatal(e);
			throw new RuntimeException(e);
		} finally {

			addLogs("Resource url: " + url + "\n \n Headers : " + requestHeaders + "\n \n urlQueryParameters : "
					+ urlQueryParameters + "\n \n Content Type : " + contentType);
		}
		return clientResponse;
	}

	public ClientResponse postClientResponse(String url, String input, Hashtable<String, String> requestHeaders,
			Hashtable<String, String> urlQueryParameters, String contentType) throws Throwable {
		ClientResponse clientResponse = null;
		Client client = null;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name : " + getCallerClassName() + "Method name :" + getCallerMethodName());
			LOG.info("Method : getClientResponse");
			client = Client.create(new DefaultClientConfig());
			WebResource resource = client.resource(url);

			if ((urlQueryParameters != null) && (urlQueryParameters.keySet().toArray().length > 0)) {
				MultivaluedMap<String, String> queryParams = convertHashTableToMultivaluedMap(urlQueryParameters);
				resource = resource.queryParams(queryParams);
			}

			WebResource.Builder builder = resource.accept(new String[] { contentType });

			if ((requestHeaders != null) && (requestHeaders.keySet().toArray().length > 0)) {
				for (String key : requestHeaders.keySet()) {
					builder.header(key, requestHeaders.get(key));
				}
			}

			if (input == null) {
				clientResponse = (ClientResponse) builder.post(ClientResponse.class);
			} else {
				clientResponse = (ClientResponse) builder.post(ClientResponse.class, input);
			}

			LOG.info("Response : " + clientResponse);
		} catch (Exception e) {
			LOG.fatal(e);
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {

			addLogs("Resource url: " + url + "\n \n Input : " + input + "\n \n Headers : " + requestHeaders
					+ "\n \n urlQueryParameters : " + urlQueryParameters + "\n \n Content Type : " + contentType);
		}
		return clientResponse;
	}
	
	public ClientResponse putClientResponse(String url, String input, Hashtable<String, String> requestHeaders,
			Hashtable<String, String> urlQueryParameters, String contentType) throws Throwable {
		ClientResponse clientResponse = null;
		Client client = null;
		try {
			LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			LOG.info("Class name : " + getCallerClassName() + "Method name :" + getCallerMethodName());
			LOG.info("Method : getClientResponse");
			client = Client.create(new DefaultClientConfig());
			WebResource resource = client.resource(url);

			if ((urlQueryParameters != null) && (urlQueryParameters.keySet().toArray().length > 0)) {
				MultivaluedMap<String, String> queryParams = convertHashTableToMultivaluedMap(urlQueryParameters);
				resource = resource.queryParams(queryParams);
			}

			WebResource.Builder builder = resource.accept(new String[] { contentType });

			if ((requestHeaders != null) && (requestHeaders.keySet().toArray().length > 0)) {
				for (String key : requestHeaders.keySet()) {
					builder.header(key, requestHeaders.get(key));
				}
			}

			if (input == null) {
				clientResponse = (ClientResponse) builder.put(ClientResponse.class);
			} else {
				clientResponse = (ClientResponse) builder.put(ClientResponse.class, input);
			}

			LOG.info("Response : " + clientResponse);
		} catch (Exception e) {
			LOG.fatal(e);
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {

			addLogs("Resource url: " + url + "\n \n Input : " + input + "\n \n Headers : " + requestHeaders
					+ "\n \n urlQueryParameters : " + urlQueryParameters + "\n \n Content Type : " + contentType);
		}
		return clientResponse;
	}

	public static AuthenticationResult getAuthenticationResultFromAzureUserCredentials(String authority, String resourceUrl,
			String clientID, String username, String password) throws Exception {
		AuthenticationContext context;
		AuthenticationResult result;
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(1);
			context = new AuthenticationContext(authority, true, service);
			Future<AuthenticationResult> future = context.acquireToken(resourceUrl, clientID, username, password, null);
			result = future.get();
		} finally {
			service.shutdown();
		}

		if (result == null) {
			throw new ServiceUnavailableException("authentication result was null");
		}
		return result;
	}

}
