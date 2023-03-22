package com.talan.messageservice.repositories;

import com.talan.messageservice.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {
    Message findMessageBySenderId(Long id);
    Message findMessageByRecipientId(Long id);
    List<Message> findAllBySenderIdAndRecipientId(Long senderId, Long recipientId);
}
