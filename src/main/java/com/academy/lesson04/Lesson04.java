package com.academy.lesson04;

import java.util.Arrays;

public class Lesson04 {
    public static void main(String[] args) {
        System.out.println("Разделить на массив и первую литеру в апперкейс");
        String raw = "petrov,Ivanov ,KiRill, Helen ";
        System.out.println(raw);
        String trimmed = raw.replaceAll(" ", "");
        String lower = trimmed .toLowerCase();
        String [] array = lower.split(",");

        for (int i = 0; i<array.length; i++){
            String temp = array[i].substring(1); // находим все, кроме первой литеры
            char first = array[i].charAt(0); // находим первую литеру
            first = Character.toUpperCase(first); //переводим ее в аппрекейс
            array [i] = first + temp; //склеиваем и присваиваем зхначение
        }
//        String[] preparedNames3 = rawData.split(",");
//        // => [Petrov, Ivanov ,Kirill, Helen];
//        for(int i=0; i < preparedNames3.length; i++) {
//            // 1) обрежем пробелы
//            preparedNames3[i] = preparedNames3[i].trim();
//            // 2) все символы в нижий регистр
//            char[] letters = preparedNames3[i].toCharArray();
//            letters[0] = Character.toUpperCase(letters[0]);
//            for (int j = 1; j < letters.length; j++) {
//                letters[j] = Character.toLowerCase(letters[j]);
//            }
//            preparedNames3[i] = new String(letters);
//        } способ - разбить слово на массив чарсов
//
        System.out.println(Arrays.toString(array));
    }
}
