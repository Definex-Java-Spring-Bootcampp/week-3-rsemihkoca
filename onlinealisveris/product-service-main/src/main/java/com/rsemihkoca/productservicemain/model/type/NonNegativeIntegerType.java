package com.rsemihkoca.productservicemain.model.type;

public class NonNegativeIntegerType {
    private int value;

    public NonNegativeIntegerType(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        this.value = value;
    }

    public void add (int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        if (Integer.MAX_VALUE - this.value < value) {
            throw new IllegalArgumentException("Value must be less than or equal to " + (Integer.MAX_VALUE - this.value) + ".");
        }
        this.value += value;
    }

    public void subtract (int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        if (this.value < value) {
            throw new IllegalArgumentException("Value must be greater than the value to be subtracted.");
        }
        this.value -= value;
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
