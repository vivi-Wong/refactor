package com.refactor.practice.model.enums;

public enum MoviePriceCode {
    CHILDRENS(2),
    REGULAR(0),
    NEW_REALEASE(1);

    public int seq;

    MoviePriceCode(int seq) {
        this.seq = seq;
    }
}
