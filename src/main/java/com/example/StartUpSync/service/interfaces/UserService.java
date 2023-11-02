package com.example.StartUpSync.service.interfaces;

import java.util.List;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.payload.UserRequestDto;
import com.example.StartUpSync.payload.UserResponseDto;

public interface UserService {
	UserResponseDto createUser(UserRequestDto userRequestDto);
	UserResponseDto findUserById(Long userId);
	List<UserResponseDto> findAllUsers();
	UserResponseDto updateUser(UserRequestDto user, Long userId);
	void deleteUser(Long userId);
}

