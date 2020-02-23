package com.colamoon.app.api.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Slf4j
@Component
public class AuthHandler {


    public Mono<ServerResponse> signIn(ServerRequest request) {
        log.info("]-----] AuthHandler::token call  [-----[ ");

        return request.principal()
                .map(p -> p.getName())
                .flatMap(result -> ok().body(BodyInserters.fromValue(result)))
                .switchIfEmpty(notFound().build());

    }

    public Mono<ServerResponse> getAuthInfo(ServerRequest request) {
        log.info("]-----] AuthHandler::token call [-----[ ");

        return request.principal()
                .map(p -> p.getName())
                .flatMap(result -> ok().body(BodyInserters.fromValue(result)))
                .switchIfEmpty(status(401).build());

    }

}
