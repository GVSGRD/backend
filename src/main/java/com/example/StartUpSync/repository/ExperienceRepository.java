package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Education;
import com.example.StartUpSync.entity.Experience;
import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
	List<Experience> findAllByUser_Id(Long userId);
}
