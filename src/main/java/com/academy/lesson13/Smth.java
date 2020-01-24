package com.academy.lesson13;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Smth {
    public static void main(String[] args) throws IOException {
        String file = "/Users/annadrevnyak/Maven/data/automationpractice-auth-data.csv";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> data = new ArrayList<>();
        String line = br.readLine();
        while (line != null) {
            data.add(line);
            line = br.readLine();
        }

        for (int i = 0; i < data.size(); i++) {
            String test = data.get(i);
            String[] result = test.split(",");
            System.out.println(result[0]);
            System.out.println(result[1]);
            System.out.println(result[2]);
            System.out.println("-------------------------------");
        }



    }

}
