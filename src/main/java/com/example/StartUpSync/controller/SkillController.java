package com.example.StartUpSync.controller;


import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.service.interfaces.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/skill")
public class SkillController {

	@Autowired
	private SkillService skillService;

	@GetMapping("get/{userId}")
	public ResponseEntity<List<Skill>> getSkillsByUserId(@PathVariable("userId") Long userId){

		List<Skill> skill = skillService.getSkillsByUserId(userId);
		return new ResponseEntity<List<Skill>>(skill, HttpStatus.OK);

	}

}

