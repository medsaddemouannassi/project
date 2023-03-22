package com.talan.userservice.controllers;

import com.talan.userservice.dto.UserRequestDTO;
import com.talan.userservice.dto.UserResponseDTO;
import com.talan.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping
    UserResponseDTO register(@RequestBody UserRequestDTO user) {
        return userService.register(user);
    }

    @GetMapping("{userId}")
    UserResponseDTO getUserById(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }

    @DeleteMapping("{userId}")
    void deleteUserById(@PathVariable Long userId) {
        userService.deleteUserById(userId);
    }
}
