package com.talan.messageservice.services;

import com.talan.messageservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE")
public interface UserServiceRestClient {
    @GetMapping("/user/{id}")
    User findUserById(@PathVariable Long id);
}
