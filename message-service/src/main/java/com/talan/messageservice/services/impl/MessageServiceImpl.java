package com.talan.messageservice.services.impl;

import com.talan.messageservice.entities.Message;
import com.talan.messageservice.repositories.MessageRepo;
import com.talan.messageservice.services.MessageService;
import com.talan.messageservice.services.UserServiceRestClient;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional
public class MessageServiceImpl implements MessageService {

    private final MessageRepo messageRepo;
    private final UserServiceRestClient userServiceRestClient;

    @Override
    public Message findMessageById(Long id) {
        return null;
    }

    @Override
    public Message findMessageByUserId(Long id) {
        return null;
    }

    @Override
    public List<Message> findAllBySenderIdAndRecipientId(Long senderId, Long recipientId) {
        return messageRepo.findAllBySenderIdAndRecipientId(senderId, recipientId);
    }

    @Override
    public List<Message> findMessages() {
        return null;
    }

    @Override
    public Message sendMessage(Message message) {
        try {
            userServiceRestClient.findUserById(message.getSenderId());
            userServiceRestClient.findUserById(message.getRecipientId());
        } catch (Exception e) {
            throw new NoSuchElementException("User does not exist");
        }
        return messageRepo.save(message);
    }

    @Override
    public void deleteMessageById(Long messageId) {
        messageRepo.deleteById(messageId);
    }
}
