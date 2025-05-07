package jdbc.util;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//1) make Credential
	private static final  String URLNAME = "jdbc:mysql://localhost:3306/test";
	private static final  String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final  String USERNAME = "root";
	private static final  String PASSWORD = "root";
	
	// 2) create getconnection method
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try
		{
			// 3) load Driver class --- "Driver.class" --- object
			Class.forName(DRIVERCLASS);
			
			// 4) pass creadential into DriverManager s getconnection
			conn = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
			
			// 5) validate connection object
			if (conn!=null)
			{
				System.out.println("Db connected : " + conn);
				
			}else
			{
				System.out.println("Db not connected :" + conn);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return conn;
			
	}
	public static void main(String[] args) {
		
		DBConnection.getConnection();
	}
}
