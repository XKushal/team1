package com.team1.GrpProjectOne.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	public static final String URL = "jdbc:mysql://localhost:3306/bankAccount_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "rootroot";
	public static final String DIVER_NAME = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	}
}
