package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.TeamUser;

import java.util.List;

public interface TeamUserService {
    TeamUser createTeamUser(TeamUser teamUser);
    TeamUser findTeamUserById(Long teamUserId);
    List<TeamUser> findAllTeamUsers();
    TeamUser updateTeamUser(TeamUser teamUser);
    void deleteTeamUser(Long teamUserId);
}

