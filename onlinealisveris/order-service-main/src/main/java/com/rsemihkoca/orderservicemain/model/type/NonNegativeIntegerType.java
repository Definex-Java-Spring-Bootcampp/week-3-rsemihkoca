package com.rsemihkoca.orderservicemain.model.type;

public class NonNegativeIntegerType {
    private int value;

    public NonNegativeIntegerType(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        this.value = value;
    }

}
