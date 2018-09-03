package com.thoughtworks.model;


public class User {
	private String username;
	private String country;

	public User() {
	}

	public User(String username, String country) {
		this.username = username;
		this.country = country;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
