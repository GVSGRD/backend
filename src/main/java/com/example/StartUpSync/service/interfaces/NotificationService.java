package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);
    Notification findNotificationById(Long notificationId);
    List<Notification> findAllNotifications();
    Notification updateNotification(Notification notification);
    void deleteNotification(Long notificationId);
}

