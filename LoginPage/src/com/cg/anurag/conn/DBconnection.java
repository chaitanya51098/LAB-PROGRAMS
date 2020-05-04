package com.cg.anurag.conn;
import java.sql.*;
public class DBconnection 
{
 public static Connection establishConnection() throws Exception
 {
	 String url="jdbc:oracle:thin:@localhost:1521:xe";
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 return DriverManager.getConnection(url,"Akhilesh","akhil");
 }
}
