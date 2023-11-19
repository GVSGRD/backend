package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Notification;
import com.example.StartUpSync.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserId(Long userId);
}

