package com.example.StartUpSync.repository.interfaces;

import java.util.List;

import com.example.StartUpSync.entity.User;

public interface UserRepository {
	List<User> getUsers();
	User getUser(int userId);
}
