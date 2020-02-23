package com.colamoon.app.api.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class SampleRouter {

    @Bean
    public RouterFunction<ServerResponse> sampleRouterFunction(SampleHandler handler) {

        return RouterFunctions
                .nest(path("/api/sample"),
                        route(GET("").and(accept(APPLICATION_JSON)), handler::findAll)
                                .andRoute(GET("/{id}").and(accept(APPLICATION_JSON)), handler::findById)
                                .andRoute(POST("").and(accept(APPLICATION_JSON)).and(contentType(APPLICATION_JSON)), handler::post)
                                .andRoute(POST("/{id}").and(accept(APPLICATION_JSON)).and(contentType(APPLICATION_JSON)), handler::put)
                                .andRoute(DELETE("/{id}").and(accept(APPLICATION_JSON)).and(contentType(APPLICATION_JSON)), handler::delete)

                );
    }
}
