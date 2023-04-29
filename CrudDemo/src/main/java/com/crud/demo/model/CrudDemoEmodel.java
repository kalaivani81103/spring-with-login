package com.crud.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo1")
public class CrudDemoEmodel {

	@Id
	private int id;
	@Column(name="book_name",nullable=false)
	private String bookname;
	@Column(name="author_name",nullable=false)
	private String authorname;
	
	CrudDemoEmodel(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
}
