package com.academy.lesson03;

import java.util.Scanner;

public class Homework03Ex2 {
    public static void main(String[] args) {
        System.out.println("Слова, которые заканчиваются буквами 'ED'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение");
        String text = scanner.nextLine();
        String[] words = getArray(text);

        int counterOfMatch = 0;
        System.out.print("Слова, которые заканчиваются буквами 'ED' : ");
        counterOfMatch = findAndOutputWorlds(words, counterOfMatch);
        System.out.println();
        System.out.println("Количество слов : " + counterOfMatch);
    }

    private static int findAndOutputWorlds(String[] words, int counterOfMatch) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("ED")) {
                System.out.print(words[i] + " "); // выводим найденные слова
                counterOfMatch += 1; //находим кол-во слов
            }

        }
        return counterOfMatch;
    }

    private static String[] getArray(String text) {
        return text.split(" ");
    }
}
