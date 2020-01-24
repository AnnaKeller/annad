package com.academy.lesson11;

import java.awt.*;
import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        String inPath = "/Users/annadrevnyak/Desktop/temp/женские имена.txt";
        String outPath = "/Users/annadrevnyak/Desktop/temp/женские имена new.txt";
        String newOutPath = "/Users/annadrevnyak/Desktop/temp/женские имена stream.txt";


        BufferedReader br = new BufferedReader(new FileReader(inPath));
        br.lines() //возвраещает стрим
        .limit(10)
        .forEach(System.out::println); //первые 10 имен

//        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
//        String nextName;
//        while ((nextName = br.readLine())!=null) {
//            //запишем в другой файл
//           pw.println(nextName);
//            System.out.println(pw);
//        } //скопировать все данные в другой файл с помощью цикла

        PrintWriter pw = new PrintWriter(new FileWriter(newOutPath));
        br.lines()
                .limit(10)
                .peek(pw::println)
                .forEach(System.out::println); //вывести 10 первых имен в другой файл с помощью стрима


        br.close();
        pw.close();


    }

}
