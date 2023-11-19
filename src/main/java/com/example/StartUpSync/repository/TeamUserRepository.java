package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.entity.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamUserRepository extends JpaRepository<TeamUser, Long> {
    List<TeamUser> findByTeamId(Long teamId);
}

