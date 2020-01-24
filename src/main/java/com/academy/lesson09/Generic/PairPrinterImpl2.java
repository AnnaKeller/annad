package com.academy.lesson09.Generic;

public class PairPrinterImpl2 implements PairPrinter<String, Integer> {


    @Override
    public void print(String value1, Integer value2) {
        System.out.println("V1 = " + value1 + " V2 = " + value2);

    }
}
