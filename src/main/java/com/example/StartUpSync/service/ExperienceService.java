package com.example.StartUpSync.service;


import com.example.StartUpSync.entity.Experience;
import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements com.example.StartUpSync.service.interfaces.ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepository;

	@Override
	public List<Experience> getExperienceByUserId(Long userId) {
		return experienceRepository.findAllByUser_Id(userId);
	}
}
