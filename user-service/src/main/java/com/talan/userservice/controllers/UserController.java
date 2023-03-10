package com.talan.userservice.controllers;

import com.talan.userservice.model.Message;
import com.talan.userservice.services.MessageServiceRestClient;
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

    @PostMapping
    Message sendMessage(@RequestBody Message message) {
        log.info(String.valueOf(message));
        return messageServiceRestClient.save(message);
    }
}
