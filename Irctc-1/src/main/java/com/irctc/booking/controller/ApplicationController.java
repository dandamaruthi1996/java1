package com.irctc.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.booking.model.User;
import com.irctc.booking.repositary.UserRepository;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@Autowired
	UserRepository repository;
	
	
	@PostMapping("/bookticket")
	public User addUser(@RequestBody User user)
	{
		return repository.saveAndFlush(user);
	}
}
