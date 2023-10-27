package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Long> {
	List<Skill> findByUserId(Long userId);
}
