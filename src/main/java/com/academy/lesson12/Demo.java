package com.academy.lesson12;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(Integer.parseInt(String.valueOf(38050) + String.valueOf(1000000 + random.nextInt(9999999))));
    }
}
