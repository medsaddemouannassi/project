package com.talan.userservice.model;

import com.talan.userservice.entities.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class Message {
    private Long id;
    private String content;
    private Long receiverId;
    private Long senderId;
}
