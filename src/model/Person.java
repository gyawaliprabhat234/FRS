package model;

import java.util.UUID;

public abstract class Person {
	private String id;
	private String lname;
	private String fname;
	private String email;
	public Person(String id, String lname, String fname, String email) {
		super();
		this.id = UUID.randomUUID().toString();
		this.lname = lname;
		this.fname = fname;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "";
	}
	

}
