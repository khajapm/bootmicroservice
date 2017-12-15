package com.deloitte.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.demo.entities.User;
import com.deloitte.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User getUser(int id) {
		return userRepo.findOne(id);
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(user -> users.add(user));
		return users;
	}
	
	
}
