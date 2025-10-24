package Uppgift_04.service;

import Uppgift_04.model.Message;
import Uppgift_04.repo.MessageRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;


import java.time.LocalDateTime;

@Service
public class MessageService {

   private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Mono<Message> createMessage(String messageText) {
      logger.info("Creating new message: {}", messageText);

        Message newMessage = new Message(
                null,
                messageText,
                LocalDateTime.now(),
                true
        );

        return repository.save(newMessage); //vi returnerar ett Mono<Message>

    }

}
