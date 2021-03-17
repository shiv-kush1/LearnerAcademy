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
import com.table.Teacher;
import com.utility.HibernateUtility;


@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TeacherServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		Teacher tch1=new Teacher("Manoj shivastav",sub1);
		Teacher tch2=new Teacher("atul sharma",sub2);
		Teacher tch3=new Teacher("arvind jain",sub3);
		Teacher tch4=new Teacher("amit jain",sub4);
		Teacher tch5=new Teacher("akash pathak",sub5);
		
		out.println("table created");
		session.save(tch1);
		session.save(tch2);
		session.save(tch3);
		session.save(tch4);
		session.save(tch5);
		
		tx.commit();	
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
