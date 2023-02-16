package com.ysh.model;

public class User {
	int ID;
	String name;
	String email;
	String country;
	
	
	public User(int iD, String name, String email, String country) {
		super();
		ID = iD;
		this.name = name;
		this.email = email;
		this.country = country;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
