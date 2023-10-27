package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Experience;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.Skill;

import java.util.List;

public interface ExperienceService {
	Experience createExperience(Experience experience);
	Experience findExperienceById(Long experienceId);
	List<Experience> findAllExperiences();
	Experience updateExperience(Experience experience);
	void deleteExperience(Long experienceId);
	List<Experience> getExperienceByUserId(Long userId);
}