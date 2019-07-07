package vn.msita.studentmanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final String URL = "jdbc:mysql://localhost:3306/studentmanagement";
	public static final String USER = "root";
	public static final String PASS = "123456";
	
	public static Connection getConnection() {
		try {
			return (Connection) DriverManager.getConnection(URL, USER, PASS);
			
		}catch(SQLException ex) {
			throw new RuntimeException("Error ",ex);
		}
	}
	
	public static void main(String[] args) {
		ConnectionFactory.getConnection();
	}
	
}
