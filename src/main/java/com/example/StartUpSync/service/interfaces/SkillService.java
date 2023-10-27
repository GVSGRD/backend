package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.Skill;

import java.util.List;

public interface SkillService {
	Skill createSkill(Skill skill);
	Skill findSkillById(Long skillId);
	List<Skill> findAllSkills();
	Skill updateSkill(Skill skill);
	void deleteSkill(Long skillId);
	List<Skill> getSkillsByUserId(Long userId);
}
