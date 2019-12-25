package com.nearby.kreblyShops.model;



import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="NearbyShops_User", schema="LAHCEN1")
public class User {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "usernearby_Sequence")
    @SequenceGenerator(name = "usernearby_Sequence", sequenceName = "USER_SEQ")
	private Long id;
	private String username;
	private String email;
	private String password;
	private transient String confirmationPassword;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_LikedShops",
				joinColumns=@JoinColumn(name="user_id"),
				inverseJoinColumns=@JoinColumn(name="shop_id"))
	private Set<Shop> likedShops;
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_DeslikedShops",
				joinColumns=@JoinColumn(name="user_id"),
				inverseJoinColumns=@JoinColumn(name="shop_id"))	
	private Set<Shop> deslikedShops;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_roles",
				joinColumns=@JoinColumn(name="user_id"),
				inverseJoinColumns=@JoinColumn(name="role_id"))	
	private Set<Role> roles;
	
	public User() {
		super();
 	}

	public User(String username, String email, String password, String confirmationPassword) {
		super();
 		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmationPassword = confirmationPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}

	public Set<Shop> getLikedShops() {
		return likedShops;
	}

	public void setLikedShops(Set<Shop> likedShops) {
		this.likedShops = likedShops;
	}

	public Set<Shop> getDeslikedShops() {
		return deslikedShops;
	}

	public void setDeslikedShops(Set<Shop> deslikedShops) {
		this.deslikedShops = deslikedShops;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	

}
