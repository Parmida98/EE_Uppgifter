package Uppgift_02;

import reactor.core.publisher.Mono;

public interface DuckService {
    Mono<Duck> fetchRandom();
}
