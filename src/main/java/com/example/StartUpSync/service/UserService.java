package com.example.StartUpSync.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.repository.UserRepository;

@Service
public class UserService implements com.example.StartUpSync.service.interfaces.UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	@Override
	public User findUserById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
}

