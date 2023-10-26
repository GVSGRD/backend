package com.example.StartUpSync.controller;


import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.service.interfaces.EducationService;
import com.example.StartUpSync.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/education")
public class EducationController {

	@Autowired
	private EducationService educationService;

	@GetMapping("get/{userId}")
	public ResponseEntity<List<Education>> getEducationByUserId(@PathVariable("userId") Long userId){
		
		List<Education> eduation = educationService.getEducationByUserId(userId);
		return new ResponseEntity<List<Education>>(eduation, HttpStatus.OK);
		
	}

}

