package com.example.StartUpSync.service.interfaces;

import java.util.List;

import com.example.StartUpSync.entity.User;

public interface UserService {
	List<User> getUsers();
	User getUser(int userId);
}
