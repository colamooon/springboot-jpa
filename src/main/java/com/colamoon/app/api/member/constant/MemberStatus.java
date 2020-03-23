package com.colamoon.app.api.member.constant;

public enum MemberStatus {

    ACTIVE("AV"),
    NOTACTIVE("NA"),
    LEAVE("LV");

    MemberStatus(final String codeValue) {
        this.codeValue = codeValue;
    }

    private String codeValue;

    public String getCode() {
        return codeValue;
    }



}
