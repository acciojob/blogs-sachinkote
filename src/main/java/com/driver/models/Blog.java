package com.driver.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="blog")
public class Blog{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String title;
	private String content;
	private Date date;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@OneToMany(mappedBy="image" ,cascade=CascadeType.ALL)
	private List<Image> imageList;

	public Blog() {
		super();
	}

	public Blog(int id, String title, String content, Date date, User user, List<Image> imageList) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
		this.user = user;
		this.imageList = imageList;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	public User getUser() {
		return user;
	}

	public List<Image> getImageList() {
		return imageList;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}
	
	
	
	
}