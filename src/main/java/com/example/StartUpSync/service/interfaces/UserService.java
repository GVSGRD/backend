package com.example.StartUpSync.service.interfaces;

import java.util.List;

import com.example.StartUpSync.entity.User;

public interface UserService {
	User createUser(User user);
	User findUserById(Long userId);
	List<User> findAllUsers();
	User updateUser(User user);
	void deleteUser(Long userId);
}

