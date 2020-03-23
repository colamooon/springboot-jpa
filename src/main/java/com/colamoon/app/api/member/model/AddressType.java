package com.colamoon.app.api.member.model;

public enum AddressType {
    J(0) {
        @Override
        public String shout() {
            return "JIBUN";
        }
    },
    R(1) {
        @Override
        public String shout() {
            return "ROAD";
        }
    };
    private AddressType(final int codeValue) {
        this.codeValue = codeValue;
    }

    private int codeValue;

    public int getCode() {
        return codeValue;
    }

    public abstract String shout();
}
