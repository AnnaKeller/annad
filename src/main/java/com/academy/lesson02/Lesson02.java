package com.academy.lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        double x=1.1;
        double y=3;
        double z=5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        double result= z-y-x;
        System.out.println(result);

        int m = Integer.MAX_VALUE;
        System.out.println(m+1); //выход за границу максимального значения - получается минимальное

        System.out.println(3 % 5); // остаток от деления

        //операторы сравнения и логические
        System.out.println("операторы сравнения и логические");
        int k1 = 20;
        int k2 = 30;
        System.out.println(k1==k2);
        System.out.println(k1!=k2);
        System.out.println(k1>k2);
        System.out.println(k1<k2);

        System.out.println(k1>1 && k1<30); //and
        System.out.println(k1>100 && k1<30); //and
        System.out.println(k1>1 || k1<20); //or
        System.out.println(k1>20 || k1<30); //or

        System.out.println(!(k1>1)); //двойное отрицание

        boolean isCorrectNumber = k1>20;
        System.out.println(isCorrectNumber); // вывод false or (!isCorrectNumber) - true

        String str1 = "1";
        String str2 = "2";
        System.out.println(str1+str2);
        System.out.println(str1 == str2); //операторы для строк

        System.out.println("Деление");
        int z1 = 5;
        int z2 = 2;
        double div = z1/z2;
        System.out.println(div); // если две переменные целые, то результат тоже будет целый - 2.0
        //нужно хотя бы одной переменной присвоить double

        double div2 = 5/2d; // при делении двух целых можно либо добавить d, либо указать 2.0 вместо 2
        System.out.println(div2);

        //упражнение
        System.out.println("вывести от 1 до 9 только нечетные");
        for ( int i = 1 ; i < 10 ; i+=2)
        {
            int sum = i;
           // {if (i % 2 == 0) или так
            //    continue;}
            System.out.println(i); //вывести от 1 до 9 только нечетные
        }

        //сумма от 1 до 9
        int sum = 0;
        for (int i = 1; i <=9; i++) {
            sum= sum + i;
            System.out.println(sum);
        }

        System.out.println("Массивы");
        String[] massive = new String[10];
        String[] words = {"A","B","Bye!","!"};
        words[0] = "Hello,"; //изменить A
        words[1] = "world!"; //изменить B
        System.out.println(words[2]); //вывести Bye
        for (int i=0; i<words.length; i++)
            System.out.print(words[i] + " "); //вывести все значения массива, с пробелами между значениями









    }//class
}//main
