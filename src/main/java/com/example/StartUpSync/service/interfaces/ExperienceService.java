package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Experience;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.Skill;

import java.util.List;

public interface ExperienceService {
	List<Experience> getExperienceByUserId(Long userId);
}