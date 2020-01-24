package com.academy.lesson04;

public class SomeNumber {
    private int n;

    public SomeNumber() {
    }

    public SomeNumber(int n) {
        this.n = n;
    }

    public SomeNumber (SomeNumber sn) {
        this.n = sn.getN();
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

//    public boolean isPositive1() {
//        return n > 0;
//    }

    public boolean isPositive() {
        if (n <= 0) {
            return false;
        }
        return true;
    }
}
