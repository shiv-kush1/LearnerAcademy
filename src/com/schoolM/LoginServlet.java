package com.schoolM;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("myname", name);
		
		if (name.equals("Shivam") && pass.equals("manager")) {
			
			//out.println("Welcome to Applications");	
			
			response.sendRedirect("loginSuccess.jsp");
			
		}else
			
		{
			out.println("login is not valid");	
			
		}
		
		
		
		
	}

}
