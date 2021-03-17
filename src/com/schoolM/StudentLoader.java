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
import com.utility.HibernateUtility;


@WebServlet("/StudentLoader")
public class StudentLoader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentLoader() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		Session session=HibernateUtility.getSession();
		
		Transaction tx=session.beginTransaction();
		

		Query query=session.createQuery("from Student");
		
		List<Student> list=query.list();
		
		for(Student s:list) {
			
			out.println(s.getRollNo()+" "+s.getName());
		
		}
	
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
