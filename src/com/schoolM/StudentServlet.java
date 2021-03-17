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
import com.utility.HibernateUtility;





@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentServlet() {
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
		
		
		Student std1=new Student(101,"Reyansh");
		Student std2=new Student(102,"Viyan");
		Student std3=new Student(103,"shruti");
		Student std4=new Student(104,"Varsha");
		Student std5=new Student(105,"Raghav");
		
		out.println("table created");
		session.save(std1);
		session.save(std2);
		session.save(std3);
		session.save(std4);
		session.save(std5);
		
		tx.commit();	
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
