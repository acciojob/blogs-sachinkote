package com.driver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String description;
	private String dimention;
	@ManyToOne
	@JoinColumn
	private Blog blog;
	
	
	
	public Image() {
		super();
	}



	public Image(int id, String description, String dimention, Blog blog) {
		super();
		this.id = id;
		this.description = description;
		this.dimention = dimention;
		this.blog = blog;
	}



	public int getId() {
		return id;
	}



	public String getDescription() {
		return description;
	}



	public String getDimention() {
		return dimention;
	}



	public Blog getBlog() {
		return blog;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public void setDimention(String dimention) {
		this.dimention = dimention;
	}



	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	
	
	
}