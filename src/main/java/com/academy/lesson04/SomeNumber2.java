package com.academy.lesson04;

public class SomeNumber2 {
    public static void main(String[] args) {
//        SomeNumber sn = new SomeNumber();
//        sn.setN(0);
//        System.out.println(sn.getN());
//        System.out.println(sn.isPositive());

        System.out.println("Конструктор с n");
        int[] testData = new int[]{-10, -1, 0, 1, 15};
        for (int i = 0; i < testData.length; i++) {
            SomeNumber sn = new SomeNumber(testData[i]);
            SomeNumber someNumberCopy = new SomeNumber(sn);
            sn.equals(sn);
            sn.equals(someNumberCopy);
            sn.equals(someNumberCopy);
            System.out.println(sn.getN());
            System.out.println(sn.isPositive());
        }

        System.out.println("Пустой конструктор");
        for (int i = 0; i < testData.length; i++) {
            SomeNumber sn = new SomeNumber();
            sn.setN(testData[i]);
            System.out.println(sn.getN());
            System.out.println(sn.isPositive());
        }


    }
}
