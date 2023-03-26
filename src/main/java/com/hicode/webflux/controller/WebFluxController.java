package com.hicode.webflux.controller;

import com.hicode.webflux.model.Tutorial;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("v1/webflux")
@AllArgsConstructor
public class WebFluxController {

    private WebClient webClient;

    @GetMapping("/tutorial")
    public Flux<Tutorial> getAll(){
        return webClient.get().uri("/tutorials")
                .retrieve()
                .bodyToFlux(Tutorial.class);
    }

}
