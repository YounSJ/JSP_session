package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginConn")
public class LoginConn extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public LoginConn() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String ID = request.getParameter("ID");
		String PW = request.getParameter("PW");
		
		out.print("ID: " + ID);
		out.print("PW: " + PW);
		
		HttpSession session = request.getSession();
		session.setAttribute("memberId", ID);
		
		response.sendRedirect("LoginOk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
