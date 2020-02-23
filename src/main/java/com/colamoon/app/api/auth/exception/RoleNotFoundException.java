package com.colamoon.app.api.auth.exception;

import com.colamoon.app.api.common.exception.ErrorMessageCode;
import com.colamoon.app.api.common.exception.ColaException;
import org.springframework.http.HttpStatus;

public class RoleNotFoundException extends ColaException {


    public RoleNotFoundException() {
        super("RoleNotFoundException", ErrorMessageCode.ROLE_NOT_FOUND);
    }

    public RoleNotFoundException(String message) {
        super(message);
    }

    public RoleNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public RoleNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public RoleNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public RoleNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
