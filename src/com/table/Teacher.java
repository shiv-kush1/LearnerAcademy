package com.table;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Teacher {
	
    @Id
	private String Name;
	
	@JoinColumn(name = "Teach_Sub")
	@OneToOne(cascade=CascadeType.ALL)
	private Subject subject;

	@JoinColumn(name = "Teach_stud")
	@OneToOne(cascade=CascadeType.ALL)
	private Student student;
	
	public Teacher(String name, Subject subject, Student student) {
		super();
		Name = name;
		this.subject = subject;
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher(String name, Subject subject) {
		super();
		Name = name;
		this.subject = subject;
	}

	public Teacher() {
		super();
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [Name=" + Name + ", subject=" + subject + ", student=" + student + "]";
	}

	
	
	}
	
	

	
	


