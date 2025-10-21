package Uppgift_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

//Skapar och konfigurerar en WebClient för HTTP-anrop

@Configuration
public class DuckWebClientConfig {

    @Bean
    public WebClient duckWebClient (WebClient.Builder builder){
        return builder
                .baseUrl("https://random-d.uk/api/v2")
                .build();
    }
}
