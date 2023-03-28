package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notification")
public class notofication {
	private long id;
	private String message;
	public notofication(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public notofication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "notofication [id=" + id + ", message=" + message + "]";
	}
	
	
	


}
