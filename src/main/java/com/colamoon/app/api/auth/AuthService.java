package com.colamoon.app.api.auth;

import com.colamoon.app.api.auth.exception.AuthNotFoundException;
import com.colamoon.app.api.common.model.ActiveType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AuthService {


    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public Mono<UserDetails> findByUsername(String username) {
        Auth auth = authRepository.findByUsernameAndActive(StringUtils.deleteWhitespace(username), ActiveType.ACTIVE);
        log.debug("]-----] AuthService::findByUsername [-----[ {}", auth);
        if (auth != null) {
            return Mono.just((UserDetails) auth);
        } else {
            return Mono.error(new AuthNotFoundException());

        }
    }

}
