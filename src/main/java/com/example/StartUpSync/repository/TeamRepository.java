package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Team;
import com.example.StartUpSync.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface TeamRepository extends JpaRepository<Team, Long> {

}
