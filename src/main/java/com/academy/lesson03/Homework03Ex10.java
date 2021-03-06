package com.academy.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03Ex10 {
    public static void main(String[] args) {
        System.out.println("Массив слов, которые содержат символ @");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение");
        String input = scanner.nextLine();
        System.out.println("Входная строка: " + input); //выводим считанную строку
        String[] words = getArray(input);
        int dwordsCount = 0;
        dwordsCount = getDwordsCount(words, dwordsCount);

        String[] dwords = new String[dwordsCount];
        int dwordsIterator = 0;
        fillArray(words, dwords, dwordsIterator);

        System.out.println("Слова, которые содержат символ @ : " + Arrays.toString(dwords));
    }

    private static void fillArray(String[] words, String[] dwords, int dwordsIterator) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("@")) {
                dwords[dwordsIterator] = words[i];
                dwordsIterator += 1; // заполняем массив найденными словами
            }
        }
    }

    private static int getDwordsCount(String[] words, int dwordsCount) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("@")) {
                dwordsCount += 1; // находим количество слов
            }
        }
        return dwordsCount;
    }

    private static String[] getArray(String input) {
        return input.split(" ");
    }
}
