package com.academy.lesson01;

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        //Выводим сообщение на консоль
        System.out.println("Bye World!");

        //прочитаем с консоли

        // java.util.Scanner или alt+enter
        // связываем с консолью
        Scanner scanner = new Scanner(System.in);
        //введем имя
        System.out.println("Введите имя");
        String firstName = scanner.next();
        System.out.println("Введите фамилию");
        String lastName = scanner.next();
        System.out.println("Введите отчество");
        String surname = scanner.next();

        //Введем возраст
        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        System.out.println("Введите пол (м/ж)");
        String sex = scanner.next();

        System.out.println("Введите номер телефона");
        String number = scanner.next();

        //Out the result
        System.out.println(String.format("----Абонент----%n Имя: %s%n Фамилия: %s%n Отчество: %s%n " +
                "Возраст: %d%n Пол: %s%n Номер: %s%n", firstName, lastName, surname, age, sex, number));

    }
}

