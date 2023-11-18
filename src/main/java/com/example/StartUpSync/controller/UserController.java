package com.example.StartUpSync.controller;


import java.util.List;

import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.payload.UserRequestDto;
import com.example.StartUpSync.payload.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.service.interfaces.UserService;

@Controller
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto) {
		System.out.println(userRequestDto.toString());
		UserResponseDto resp = userService.createUser(userRequestDto);
		return new ResponseEntity<UserResponseDto>(resp, HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long userId) {
		UserResponseDto resp = userService.findUserById(userId);
		return new ResponseEntity<UserResponseDto>(resp, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<UserResponseDto>> getAllUsers() {
		List<UserResponseDto> resp =  userService.findAllUsers();
		return new ResponseEntity<List<UserResponseDto>>(resp, HttpStatus.OK);
	}

	@PutMapping("/update/{userId}")
	public ResponseEntity<UserResponseDto> updateUser(@RequestBody UserRequestDto user, @PathVariable Long userId) {
		UserResponseDto resp = userService.updateUser(user, userId);
		return new ResponseEntity<UserResponseDto>(resp, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Long> deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<Long>(userId, HttpStatus.NO_CONTENT);
	}

}

