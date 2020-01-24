package com.academy.lesson02;

import java.util.Scanner;

public class Homework02Ex1 {
    public static void main(String[] args) {
        System.out.println("Exercise#1 - Вывести минимальное максимальное и среднee значения");
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            array[i] = scanner.nextInt(); //ввод массива с консоли
        }

        int max = array[0];
        int min = array[0];
        double sum = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] > max)
                max = array[x]; //нахождение максимального значения
            if (array[x] < max)
                min = array[x]; //нахождение минимального значения
            sum += array[x]; // sum = sum + array[x];

        }

        double avg = sum / array.length;

        System.out.println("Минимальное значение = " + max);
        System.out.println("Максимальное значение = " + min);
        System.out.println("Среднее значение = " + avg);


//        Arrays.sort(array);
//        System.out.println("Минимальное значение = " + array[0]);
//        System.out.println("Максимальное значение = " + array[array.length-1]); - easy way


    }
}
