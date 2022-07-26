package com.tushar.assignment4.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
	public static void main(String[] args) {
		try {
		Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Password@123");
		System.out.println(connection);
		Statement statement = connection.createStatement();
	
		ResultSet resultSet = statement.executeQuery("select * from employee");
		while(resultSet.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getInt(4));
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4));
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
