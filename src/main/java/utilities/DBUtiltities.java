package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtiltities {

	

	// creating private static obj of connection class.
	// its used to create connection with database
	private static Connection conn;
	
	// crate private static object  of statement class
	//it is used to create a statement to execute the query
	private static Statement stmt;
	
	// creating private static obj of result class
	//it is used to create a resultset to store query result
	private static ResultSet resultSet;
	
	// create database url
	// synstax of DB url string or sql string
	// jdbc:
	private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";
			
	
	// database user username
	private static String dbUserName = "postgres";
	
	// data base user password 
	private static String dbPassword = "root";
	
	
	

	public static void setUpConnection () {
		
		try {
			conn = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	

		// here we are closing the connection. and writing method for it.
		
		public static void closeConnection() {
			
			if(conn != null) {      // if connection  is not null then close it  
				try {
					conn.close();
				}
				catch(Exception e) {
					
				}
			}
			
		}
	
	
	
	
		public static ResultSet runQuery(String query) {
			
					try {
			
						stmt = conn.createStatement();
						resultSet = stmt.executeQuery(query);
//						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
					return resultSet;
		
				}
	
		
		
		
		
		
		public void writeResultToCSV() {
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
