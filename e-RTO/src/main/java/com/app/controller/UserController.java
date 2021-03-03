package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	//login user
	public Users loginUser() {
		return userRepo.findByEmailAndPassword()
	}
}
