package com.talan.userservice.services;

import com.talan.userservice.dto.UserRequestDTO;
import com.talan.userservice.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO signup(UserRequestDTO userDTO);
    UserResponseDTO findUserById(Long id);
    void deleteUserById(Long id);
}
