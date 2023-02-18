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
	private Date pubDate;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@OneToMany(mappedBy="image" ,cascade=CascadeType.ALL)
	private List<Image> imageList;

	public Blog() {
		super();
	}

	public Blog(int id, String title, String content, Date pubDate, User user, List<Image> imageList) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.pubDate = pubDate;
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

	
	public void setUser(User user) {
		this.user = user;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	
	
	
	
}