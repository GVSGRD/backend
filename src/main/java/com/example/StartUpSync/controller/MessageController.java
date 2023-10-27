package com.example.StartUpSync.controller;

import com.example.StartUpSync.entity.Message;
import com.example.StartUpSync.service.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/create")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message resp = messageService.createMessage(message);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @GetMapping("/{messageId}")
    public ResponseEntity<Message> getMessageById(@PathVariable Long messageId) {
        Message resp = messageService.findMessageById(messageId);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> resp = messageService.findAllMessages();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Message> updateMessage(@RequestBody Message message) {
        Message resp = messageService.updateMessage(message);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{messageId}")
    public ResponseEntity<Long> deleteMessage(@PathVariable Long messageId) {
        messageService.deleteMessage(messageId);
        return new ResponseEntity<>(messageId, HttpStatus.NO_CONTENT);
    }
}
