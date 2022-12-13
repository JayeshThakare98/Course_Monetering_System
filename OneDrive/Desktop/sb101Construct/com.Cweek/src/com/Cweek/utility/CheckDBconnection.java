package com.Cweek.utility;

import java.sql.Connection;

public class CheckDBconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBUtil.provideConnection();
		if(conn!=null) System.out.println("Data Base  Conected...");
		else System.out.println("Data Base Not Conected...");
	}

}
