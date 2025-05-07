package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.Bean.StudentBean;
import jdbc.util.DBSconnction;

// StudentDao---Student Table
public class StudentDao1 
{
	// Insert Query
	public int insertStudent(String name,int std,int marks) 
	{
		int rowsAffected = 0;
		// 1) create SQL query
		String insertQuery = "INSERT INTO students(name,std,marks) VALUES ('"+ name +"',"+std+","+marks+")";
		
		System.out.println("insertQuery :" + insertQuery) ;
		
		// 2) get Db Connection
		Connection conn = DBSconnction.getConnection();
		
		// 3) validate conn object
		if (conn != null) 
		{
			try 
			{
				// 4) conn object ===> create statement 
				Statement stmt = conn.createStatement();

				// 5) execute sql query by executeUpdate()
				rowsAffected = stmt.executeUpdate(insertQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	// Update Query
	public static int updateStudent(StudentBean sben,int rno) 
	{
		String updateQuery = "UPDATE students SET name='"+sben.getName()+"',std="+sben.getStd()+" , marks="+sben.getMarks()+" WHERE rno = "+rno;
		System.out.println("updateQuery"+ updateQuery);
		Connection conn = DBSconnction.getConnection();
		Statement stmt = null;
		int rowAffected = 0;
		
		if(conn!=null)
		{
			try
			{
				stmt = conn.createStatement();
				rowAffected = stmt.executeUpdate(updateQuery);
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}else
		{
			System.out.println("StudentDao --- updateStudent Db not connecrted :");
		}
		return rowAffected;
	}
	// Delete Query
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM students WHERE RNO = " + rno;
		Connection conn = DBSconnction.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null)
		{
			try
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}else
		{
			System.out.println("Db not Connected : " + conn);
		}
		return rowsAffected;
	}
	// Select Query
	public void getAllStudentRecords() 
	{
		String  selectQuery = "select rno ,name,std,marks from students ";
		ResultSet rs = null;
		Connection conn = DBSconnction.getConnection();
		Statement stmt = null;
		if (conn!=null)
		{
			try
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while(rs.next())
				{
					int rno = rs.getInt("rno");
					String name = rs.getString("name");
					int std = rs.getInt("std");
					int marks = rs.getInt("marks");
					
					System.out.println(rno + " " + name + " " + std + " " + marks);
					
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}else
		{
			System.out.println("StudentDao()----getAllStudentRecords() Db not Connected :");
		}
	}

	public static void main(String[] args) 
	{
		StudentDao Dao = new StudentDao();
		Dao.getAllStudentRecords();
	}
	}
//package jdbc.dao;



//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//import jdbc.bean.StudentBean;
//import jdbc.util.DBConnection;
//
//// StudentDao---Student Table
//public class StudentDao 
//{
//	// Insert Query
//	public int insertStudent(StudentBean sbean) 
//	{
//		int rowsAffected = 0;
//		// 1) create SQL query
//		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ sbean.getName() +"',"+ sbean.getStd()+","+sbean.getMarks()+")";
//		
//		System.out.println("insertQuery :" + insertQuery) ;
//		
//		// 2) get Db Connection
//		Connection conn = DBConnection.getConnection();
//		
//		// 3) validate conn object
//		if (conn != null) 
//		{
//			try 
//			{
//				// 4) conn object ===> create statement 
//				Statement stmt = conn.createStatement();
//
//				// 5) execute sql query by executeUpdate()
//				rowsAffected = stmt.executeUpdate(insertQuery);
//			
//			} catch (SQLException e) 
//			{
//				e.printStackTrace();
//			}
//		} else 
//		{
//			System.out.println("StudentDao--insertStudent() Db not connected");
//		}
//		return rowsAffected;
//	}
//	// Update Query
//	public void updateStudent() 
//	{
//
//	}
//	// Delete Query
//	public void deleteStudent() 
//	{
//
//	}
//	// Select Query
//	public void getAllStudentRecords() 
//	{
//
//	}
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Std : ");
//		int std = sc.nextInt();
//		System.out.println("Enter Marks : ");
//		int marks = sc.nextInt();
//		
//		StudentBean sbean = new StudentBean(0, name, std, marks);
//		
//		int rowsAffected = 0 ;
//		
//		StudentDao studentDao = new StudentDao();
//		
//		rowsAffected = studentDao.insertStudent(sbean);
//		
//		if (rowsAffected > 0 )
//		{
//			System.out.println("Student record successfully Inserted : " + rowsAffected);
//		} else 
//		{
//			System.out.println("Student record not Inserted : " + rowsAffected);
//		}
//	}
//}