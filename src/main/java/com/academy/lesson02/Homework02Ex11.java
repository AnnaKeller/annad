package com.academy.lesson02;

public class Homework02Ex11 {
    public static void main(String[] args) {
        System.out.println("Exercise#11 - Вывести массив с помощью цикла for");
        int[] array = {3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        //System.out.println(Arrays.toString(intArray)); //easy way
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Exercise#11 - Вывести массив с помощью цикла while");
        System.out.print("[");
        int[] array2 = {3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        int i2 = 0;
        while (i2 < array2.length-1) {
            System.out.print(array2[i2] + ", ");
            i2++;
        }
        int j = array2.length-1;
        System.out.print(array2[j]);
        System.out.println("]");
    }
}
