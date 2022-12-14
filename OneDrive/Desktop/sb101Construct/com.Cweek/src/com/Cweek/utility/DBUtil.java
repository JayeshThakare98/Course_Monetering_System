package com.Cweek.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection provideConnection() {
		
		Connection con =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/cweek";
		
		try {
			con =  DriverManager.getConnection(url, "root", "2206");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con ; 
	}
	
}
