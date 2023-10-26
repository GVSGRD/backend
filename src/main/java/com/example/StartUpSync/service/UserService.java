package com.example.StartUpSync.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.repository.interfaces.UserRepository;

@Service
public class UserService implements com.example.StartUpSync.service.interfaces.UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public User getUser(int userId) {
		return userRepository.getUser(userId);
	}

}
