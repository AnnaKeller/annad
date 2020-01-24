package com.academy.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String inPath = "/Users/annadrevnyak/Desktop/temp/женские имена.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));


        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int nextInt = 10 + random.nextInt(40);
            System.out.println(nextInt);
            if (random.nextBoolean())
                System.out.println("Мужчина");
            else
                System.out.println("Женщина");
        }
    }
}
