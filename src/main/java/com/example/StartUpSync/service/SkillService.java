package com.example.StartUpSync.service;


import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements com.example.StartUpSync.service.interfaces.SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public List<Skill> getSkillsByUserId(Long userId) {
		return skillRepository.findAllByUser_Id(userId);
	}
}
