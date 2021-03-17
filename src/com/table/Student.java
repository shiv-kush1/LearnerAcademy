package com.table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int rollNo;
	
private String name;

public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}
	


}
