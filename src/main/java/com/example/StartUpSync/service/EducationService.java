package com.example.StartUpSync.service;


import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements com.example.StartUpSync.service.interfaces.EducationService {

	@Autowired
	private EducationRepository educationRepository;

	@Override
	public List<Education> getEducationByUserId(Long userId) {
		return educationRepository.findAllByUser_Id(userId);
	}
}
