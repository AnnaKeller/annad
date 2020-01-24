package com.academy.lesson02;

import java.util.Scanner;


public class Homework02Ex7 {
    public static void main(String[] args) {
        System.out.println("Exercise#7 - Проверить, если не заданы ли аргументы, вывести результат деления и остаток");
        int q;
        int w;
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение q");
            q = scanner.nextInt();
            System.out.println("Введите значение w");
            w = scanner.nextInt();

        } else {
            q = Integer.parseInt(args[0]);
            w = Integer.parseInt(args[1]);
        }

        int div = q / w;
        int left = q % w;
        System.out.println("q = " + q + ";");
        System.out.println("w = " + w + ";");
        System.out.println("q/w = " + div + ";");
        System.out.println("остаток = " + left + ";");

    }//main
}//class

