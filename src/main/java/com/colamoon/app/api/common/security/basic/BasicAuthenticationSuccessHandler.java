package com.colamoon.app.api.common.security.basic;

import com.colamoon.app.api.auth.Auth;
import com.colamoon.app.api.common.security.jwt.JWTTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.ServerAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * On success authentication a signed JWT object is serialized and added
 * in the authorization header as a bearer token
 */
@Slf4j
@Component
public class BasicAuthenticationSuccessHandler
        implements ServerAuthenticationSuccessHandler {

    /**
     * A successful authentication object us used to create a JWT object and
     * added in the authorization header of the current WebExchange
     *
     * @param webFilterExchange
     * @param authentication
     * @return
     */
    @Override
    public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
        ServerWebExchange exchange = webFilterExchange.getExchange();

//        log.debug("]-----] BasicAuthenticationSuccessHandler::onAuthenticationSuccess authentication [-----[ {}", authentication);
        exchange.getResponse()
                .getHeaders()
                .add(HttpHeaders.AUTHORIZATION, getHttpAuthHeaderValue(authentication));
        exchange.getResponse()
                .getHeaders()
                .add(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, HttpHeaders.AUTHORIZATION);
        return webFilterExchange.getChain().filter(exchange);
    }

    private static String getHttpAuthHeaderValue(Authentication authentication) {
        return String.join(" ", "Bearer", tokenFromAuthentication(authentication));
    }

    private static String tokenFromAuthentication(Authentication authentication) {
        Auth auth = (Auth) authentication.getPrincipal();
        return JWTTokenService.generateToken(
                authentication.getName(),
                authentication.getAuthorities(),
                auth

        );
    }
}
