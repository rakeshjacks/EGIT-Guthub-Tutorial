package com.springmvc.model;

import javax.persistence.Column;
  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.Table;
  
@Entity 
@Table(name="USER")
public class User {  
 
@Id
 @Column(name="ID")
 @GeneratedValue
 private Integer id;
 @Column(name="FIRSTNAME")
 private String firstname;
 @Column(name="LASTNAME")
 private String lastname;
 @Column(name="EMAIL")
 private String email;
 @Column(name="PASSWORD")
 private String password;
 @Column(name="PHONE")
 private String phone;
 @Column(name="GENDER")
 private String sex;
 @Column(name="STATE")
 private String state;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public User(){}
 
public User(String firstname, String lastname, String email, String password, String phone, String sex,
		String state) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.sex = sex;
	this.state = state;
}




public User(int id, String firstname, String lastname, String email, String password, String phone, String sex,
		String state) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.sex = sex;
	this.state = state;
}
 
 
}