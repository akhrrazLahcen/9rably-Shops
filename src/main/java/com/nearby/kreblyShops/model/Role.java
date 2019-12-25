package com.nearby.kreblyShops.model;

 
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="role", schema="LAHCEN1")
public class Role {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "rolenearby_Sequence")
    @SequenceGenerator(name = "rolenearby_Sequence", sequenceName = "ROLE_SEQ")
 	private Long id;
	private String name;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users;
	
	public Role() {
		super(); 
 	}
	
	
	public Role(String name) {
		super();
 		this.name = name;
	}



	Long getId() {
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
	 
}
