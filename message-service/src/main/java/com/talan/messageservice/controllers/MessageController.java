package com.talan.messageservice.controllers;

import com.talan.messageservice.entities.Message;
import com.talan.messageservice.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @MessageMapping
    @SendTo("/topic/chat")
    Message sendMessageWebSocket(@Payload Message message) {
        return message;
    }

    @PostMapping
    Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("{senderId}/{recipientId}")
    List<Message> getUsersMessages(@PathVariable Long senderId, @PathVariable Long recipientId) {
        return messageService.findAllBySenderIdAndRecipientId(senderId, recipientId);
    }

    @DeleteMapping("{messageId}")
    void deleteMessageById(@PathVariable Long messageId) {
        messageService.deleteMessageById(messageId);
    }
}
