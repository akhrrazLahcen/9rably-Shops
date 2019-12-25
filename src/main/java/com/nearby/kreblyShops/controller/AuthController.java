package com.nearby.kreblyShops.controller;

 
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nearby.kreblyShops.model.Role;
import com.nearby.kreblyShops.model.User;
import com.nearby.kreblyShops.repository.RoleRepository;
import com.nearby.kreblyShops.repository.UserRepository;
 

@RestController
public class AuthController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
 	@PostMapping("/signup")
	public String registerUser(@RequestBody User user) {
		
		if(userRepository.existsByUsername(user.getUsername())) {
			return "Username is already taken!";
		}
		
		if(userRepository.existsByEmail(user.getEmail())) {
			return "An account already created with this mail adresse : " +user.getEmail()+" !!";
		}
		
		user.setRoles(new HashSet<Role>(Arrays.asList(roleRepository.findByName("ROLE_USER"))));
		userRepository.save(user);
		
		return "user added seccefully !!";
	}
}
