package oopKodlamaio.entities;

import java.time.LocalDate;

public class Instructor {
	private String id;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String biography;
	private LocalDate createdAt;
	private boolean deleted;
	
	public Instructor() {}
	
	public Instructor(String id, String firstName, String lastName, String imageUrl, String biography, LocalDate createdAt, boolean deleted) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.imageUrl = imageUrl;
		this.biography = biography;
		this.createdAt = createdAt;
		this.deleted = deleted;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
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
