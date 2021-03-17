package com.schoolM;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.table.Student;
import com.table.Subject;
import com.utility.HibernateUtility;


@WebServlet("/SubjectLoader")
public class SubjectLoader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SubjectLoader() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		Session session=HibernateUtility.getSession();
		
		Transaction tx=session.beginTransaction();
		

		Query query=session.createQuery("from Subject");
		
		List<Subject> list=query.list();
		
		for(Subject s:list) {
			
			out.println(s.getClas()+" "+s.getSubject());
		
		}
	
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
