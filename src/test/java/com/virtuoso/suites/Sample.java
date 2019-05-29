package com.virtuoso.suites;

import java.io.File;
import java.sql.*;

import org.junit.Test;

import com.microsoft.aad.adal4j.AuthenticationResult;
import com.virtuoso.frameworkLib.Constants.Generics;
import com.virtuoso.frameworkLib.db.DBUtils;
import com.virtuoso.pages.apiMobileFunctionalities.AuthenticateAPI;

public class Sample {
	AuthenticateAPI authenticate = new AuthenticateAPI();

	@Test
	public void sTest() throws Exception {

		/*
		 * Connection con=DBUtils.connectDB("virtuosotestdb.database.windows.net",
		 * "dev_12apr", "virtuosoadmin", "P@ssw0rd");
		 * 
		 * ResultSet res=DBUtils.sendQueryForSingleResultSet(con,
		 * "SELECT * from FinancialRiskReserve where ProjectId=19554");
		 * System.out.println(res);
		 */
		AuthenticationResult authResult = authenticate.authenticateUser("virww1@microsoft.com", "Sep@2018");
		String accessToken = authResult.getAccessToken();
		System.out.println("accessToken :" + accessToken);
	}

}
