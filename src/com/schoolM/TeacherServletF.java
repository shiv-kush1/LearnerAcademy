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


@WebServlet("/TeacherServletF")
public class TeacherServletF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TeacherServletF() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		Subject sub1=new Subject("first","Mathmatics");
		Subject sub2=new Subject("second","Physics");
		Subject sub3=new Subject("third","chemistry");
		Subject sub4=new Subject("fourth","Computer");
		Subject sub5=new Subject("fifth","English");
		
		Teacher tch1=new Teacher("Manoj shivastav",sub1,std1);
		Teacher tch2=new Teacher("atul sharma",sub2,std2);
		Teacher tch3=new Teacher("arvind jain",sub3,std3);
		Teacher tch4=new Teacher("amit jain",sub4,std4);
		Teacher tch5=new Teacher("akash pathak",sub5,std5);
		
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
