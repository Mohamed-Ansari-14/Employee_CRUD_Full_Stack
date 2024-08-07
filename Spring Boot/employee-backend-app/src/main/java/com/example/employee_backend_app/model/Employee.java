package com.example.employee_backend_app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_Id")
	private String emailId;
	
	public Employee(String firstName, String secondName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = secondName;
		this.emailId = emailId;
	}
	
	public Employee() {
		
	}
}
