package com.knowhow.poc.ds;

public enum SearchType {
     EGON("EGON"), OF("OF");

    private String value;

    SearchType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
