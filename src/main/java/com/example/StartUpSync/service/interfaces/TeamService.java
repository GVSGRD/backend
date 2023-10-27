package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Team;

import java.util.List;

public interface TeamService {
    Team createTeam(Team team);
    Team findTeamById(Long teamId);
    List<Team> findAllTeams();
    Team updateTeam(Team team);
    void deleteTeam(Long teamId);
}
