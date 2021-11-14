package com.regres.model;

/**
 * Modelo del usuario
 * 
 * @author Frank
 *
 */
public class User {

	private String id;
	private String last_name;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "id: " + id + " - last_name: " + last_name + " - email: " + email;
	}

}
