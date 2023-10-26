package com.example.StartUpSync.controller;


import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Experience;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.service.interfaces.EducationService;
import com.example.StartUpSync.service.interfaces.ExperienceService;
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
@RequestMapping("/experience")
public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;

	@GetMapping("get/{userId}")
	public ResponseEntity<List<Experience>> getExperienceByUserId(@PathVariable("userId") Long userId){

		List<Experience> experience = experienceService.getExperienceByUserId(userId);
		return new ResponseEntity<List<Experience>>(experience, HttpStatus.OK);

	}
}

