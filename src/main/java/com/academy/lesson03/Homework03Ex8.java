package com.academy.lesson03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Homework03Ex8 {
    public static void main(String[] args) {
        int arraySize = getArraySize();
        Integer[] array = new Integer[arraySize];

        fillArray(arraySize, array);
        System.out.println(Arrays.toString(array));
        placeChange(array);
        System.out.println(Arrays.toString(array));// меняем местами элементы
        reverseWay(array);
        System.out.println(Arrays.toString(array));// меняем местами элементы
    }

    private static void reverseWay(Integer[] array) {
        Comparator<Integer> comp = Collections.reverseOrder();
        Arrays.sort(array, comp); //  сортируем в обратном порядке
    }

    private static void placeChange(Integer[] array) {
        int first = array[0];
        array[0] = array[1];
        array[1] = first;
    }

    private static int getArraySize() {
        System.out.println("Сортировка массива случайных чисел");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        return scanner.nextInt();
    }

    private static void fillArray(int arraySize, Integer[] array) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10);

        }
    }
}
