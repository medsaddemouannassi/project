package com.talan.messageservice.services.impl;

import com.talan.messageservice.entities.Message;
import com.talan.messageservice.repositories.MessageRepo;
import com.talan.messageservice.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepo messageRepo;

    @Override
    public Message findMessageById(Long id) {
        return null;
    }

    @Override
    public Message findMessageByUserId(Long id) {
        return null;
    }

    @Override
    public List<Message> findMessages() {
        return null;
    }

    @Override
    public Message save(Message message) {
        return messageRepo.save(message);
    }
}
