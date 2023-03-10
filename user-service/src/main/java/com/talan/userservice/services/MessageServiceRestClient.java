package com.talan.userservice.services;

import com.talan.userservice.model.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@FeignClient(name = "MESSAGE-SERVICE")
public interface MessageServiceRestClient {
    @GetMapping("{userId}")
    List<Message> findMessagesByUserId(@PathVariable Long userId);
    @PostMapping("/api/v1/messages")
    Message save(@RequestBody Message message);
}
