package com.academy.lesson07;

public class Test {
    public static void main(String[] args) {
        Ex01 inter = (n1) -> {
            return n1 >= 10 && n1 <= 20;
            //true, если число принадлежит к диапазону чисел 10-20
        };

        System.out.println("Ex01 " + inter.forLambda(21));

        Ex02 inter2 = (n2) -> {
            int sum = 1;
            for (int i = 1; i <= n2; i++) {
                sum *= i;
            }
            return sum;
            //лямбда-выражение для вычисления факториала целого числа
        };

        System.out.println("Ex02 " + inter2.factorial(3));

        Ex03 inter3 = (i) -> {
            i = i.toUpperCase();
            return i;
            //строку в верхний регистр с помощью лямбда-выражения

        };

        System.out.println("Ex03.1 " + inter3.toUpper("hello world"));

        Ex03 inter4 = String::toUpperCase; //строку в верхний регистр с помощью ссылки на метод
        System.out.println("Ex03.2 " + inter4.toUpper("world hello"));

        Ex04 inter5 = (i) -> {
            i = i.replaceAll(" ", "");
            return i;
            //удаляет все пробелы из заданной строки
        };

        System.out.println("Ex04 " + inter5.noSpace("Helen Abdel Leon abc array var jMeter Selenium Yaguar"));

    }

}
