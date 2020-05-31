package com.rohit.udemy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String fistName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String emailId;

	public Customer() {
	}

	public Customer(String fistName, String lastName, String emailId) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
