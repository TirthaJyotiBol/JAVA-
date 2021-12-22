/*
 * This Class basically creates a connection
 * */

package com.student.management;
import java.sql.*;
public class CP {
	static Connection con;
	public static Connection create() throws Exception {
	
	// Load Driver
		Class.forName("com.mysql.jdbc.Driver");
	
	// Create Connection
		String username = "root";
		String password ="";
		String url = "jdbc:mysql://localhost:3306/studentmanagement";
		con = DriverManager.getConnection(url ,username ,password);
		
		return con;
	} 
}
