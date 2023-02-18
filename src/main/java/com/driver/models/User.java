package com.driver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy="blog", cascade=CascadeType.ALL)
	private List<Blog> blogList;

	
	
	public User() {
		super();
	}



	public User(int id, String username, String password, String firstName, String lastName, List<Blog> blogList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.blogList = blogList;
	}



	public int getId() {
		return id;
	}



	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public List<Blog> getBlogList() {
		return blogList;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}
	
}