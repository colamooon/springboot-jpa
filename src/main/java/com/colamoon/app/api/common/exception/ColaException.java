package com.colamoon.app.api.common.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ColaException extends RuntimeException {

    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    private ErrorMessageCode errorMessagerCode = ErrorMessageCode.ERROR;
    private List<ColaError> errors;


    public ColaException(String message) {
        super(message);
    }

    public ColaException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public ColaException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorMessagerCode = errorMessagerCode;
    }

    public ColaException(String message, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.errorMessagerCode = errorMessagerCode;
    }

    public ColaException(ErrorMessageCode errorMessagerCode) {
        this.errorMessagerCode = errorMessagerCode;
    }


    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public ErrorMessageCode getErrorMessagerCode() {
        return this.errorMessagerCode;
    }

    public List<ColaError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<ColaError> errors) {
        this.errors = errors;
    }
}
