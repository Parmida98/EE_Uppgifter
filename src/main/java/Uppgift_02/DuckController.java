package Uppgift_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

//Hanterar inkommande GET-förfrågningar och returnerar duck information

@RestController
public class DuckController {
    private final DuckService duckService;

    @Autowired
    public DuckController(@Qualifier("defaultDuckService")  DuckService duckService){
        this.duckService = duckService;
    }

    @GetMapping
    public Mono<ResponseEntity<Duck>> fetchRandom(){
        return duckService.fetchRandom()
                .map(ResponseEntity::ok)
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}
