package oopKodlamaio.entities;

import java.time.LocalDate;

public class Category {
	
	private String id;
	private String name;
	private LocalDate createdAt;
	private boolean deleted;
	
	public Category() {}
	
	public Category(String id, String name, LocalDate createdAt, boolean deleted) {
		super();
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
