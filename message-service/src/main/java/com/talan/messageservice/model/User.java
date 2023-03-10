package com.talan.messageservice.model;

import com.talan.messageservice.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private String email;
    private String password;
}
