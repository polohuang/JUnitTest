package org.paul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final static String DBNAME="Testing";
	private final static String USER="root";
	private final static String PASSWORD="1029";
	private final static String URL="jdbc:mysql://localhost:3306/"+DBNAME+"?user="+USER+"&password="+PASSWORD+"&useSSL=false";
	private final static String driverName="com.mysql.jdbc.Driver";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driverName).newInstance();
			conn=DriverManager.getConnection(URL);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
