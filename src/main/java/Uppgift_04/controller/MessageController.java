package Uppgift_04.controller;

import Uppgift_04.model.Message;
import Uppgift_04.service.MessageService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<ResponseEntity<Message>> createMessage(@Valid @RequestBody Message message){

        return service.createMessage(message.message())
                .map(saved -> ResponseEntity.ok().body(saved));
    }
}
