package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Skill;

import java.util.List;

public interface EducationService {
	List<Education> getEducationByUserId(Long userId);
}