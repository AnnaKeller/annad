package com.academy.lesson01;

import java.util.Scanner;

public class Ex10Lesson01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the symbol");
        String a = input.next();
        String b = a;
        for (int i = 1; i < 6; i++) {
            System.out.println(b += a);

        }

    }
}