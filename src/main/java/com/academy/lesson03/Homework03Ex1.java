package com.academy.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03Ex1 {
    public static void main(String[] args) {
        System.out.println("Слова, которые начинаются на букву 'd'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message");
        String input = scanner.nextLine();
        System.out.println("Вы ввели: " + input); //выводим считанную строку
        String[] words = getArray(input);
        int dwordsCount = 0;
        dwordsCount = getDwordsCount(words, dwordsCount);

        String[] dwords = new String[dwordsCount];
        int dwordsIterator = 0;
        fillArray(words, dwords, dwordsIterator);

        System.out.println("Слова, которые начинаются на букву 'd' : " + Arrays.toString(dwords));
        System.out.println("Количество слов, начинающихся на d = " + dwordsCount);


    }

    private static void fillArray(String[] words, String[] dwords, int dwordsIterator) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("d")) {
                dwords[dwordsIterator] = words[i];
                dwordsIterator += 1; // заполняем массив найденными словами
            }
        }
    }

    private static int getDwordsCount(String[] words, int dwordsCount) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("d")) {
                dwordsCount += 1; // находим количество слов
            }
        }
        return dwordsCount;
    }

    private static String[] getArray(String input) {
        return input.split(" ");
    }
}
