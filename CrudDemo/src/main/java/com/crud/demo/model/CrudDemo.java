package com.crud.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")
public class CrudDemo {
	
	@Id
	@Column(unique=true)
	private int id;
	@Column(name="user_name",nullable=false)
	private String username;
	@Column(name="pass_word",nullable=false)
	private String password;
	
	CrudDemo(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
