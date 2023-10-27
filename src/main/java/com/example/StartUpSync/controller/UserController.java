package com.example.StartUpSync.controller;


import java.util.List;

import com.example.StartUpSync.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.service.interfaces.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User resp = userService.createUser(user);
		return new ResponseEntity<User>(resp, HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Long userId) {
		User resp = userService.findUserById(userId);
		return new ResponseEntity<User>(resp, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> resp =  userService.findAllUsers();
		return new ResponseEntity<List<User>>(resp, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User resp = userService.updateUser(user);
		return new ResponseEntity<User>(resp, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Long> deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<Long>(userId, HttpStatus.NO_CONTENT);
	}

}

