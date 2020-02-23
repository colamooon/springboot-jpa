package com.colamoon.app.api.common.exception;

public enum ErrorMessageCode {

    SUCCESS(200000, "success"),
    ERROR(500000, "error"),

    AUTH_NOT_FOUND(500100, "auth.not.found"),
    ROLE_NOT_FOUND(500101, "role.not.found"),

    USERNAME_NOT_FOUND(500102, "username.not.found"),
    AUTHENTICATION_FAILED_EXCEPTION(500104, "authentication.failed.exception"),

    USERNAME_IS_REQUIRED(500200, "username.is.required"),
    PASSWORD_IS_REQUIRED(500201, "password.is.required"),
    CONFIRMPASSWORD_IS_REQUIRED(500202, "confirmpassword.is.required"),


    SAMPLE_NOT_FOUND(500900, "sample.not.found"),
    SAMPLE_IS_ALREADY_EXISTS(500901, "sample.is.already.exists"),
    SAMPLE_TITLE_IS_REQUIRED(500902, "sample.title.is.required"),


    DUMMY(900000, "Dummy");


    ErrorMessageCode(final int codeValue, final String messageCode) {
        this.codeValue = codeValue;
        this.responseValue = messageCode;
    }

    private int codeValue;
    private String defaultMessage;
    private String responseValue;

    public int getCode() {
        return codeValue;
    }


    public String getResponseValue() {
        return responseValue;
    }

}

