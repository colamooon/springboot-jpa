package com.colamoon.app.api.common.security.jwt;

import com.colamoon.app.api.auth.Auth;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * A service to create JWT objects, this one is used when an exchange
 * provides basic authentication.
 * If authentication is successful, a token is added in the response
 */
@Slf4j
@Component
public class JWTTokenService {

    private static int expiredMinute;

    public JWTTokenService(@Value("${jwt.expired.minute}") int expiredMinute) {
        this.expiredMinute = expiredMinute;
    }

    /**
     * Create and sign a JWT object using information from the current
     * authenticated principal
     *
     * @param subject     Name of current principal
     * @param credentials Credentials of current principal
     * @param authorities A collection of granted authorities for this principal
     * @return String representing a valid token
     */
    public static String generateToken(String subject, Collection<? extends GrantedAuthority> authorities, Auth auth) {
        SignedJWT signedJWT;
        JWTClaimsSet claimsSet;


//        log.debug("]-----] auth [-----[ {}", auth);
        claimsSet = new JWTClaimsSet.Builder()
                .subject(subject)
                .issuer("colamoon.com")
                .expirationTime(new Date(getExpiration()))
//                .claim("roles", "ADMIN")
                .claim("roles", authorities
                        .stream()
                        .map(GrantedAuthority.class::cast)
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.joining(",")))
                .claim("userId", auth.getId())
                .build();

        signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);

        try {
            signedJWT.sign(new JWTCustomSigner().getSigner());
        } catch (JOSEException e) {
            e.printStackTrace();
        }

        return signedJWT.serialize();
    }

    /**
     * Returns a millisecond time representation 24hrs from now
     * to be used as the time the currently token will be valid
     *
     * @return Time representation 24 from now
     */
    private static long getExpiration() {

        return new Date().toInstant()
                .plus(Duration.ofMinutes(expiredMinute))
                .toEpochMilli();
    }
}
