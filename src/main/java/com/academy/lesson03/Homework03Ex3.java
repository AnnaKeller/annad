package com.academy.lesson03;

import java.util.Scanner;

public class Homework03Ex3 {
    public static void main(String[] args) {
        System.out.println("Строка, подстрока и кол-во вхождений");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        System.out.println("Введите подстроку");
        String substring = scanner.nextLine();
        System.out.println("Строка: " + string);
        System.out.println("Подстрока: " + substring);

        int indexOfSubstr = string.indexOf(substring);
        int counterOfEntrances = 0;
        while (indexOfSubstr != -1) {
            indexOfSubstr = string.indexOf(substring, indexOfSubstr + 1);
            counterOfEntrances++;
        }
        System.out.println("Количество вхождений: " + counterOfEntrances);

    }
}
