package com.talan.userservice.dto;

import com.talan.userservice.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserResponseDTO {
    Long id;
    String firstName;
    String lastName;
    Integer age;
    Gender gender;
    String email;
}
