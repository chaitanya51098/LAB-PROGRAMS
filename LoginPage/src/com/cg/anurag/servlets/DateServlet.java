package com.cg.anurag.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/getDate")
@SuppressWarnings("serial")
public class DateServlet extends GenericServlet
{
 public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
 {
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 out.print("<html><body>");
	 out.print("<center><h1>");
	 out.print(new java.util.Date());
	 out.print("</h1></center>");
	 out.print("</body></html>");
 }
}
