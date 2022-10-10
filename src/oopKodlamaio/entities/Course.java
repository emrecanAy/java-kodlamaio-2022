package oopKodlamaio.entities;

import java.time.LocalDate;

public class Course {
	private String id;
	private String header;
	private String description;
	private String categoryId;	
	private String[] instructors;
	private int price;
	private LocalDate createdAt;
	private boolean deleted;
	
	public Course() {}
	
	public Course(String id, String header, String description, String categoryId, String[] instructors, int price, LocalDate createdAt, boolean deleted) {
		super();
		this.id = id;
		this.header = header;
		this.description = description;
		this.categoryId = categoryId;
		this.instructors = instructors;
		this.price = price;
		this.createdAt = createdAt;
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String[] getInstructors() {
		return instructors;
	}

	public void setInstructors(String[] instructors) {
		this.instructors = instructors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	
	
	
	
	
	
	
	
	
}
