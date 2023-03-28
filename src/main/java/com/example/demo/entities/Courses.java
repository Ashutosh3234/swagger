package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = " courses")
public class Courses {
	private long id;
	private String title;
	private String discription;
	public Courses(long id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}
	
	

}
