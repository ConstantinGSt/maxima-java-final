package com.yourpricebase.model;

public class Person {
	private String name;
	private String logIn;
	private String email;
	private String phone;
	private String note;
	private boolean adequate; // hmm
	
	public Person(String name, String logIn, String email, String phone) {
		super();
		this.name = name;
		this.logIn = logIn;
		this.email = email;
		this.phone = phone;
	}

	public Person(String name, String phone) { // mb delete  
		this.name = name;
		this.phone = phone;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) { // pvoverit na simbols and null
		
		this.name = name;
	}

	public String getLogIn() {
		return logIn;
	}

	public void setLogIn(String logIn) { // not null
		this.logIn = logIn;
	}

	public String getEmail() { 
		return email;
	}

	public void setEmail(String email) { // pvoverit na simbols and null
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) { // pvoverit na simbols and null 
		this.phone = phone;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isAdequate() {
		return adequate;
	}

	public void setAdequate(boolean adequate) {
		this.adequate = adequate;
	}	
	
}
