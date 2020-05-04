package com.cg.anurag.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.cg.anurag.entity.Users;
import com.cg.anurag.dao.UsersDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
@WebServlet(value="/AuthenticateServer")
public class AuthenticateServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext sc = getServletConfig().getServletContext();
		System.out.println(sc.getAttribute("message"));
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Users u = new Users(username,password);
		RequestDispatcher rd =null;
		if(new UsersDAO().validateUser(u))
		{
			HttpSession session = request.getSession();//Singleton
			session.setMaxInactiveInterval(60);
			session.setAttribute("username",username);
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request,response);
		}
		else
		{
		 rd = request.getRequestDispatcher("login.html");	
		 rd=request.getRequestDispatcher("failure.html");
		 out.print("<h1>");
		 rd.include(request,response);
		}
		
	}

}
