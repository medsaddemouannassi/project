package com.talan.userservice.services.impl;

import com.talan.userservice.dto.UserRequestDTO;
import com.talan.userservice.dto.UserResponseDTO;
import com.talan.userservice.entities.User;
import com.talan.userservice.helpers.ModelMapperConverter;
import com.talan.userservice.repositories.UserRepo;
import com.talan.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;


    @Override
    public UserResponseDTO signup(UserRequestDTO userDTO) {
        return ModelMapperConverter.map(userRepo.save(ModelMapperConverter.map(userDTO, User.class)), UserResponseDTO.class);
    }

    @Override
    public UserResponseDTO findUserById(Long id) {
        return ModelMapperConverter.map(userRepo.findById(id).isPresent() ? userRepo.findById(id).get(): null, UserResponseDTO.class);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
}
