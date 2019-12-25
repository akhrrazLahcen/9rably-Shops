package com.nearby.kreblyShops.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

 
@Entity
@Table(name="Shop" ,schema="LAHCEN1")
public class Shop {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageURL;
	private double  longitude; 
	private double latitude;
	
	@ManyToMany(mappedBy="likedShops")
	private Set<User> usersLikedMe;
	
	@ManyToMany(mappedBy="deslikedShops")
	private Set<User> usersDeslikedMe;
	
	public Shop() {
		super();
 	}



	public Shop(String name, String imageURL, double d, double e) {
		super();
 		this.name = name;
		this.imageURL = imageURL;
		this.longitude = d;
		this.latitude = e;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getImageURL() {
		return imageURL;
	}



	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}



	public Set<User> getUsersLikedMe() {
		return usersLikedMe;
	}



	public void setUsersLikedMe(Set<User> usersLikedMe) {
		this.usersLikedMe = usersLikedMe;
	}



	public Set<User> getUsersDeslikedMe() {
		return usersDeslikedMe;
	}



	public void setUsersDeslikedMe(Set<User> usersDeslikedMe) {
		this.usersDeslikedMe = usersDeslikedMe;
	}
 



}
