package com.table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
@Id
private String clas;
	
private String subject;

public Subject(String clas, String subject) {
	super();
	this.clas = clas;
	this.subject = subject;
}

public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

public String getClas() {
	return clas;
}

public void setClas(String clas) {
	this.clas = clas;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "Subject [clas=" + clas + ", subject=" + subject + "]";
}






}
