package com.cg.anurag.dao;
import com.cg.anurag.conn.*;
import com.cg.anurag.entity.Users;
import java.sql.*;
public class UsersDAO
{
     public boolean validateUser(Users u)
     {
    ResultSet rs=null;
    boolean flag=false;
    try(Connection con = DBconnection.establishConnection();
    PreparedStatement pst = con.prepareStatement
     ("select * from users where username=? and password=?"))
    {
    pst.setString(1,u.getUsername());
    pst.setString(2, u.getPassword());
    rs = pst.executeQuery();
    flag = rs.next();
    }
    catch(Exception ex)
    {
    ex.printStackTrace();
    }
    return flag;
     }
}
