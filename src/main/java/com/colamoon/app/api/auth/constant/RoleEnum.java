package com.colamoon.app.api.auth.constant;

public enum RoleEnum {

    GUEST("ROLE_GUEST") {
        @Override
        public String shout() {
            return "ROLE_GUEST";
        }
    },
    USER("ROLE_USER") {
        @Override
        public String shout() {
            return "ROLE_USER";
        }
    };

    private String codeValue;

    RoleEnum(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getCode() {
        return this.codeValue;
    }

    public abstract String shout();
}
