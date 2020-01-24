package com.academy.lesson05.Homework05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int timeFormat12 = 13;

        for(int i = 1;  i < hour;  i++) {
            timeFormat12 += 1;
        }

        System.out.println(timeFormat12);
    }
}
