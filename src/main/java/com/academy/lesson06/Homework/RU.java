package com.academy.lesson06.Homework;

public class RU extends DateFormats{

    public RU(int day, int month, int year) {
        super(day, month, year);

    }

    public RU (DateFormats sample) {
        super(sample.getDay(), sample.getMonth(), sample.getYear());
    }

    @Override
    public void formatDate() {
        System.out.println(String.format("%d.%d.%d", getDay(), getMonth(), getYear()));
    }

}
