package com.academy.lesson03;

import java.util.Arrays;

public class lesson03 {
    public static void main(String[] args) {
        String[] all = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};

        //создаем массивы
        String[] group1 = new String[4];
        String[] group2 = new String[4];

        //копируем значение первого массива
        group1 = Arrays.copyOf(all,4);
        group2 = Arrays.copyOfRange(all, 4, 8);

        //сортируем массивы
        sortarrays(group1, group2);

        //выводим на консоль
        printarrays(all, group1, group2);

        //число в строку sout n + " "


    }
    public static void printarrays (String[] all, String[] group1, String[] group2) {
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
        System.out.println("Group1 and Group2 are equal - " + Arrays.equals(group1, group2));
    }
    public static void sortarrays (String[] group1, String[] group2) {
        Arrays.sort(group1);
        Arrays.sort(group2);
    }

}
