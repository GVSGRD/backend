package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Skill;

import java.util.List;

public interface EducationService {
	Education createEducation(Education education);
	Education findEducationById(Long educationId);
	List<Education> findAllEducations();
	Education updateEducation(Education education);
	void deleteEducation(Long educationId);
	List<Education> getEducationByUserId(Long userId);
}