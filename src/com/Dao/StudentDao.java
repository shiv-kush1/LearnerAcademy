package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.table.Student;
import com.utility.HibernateUtility;



public class StudentDao {

	
public  void createTable() {
		
	Session session=HibernateUtility.getSession();
	
	Transaction tx=session.beginTransaction();
	
	Student std=new Student(101,"shivam");
	
	session.save(std);
	tx.commit();
		
	
}
}