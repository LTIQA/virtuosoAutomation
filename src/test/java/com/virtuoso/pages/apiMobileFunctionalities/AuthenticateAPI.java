package com.virtuoso.pages.apiMobileFunctionalities;


import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.api.RestActions;
import com.virtuoso.frameworkLib.api.ServiceUrl;

public class AuthenticateAPI extends RestActions {

	

	public AuthenticationResult authenticateUser(String userID, String password) throws Exception {
		return getAuthenticationResultFromAzureUserCredentials(ServiceUrl.azureAuthorityUrl, ServiceUrl.BaseUrl,
				ServiceUrl.azureClientID, userID, password);
	}

	
}
