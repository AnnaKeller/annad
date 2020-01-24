package com.academy.lesson08;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        Object[] array = {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};
        System.out.println(Arrays.toString(array));
        System.out.print("numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("words: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof String) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        Object[][] array2D = {{"Ivan", 34}, {99, "Kolya"}, {"Boris", 18}, {99, "Kolya"}, {"Peter", 15}, {"Helen", 45}, {"Kolya", 32}};
        System.out.println(Arrays.deepToString(array2D));


        for (int i = 0; i < array2D.length; i++) {
            if (array2D[i][0] instanceof Integer ) {
                System.out.print(array2D[i][0] + " ");
            }
            else {System.out.print(array2D[i][1] + " ");} //найти и вывести числа
        }

        System.out.println();
        for (int i = 0; i < array2D.length; i++) {
            if (array2D[i][0] instanceof String ) {
                System.out.print(array2D[i][0] + " ");
            }
            else {System.out.print(array2D[i][1] + " ");} //найти и вывести строки
        }

    }
}
