package com.student.management;
import java.sql.*;
public class studentDao {

	public static boolean insertStudentToDB(student st) throws Exception {
		boolean flag = false;
		// JDBC code to insert..
		Connection c = CP.create();
		
		String query = "Insert into student(name,phone,city) values(?,?,?) ";
		
		// Since we have dynamic data so use prepared statement
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1, st.getStudent_name());
		ps.setString(2, st.getStudent_phone());
		ps.setString(3,st.getStudent_city());
		
		ps.executeUpdate();
		flag = true;
		
		return flag;
	}
	
	public static boolean delete(int id)throws Exception {
		boolean flag = false;
		
		Connection c = CP.create();
		
		String query = "delete from student where id=? ";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();

		flag = true;
		
		return flag;
	}

	public static void show() throws Exception {
		boolean flag = false;
		
		Connection c = CP.create();
		
		String query = "select * from student ";
		Statement stmt = c.createStatement();
		
		ResultSet r = stmt.executeQuery(query);
		
		while(r.next()) {
			int id = r.getInt(1);
			String name = r.getString(2);
			String city = r.getString(3);
			String phone = r.getString(4);
			
			System.out.println("ID : "+id);
			System.out.println("Name :"+name);
			System.out.println("City : "+city);
			System.out.println("Phone : "+phone);
			System.out.println();
		}


		
	}
}
