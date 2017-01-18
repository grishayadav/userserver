package com.model;

import javax.persistence.Entity;

@Entity
public class User {
	 
private int firstName;
private int lastName;
public int getFirstName() {
	return firstName;
}
public void setFirstName(int firstName) {
	this.firstName = firstName;
}
public int getLastName() {
	return lastName;
}
public void setLastName(int lastName) {
	this.lastName = lastName;
}
public User(int firstName, int lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public User(){
	
}
}
