package com.colamoon.app.api.sample.constant;

public enum SampleStatus {
    INIT(0) {
        @Override
        public String shout() {
            return "NOTYET";
        }

    },
    DOING(1) {
        @Override
        public String shout() {
            return "DOING";
        }
    },
    DONE(2) {
        @Override
        public String shout() {
            return "DONE";
        }
    };

    private SampleStatus(final int codeValue) {
        this.codeValue = codeValue;
    }

    private int codeValue;

    public int getCode() {
        return codeValue;
    }

    public abstract String shout();

}
