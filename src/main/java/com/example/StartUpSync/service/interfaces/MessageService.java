package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Message;

import java.util.List;

public interface MessageService {
    Message createMessage(Message message);
    Message findMessageById(Long messageId);
    List<Message> findAllMessages();
    Message updateMessage(Message message);
    void deleteMessage(Long messageId);
}