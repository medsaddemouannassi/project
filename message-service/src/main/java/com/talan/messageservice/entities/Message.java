package com.talan.messageservice.entities;

import com.talan.messageservice.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Long senderId;
    private Long receiverId;
//    @Transient
//    private User sender;
//    @Transient
//    private User receiver;
}
