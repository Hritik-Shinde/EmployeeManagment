package com.bankapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for emp table
 * 
 * @author Hritik shinde date 11/11/21
 */

@Entity
@Table(name = "EmpManagmentSystem") // creates a table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increment as we put employee data
	private int id;
	private String nameString;
	private String emailString;
	private long phno;
	private String performance;
	private float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Implementaion of getter and settor methord
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + ", emailString=" + emailString + ", phno=" + phno
				+ ", performance=" + performance + ", salary=" + salary + "]";
	}

}
