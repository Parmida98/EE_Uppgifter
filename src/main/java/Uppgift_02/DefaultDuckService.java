package Uppgift_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

//Utför HTTP-anrop till API för att hämta data om ankor

@Service
public class DefaultDuckService implements DuckService {

    private final WebClient duckWebClient;

    @Autowired
    public DefaultDuckService(WebClient duckWebClient){
        this.duckWebClient = duckWebClient;
    }

    @Override
    public Mono<Duck> fetchRandom() {
        return duckWebClient.get()
                .uri("/random")
                .retrieve()
                .onStatus(
                        HttpStatusCode::is4xxClientError,
                        clientResponse -> Mono.error(new Exception("Not found"))
                )
                .onStatus(
                        httpStatus -> httpStatus.is5xxServerError(),
                        clientResponse -> Mono.error(new Exception("Not found"))
                )
                .bodyToMono(Duck.class);
    }
}
