package com.talan.messageservice.controllers;

import com.talan.messageservice.entities.Message;
import com.talan.messageservice.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping
    Message save(@RequestBody Message message) {
        return messageService.save(message);
    }
}
