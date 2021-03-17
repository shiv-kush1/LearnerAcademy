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
import com.table.Teacher;
import com.utility.HibernateUtility;


@WebServlet("/TeacherLoader")
public class TeacherLoader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TeacherLoader() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		Session session=HibernateUtility.getSession();
		
		Transaction tx=session.beginTransaction();
		

		Query query=session.createQuery("from Teacher");
		
		List<Teacher> list=query.list();
		
		for(Teacher t:list) {
			
			out.println(t.getName()+" "+t.getSubject());
		
		}
	
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
