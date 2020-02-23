package com.colamoon.app.api.common.model;

public enum ActiveType {
    DELETE(0) {
        @Override
        public String shout() {
            return "DELETE";
        }

    },
    ACTIVE(1) {
        @Override
        public String shout() {
            return "ACTIVE";
        }
    };

    private ActiveType(final int codeValue) {
        this.codeValue = codeValue;
    }

    private int codeValue;

    public int getCode() {
        return codeValue;
    }

    public abstract String shout();

}
