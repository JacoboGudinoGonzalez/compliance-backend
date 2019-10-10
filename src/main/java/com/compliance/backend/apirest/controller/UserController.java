package com.compliance.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliance.backend.apirest.models.entity.User;
import com.compliance.backend.apirest.models.service.IUserService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/users")
	public List<User> index(){
		return userService.findAll();		
	}
}
