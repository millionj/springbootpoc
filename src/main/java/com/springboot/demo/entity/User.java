package com.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iduser")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="credit_score")
	private String credit_score;
	
		
	
}
