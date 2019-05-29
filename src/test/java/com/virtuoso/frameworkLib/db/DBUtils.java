package com.virtuoso.frameworkLib.db;

import java.sql.*;

import com.virtuoso.frameworkLib.Constants.Generics;

public class DBUtils {

	public static Connection connectDB(String hostName, String dbName, String user, String password)
			throws SQLException {

		String url = String.format(
				"jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
						+ "hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
				hostName, dbName, user, password);
		Connection connection = DriverManager.getConnection(url);
		System.out.println("Database connected!");
		return connection;
	}

	public static Connection connectDB() throws SQLException {
		return connectDB(Generics.getHostNameDB(), Generics.getDBName(), Generics.getUserNameDB(),
				Generics.getPasswordDB());
	}

	public static ResultSet sendQueryForSingleResultSet(Connection connection, String sqlStatement)
			throws SQLException {
		// Allocate a 'Statement' object in the Connection
		Statement stmt = connection.createStatement();

		// Execute a SQL SELECT query. The query result is returned in a 'ResultSet'
		// object.
		System.out.println("The SQL statement is: " + sqlStatement + "\n"); // Echo For debugging
		ResultSet rset = stmt.executeQuery(sqlStatement);
		rset.next();
		return rset;
	}

	public static ResultSet sendQueryForMultipleResultSet(Connection connection, String sqlStatement)
			throws SQLException {
		// Allocate a 'Statement' object in the Connection
		Statement stmt = connection.createStatement();

		// Execute a SQL SELECT query. The query result is returned in a 'ResultSet'
		// object.
		System.out.println("The SQL statement is: " + sqlStatement + "\n"); // Echo For debugging
		ResultSet rset = stmt.executeQuery(sqlStatement);
		return rset;
	}

}
