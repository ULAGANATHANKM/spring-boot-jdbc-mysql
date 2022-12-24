package com.ebrain.springboot.training.demotraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebrain.springboot.training.demotraining.dto.User;
import com.ebrain.springboot.training.demotraining.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
	

}
