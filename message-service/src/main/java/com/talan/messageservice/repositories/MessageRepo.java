package com.talan.messageservice.repositories;

import com.talan.messageservice.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
    Message findMessageBySenderId(Long id);
    Message findMessageByReceiverId(Long id);
}
