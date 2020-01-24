package com.academy.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //прочитать 10 первых имен
        String inPath = "/Users/annadrevnyak/Desktop/temp/женские имена.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        String name = br.readLine();
        System.out.println(name);

        String name2 = br.readLine();
        System.out.println(name2);

        // читаем все мена до конца файла
        String nextName;
        while ((nextName = br.readLine())!=null) {
            System.out.println(nextName);
        }


    }
}
