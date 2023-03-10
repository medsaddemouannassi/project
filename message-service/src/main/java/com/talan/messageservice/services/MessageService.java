package com.talan.messageservice.services;

import com.talan.messageservice.entities.Message;

import java.util.List;

public interface MessageService {
    Message findMessageById(Long id);
    Message findMessageByUserId(Long id);
    List<Message> findMessages();
    Message save(Message message);
}
