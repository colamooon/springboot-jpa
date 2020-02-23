package com.colamoon.app.api.auth.exception;

import com.colamoon.app.api.common.exception.ErrorMessageCode;
import com.colamoon.app.api.common.exception.ColaException;
import org.springframework.http.HttpStatus;

public class AuthNotFoundException extends ColaException {


    public AuthNotFoundException() {
        super("AuthNotFoundException", ErrorMessageCode.AUTH_NOT_FOUND);
    }

    public AuthNotFoundException(String message) {
        super(message);
    }

    public AuthNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public AuthNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public AuthNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public AuthNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
