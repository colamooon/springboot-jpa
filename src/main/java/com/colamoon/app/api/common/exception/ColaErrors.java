package com.colamoon.app.api.common.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class ColaErrors implements Serializable {
    private int code;
    private String message;
    private List<ColaError> errors = new ArrayList<>();

    @JsonCreator
    public ColaErrors(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void add(String path, int code, String message) {
        this.errors.add(new ColaError(path, code, message));
    }
}

