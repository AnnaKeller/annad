package com.academy.lesson03;

import java.util.Scanner;

public class Homework03Ex4 {
    public static void main(String[] args) {
        System.out.println("Удалить из строки все цифры");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение");
        String text = scanner.nextLine();
        String letters  = getLetters(text, "[0-9]");
        String numbers = getLetters(text, "[^0-9]");
        System.out.println("Исходная строка : " + text);
        System.out.println("Строка без чисел : " + letters);
        System.out.println("Удаленные числа : " + numbers);

    }

    private static String getLetters(String text, String s) {
        return text.replaceAll(s, "");
    }
}
