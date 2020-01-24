package com.academy.lesson09.Generic;

public class PairPrinterDemo {
    public static void main(String[] args) {
        PairPrinter<Integer, String> pairPrinter = new PairPrinterImpl<>(); // типы указываются в объекте
        pairPrinter.print(1,"one");

        PairPrinterImpl2 pairPrinterImpl2 = new PairPrinterImpl2();
        pairPrinterImpl2.print("two", 2); //типы уже указаны в классе-наследнике интерфейса с дженериками

    }
}
