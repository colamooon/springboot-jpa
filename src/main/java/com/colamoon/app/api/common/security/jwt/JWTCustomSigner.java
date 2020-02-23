package com.colamoon.app.api.common.security.jwt;

import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.MACSigner;
import lombok.extern.slf4j.Slf4j;

/**
 * Creates a JWTSigner using a simple secret string
 */
@Slf4j
public class JWTCustomSigner {
    private JWSSigner signer;

    public JWTCustomSigner() {
        try {
            this.signer = new MACSigner(JWTSecrets.DEFAULT_SECRET);
        } catch (KeyLengthException e) {
            this.signer = null;
        }
    }

    public JWSSigner getSigner() {
        return this.signer;
    }
}
