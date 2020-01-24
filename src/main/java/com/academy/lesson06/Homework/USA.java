package com.academy.lesson06.Homework;

public class USA extends DateFormats {

    public USA (DateFormats sample) {
        super(sample.getDay(), sample.getMonth(), sample.getYear());
    }

    @Override
    public void formatDate() {
        System.out.println(String.format("%d-%d-%d", getMonth(), getDay(), getYear()));
    }
}
