package com.schoolM;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.table.Student;
import com.table.Subject;
import com.utility.HibernateUtility;


@WebServlet("/SubjectServlet")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	
		
		
		Session session=HibernateUtility.getSession();
		
		Transaction tx=session.beginTransaction();
		
		/*out.println("open session");
		out.println("is open session"+session.isConnected());
		
		out.println("is CLOSED session"+session.disconnect());*/
		
		
		Subject sub1=new Subject("first","Mathmatics");
		Subject sub2=new Subject("second","Physics");
		Subject sub3=new Subject("third","chemistry");
		Subject sub4=new Subject("fourth","Computer");
		Subject sub5=new Subject("fifth","English");
		
		out.println("table created");
		
		session.save(sub1);
		session.save(sub2);
		session.save(sub3);
		session.save(sub4);
		session.save(sub5);
		
		tx.commit();	
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
