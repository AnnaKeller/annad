package com.academy.lesson03;

public class StringExercises {
    public static void main(String[] args) {
        String str1 = "abcd";
        char[] letters = str1.toCharArray(); //превращаем стринг в массив чаров
        char[] revLetters = new char[str1.length()]; //дополнительный массив для реверса
        int n = letters.length - 1;
        for (int i = 0; i < letters.length; i++) {
            revLetters[i] = letters[n];
            n--;
        }

        String string = new String(revLetters); //конвертируем массив чаров в стрингу
        System.out.println(revLetters);

        String longStr = "Hello world world";
        System.out.println(longStr.substring(0, 5) + "...");


    }
}
