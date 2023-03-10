package com.talan.userservice.controllers;

import com.talan.userservice.dto.UserResponseDTO;
import com.talan.userservice.model.Message;
import com.talan.userservice.services.MessageServiceRestClient;
import com.talan.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final MessageServiceRestClient messageServiceRestClient;
    private final UserService userService;

    @PostMapping
    Message sendMessage(@RequestBody Message message) {
        final UserResponseDTO sender = userService.findUserById(message.getSenderId());
        final UserResponseDTO receiver = userService.findUserById(message.getReceiverId());
        if (sender == null || receiver == null) throw new RuntimeException("User not found");
        return messageServiceRestClient.save(message);
    }
}
