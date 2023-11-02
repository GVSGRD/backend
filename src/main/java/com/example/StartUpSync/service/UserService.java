package com.example.StartUpSync.service;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.StartUpSync.payload.UserRequestDto;
import com.example.StartUpSync.payload.UserResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.repository.UserRepository;

@Service
public class UserService implements com.example.StartUpSync.service.interfaces.UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserResponseDto createUser(UserRequestDto userRequestDto) {
		User user = this.modelMapper.map(userRequestDto, User.class);
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		this.userRepository.save(user);
		return this.modelMapper.map(user, UserResponseDto.class);
	}
	@Override
	public UserResponseDto findUserById(Long userId) {
		User user = userRepository.findById(userId).orElse(null);
		return this.modelMapper.map(user, UserResponseDto.class);
	}
	@Override
	public List<UserResponseDto> findAllUsers() {
		List<UserResponseDto> allUsers = userRepository.findAll().stream().map((user -> this.modelMapper.map(user, UserResponseDto.class))).collect(Collectors.toList());
		return allUsers;
	}
	@Override
	public UserResponseDto updateUser(UserRequestDto userRequestDto, Long userId) {
		User user = this.userRepository.findById(userId).orElse(null);
		User updatedUser = user
				.builder()
				.id(user.getId())
				.name(userRequestDto.getName())
				.userName(userRequestDto.getUserName())
				.password(userRequestDto.getPassword())
				.email(userRequestDto.getEmail())
				.designation(userRequestDto.getDesignation())
				.bio(userRequestDto.getBio())
				.profileImageUrl(userRequestDto.getProfileImageUrl())
				.location(userRequestDto.getLocation())
				.github(userRequestDto.getGithub())
				.linkedin(userRequestDto.getLinkedin())
				.createdAt(user.getCreatedAt())
				.updatedAt(new Date())
				.build();
		return this.modelMapper.map(updatedUser, UserResponseDto.class);
	}
	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
}

