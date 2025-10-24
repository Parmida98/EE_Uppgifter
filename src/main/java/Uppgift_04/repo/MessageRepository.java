package Uppgift_04.repo;

import Uppgift_04.model.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, Long> { //används i WebFlux-projekt för reaktiva CRUD-operationer.
}
