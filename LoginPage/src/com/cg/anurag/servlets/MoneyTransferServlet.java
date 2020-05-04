package com.cg.anurag.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.anurag.dao.AccountsDAO;
@WebServlet(value="/mts")
@SuppressWarnings("serial")
public class MoneyTransferServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		ServletContext sc = getServletConfig().getServletContext();
		System.out.println(sc.getAttribute("message"));
		double amount = Double.parseDouble(request.getParameter("amount"));
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("username");
		PrintWriter out =response.getWriter();
		if(new AccountsDAO().updateBalance(username, amount))
			out.print("Amount Transfer Successful");
		else
			out.print("Transfer Failed");
	}

}
