package com.dto;

import java.time.LocalDate;

public class Author2 {
  
	
	private String id;
	private String name;
	private LocalDate dob;
	public Author2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author2(String id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Author2 [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
}
