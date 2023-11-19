package com.example.StartUpSync.controller;

import com.example.StartUpSync.entity.Notification;
import com.example.StartUpSync.entity.Skill;
import com.example.StartUpSync.service.interfaces.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
@CrossOrigin("http://localhost:3000")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/create")
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
        Notification createdNotification = notificationService.createNotification(notification);
        return new ResponseEntity<>(createdNotification, HttpStatus.CREATED);
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable Long notificationId) {
        Notification notification = notificationService.findNotificationById(notificationId);
        return new ResponseEntity<>(notification, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Notification>> getAllNotifications() {
        List<Notification> notifications = notificationService.findAllNotifications();
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Notification> updateNotification(@RequestBody Notification notification) {
        Notification updatedNotification = notificationService.updateNotification(notification);
        return new ResponseEntity<>(updatedNotification, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{notificationId}")
    public ResponseEntity<Long> deleteNotification(@PathVariable Long notificationId) {
        notificationService.deleteNotification(notificationId);
        return new ResponseEntity<>(notificationId, HttpStatus.NO_CONTENT);
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<List<Notification>> getSkillsByUserId(@PathVariable("userId") Long userId){

        List<Notification> notifications = notificationService.getNotificationsByUserId(userId);
        return new ResponseEntity<List<Notification>>(notifications, HttpStatus.OK);

    }
}

