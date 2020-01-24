package com.academy.lesson09.Generic;

public class GenericDemo {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setValue1("Hello");
        pair.setValue2(123); //object type

        String str = (String) pair.getValue1();
        int n = (Integer) pair.getValue2();//необходимо приводить типы вручную

        System.out.println(str + " " + n);

        PairGen<String, Integer> pairGenInt = new PairGen<>();
        pairGenInt.setValue1("Congrats");
        pairGenInt.setValue2(18); //дженерики - тип указывается при создании объекта

        String str2 =pairGenInt.getValue1();
        int n2 = pairGenInt.getValue2();

        System.out.println(str2 + " " + n2);

        PairGen<String, String> pairGenString = new PairGen<>();
        pairGenString.setValue1("Congrats");
        pairGenString.setValue2("0.2"); //любые типы

        PairGenExt<String, Double> pairGenDouble = new PairGenExt<>();
        pairGenDouble.setValue1("Congrats");
        pairGenDouble.setValue2(0.2); //extends Number, cannot be string

        print(pairGenInt);
        print(pairGenString);

        printExtends(pairGenInt);
        //print2(pairGenString); // не работает метод, потому что в условии наследования типа Number

        PairGen<String, Number> pairGenNumb = new PairGen<>();
        PairGen<String, Object> pairGenObject = new PairGen<>();

        printSuper(pairGenNumb);
        printSuper(pairGenObject);

    }

    private static void print (PairGen<?, ?> pair){
        System.out.println(pair); //принимает любые значения
    }

    private static void printExtends(PairGen<?, ? extends Number> pair){
        System.out.println(pair); //принимает второе значение только тип-наследник Number (int, double, float)
    }

    private static void printSuper(PairGen<?, ? super Number> pair){
        System.out.println(pair); //принимает второе значение только тип-родитель Number (Object + Number)
    }
}
