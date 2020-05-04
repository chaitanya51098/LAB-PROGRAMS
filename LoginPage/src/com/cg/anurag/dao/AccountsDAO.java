package com.cg.anurag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cg.anurag.conn.DBconnection;

public class AccountsDAO
{
 public boolean updateBalance(String username,double amount)
 {
	 int count=0;
	 try(Connection con = DBconnection.establishConnection();
			 PreparedStatement pst = con.prepareStatement("update accounts set balance=balance-? where username=?"))
			 {
		      pst.setDouble(1, amount);
		      pst.setString(2, username);
		      count = pst.executeUpdate();
			 }
	 catch(Exception ex)
	 {
		 ex.printStackTrace();
	 }
	 return count==1;
					 
 }
}
