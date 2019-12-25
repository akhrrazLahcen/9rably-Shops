package com.nearby.kreblyShops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nearby.kreblyShops.model.Role;

 
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String name);

}
