package com.deloitte.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.demo.entities.User;
import com.deloitte.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{id}")
	public User findUser(@RequestParam int id) {
		return userService.getUser(id);
	}
	
	
	@RequestMapping("/users")
	public List<User> findAllUser(@RequestParam int id) {
		return userService.getAllUsers();
	}
	
}
