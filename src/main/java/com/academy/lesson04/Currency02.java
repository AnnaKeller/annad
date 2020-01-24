package com.academy.lesson04;

public class Currency02 {
    public static void main(String[] args) {
        Currency obj = new Currency();
        obj.setName("uah");
        obj.setValue(56.50976);
        obj.print();

        Currency obj2 = new Currency(43,"usd");

        Currency obj3 = new Currency(obj2); //используя конструктор копирования


        System.out.println();
        System.out.println();
        obj.isEqual(obj2);

    }
}
