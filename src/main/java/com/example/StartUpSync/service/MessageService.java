package com.example.StartUpSync.service;

import com.example.StartUpSync.entity.Message;
import com.example.StartUpSync.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements com.example.StartUpSync.service.interfaces.MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message findMessageById(Long messageId) {
        return messageRepository.findById(messageId).orElse(null);
    }

    public List<Message> findAllMessages() {
        return messageRepository.findAll();
    }

    public Message updateMessage(Message message) {
        return messageRepository.save(message);
    }

    public void deleteMessage(Long messageId) {
        messageRepository.deleteById(messageId);
    }
}
