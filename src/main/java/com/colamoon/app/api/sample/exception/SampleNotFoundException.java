package com.colamoon.app.api.sample.exception;

import com.colamoon.app.api.common.exception.ColaException;
import com.colamoon.app.api.common.exception.ErrorMessageCode;
import org.springframework.http.HttpStatus;

public class SampleNotFoundException extends ColaException {


    public SampleNotFoundException() {
        super("SampleNotFoundException", ErrorMessageCode.SAMPLE_NOT_FOUND);
    }

    public SampleNotFoundException(String message) {
        super(message);
    }

    public SampleNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public SampleNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public SampleNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public SampleNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
