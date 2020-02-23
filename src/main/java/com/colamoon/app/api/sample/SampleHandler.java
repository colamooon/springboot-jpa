package com.colamoon.app.api.sample;

import com.colamoon.app.api.sample.view.SampleView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class SampleHandler {

    private final SampleService sampleService;
    private final SampleValidator sampleValidator;

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public Mono<ServerResponse> findAll(ServerRequest request) {
        log.info("]-----] SampleHandler::findAll call [-----[ ");
        Integer page = request.queryParam("page").isPresent() ? Integer.parseInt(request.queryParam("page").get()) - 1 : 0;
        Integer size = request.queryParam("pageSize").isPresent() ? Integer.parseInt(request.queryParam("pageSize").get()) : 20;
        return request.principal()
                .flatMap(p -> Mono.just(Long.parseLong(p.getName())))
                .flatMap(memberId ->
                        Mono.just(sampleService.findAll(page, size, memberId))
                )
                .flatMap(sampleViews -> ok().body(fromValue(sampleViews)))
                .switchIfEmpty(notFound().build());

    }

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public Mono<ServerResponse> findById(ServerRequest request) {
        log.info("]-----] SampleHandler::findById call [-----[ ");
        Long id = Long.parseLong(request.pathVariable("id"));
        return request.principal()
                .flatMap(p -> Mono.just(Long.parseLong(p.getName())))
                .flatMap(memberId -> Mono.just(sampleService.findById(id, memberId)))
                .flatMap(sampleView -> ok().body(fromValue(sampleView)))
                .switchIfEmpty(notFound().build());

    }

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public Mono<ServerResponse> post(ServerRequest request) {
        log.info("]-----] SampleHandler::post call [-----[ ");
        Mono<SampleView> sampleViewMono = request.bodyToMono(SampleView.class).doOnNext(sampleValidator::postValidate);
        ;
        return request.principal()
                .flatMap(p -> Mono.just(Long.parseLong(p.getName())))
                .flatMap(memberId ->
                        sampleViewMono.flatMap(sampleView -> Mono.just(sampleService.post(sampleView, memberId)))
                )
                .flatMap(jobInfoViews -> ok().body(fromValue(jobInfoViews)))
                .switchIfEmpty(badRequest().build());

    }


    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public Mono<ServerResponse> put(ServerRequest request) {
        log.info("]-----] SampleHandler::delete call [-----[ ");
        Mono<SampleView> sampleViewMono = request.bodyToMono(SampleView.class).doOnNext(sampleValidator::postValidate);
        Long id = Long.parseLong(request.pathVariable("id"));
        return request.principal()
                .flatMap(p -> Mono.just(Long.parseLong(p.getName())))
                .flatMap(memberId ->
                        sampleViewMono.flatMap(sampleView -> Mono.just(sampleService.put(id, sampleView, memberId)))
                )
                .flatMap(result -> ok().body(fromValue(result)))
                .switchIfEmpty(notFound().build());

    }

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public Mono<ServerResponse> delete(ServerRequest request) {
        log.info("]-----] SampleHandler::delete call [-----[ ");
        Long id = Long.parseLong(request.pathVariable("id"));
        return request.principal()
                .flatMap(p -> Mono.just(Long.parseLong(p.getName())))
                .flatMap(memberId ->
                        Mono.just(sampleService.delete(id, memberId))
                )
                .flatMap(result -> ok().body(fromValue(result)))
                .switchIfEmpty(notFound().build());

    }
}
