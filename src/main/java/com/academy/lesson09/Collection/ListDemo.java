package com.academy.lesson09.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Helen");
        names.add("Peter");
        names.add("Anna");

        System.out.println(names);

        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i)); //перебрать все имена в коллекции
        }

        System.out.println(names.contains("Peter"));//проверка содержания значения в коллекции

        Collections.sort(names); //сортировка в алфавитном порядке
        System.out.println(names);

        names.remove("Helen"); //удаление заданного значения
        System.out.println(names);

        //List из массива

         String [] brands = {"BMV", "Lexus", "Apple"};
         List<String> listBrands = new ArrayList<>(Arrays.asList(brands)); //превращение массива в коллекицю
        System.out.println(listBrands);

        String [] arrayFromList = listBrands.toArray(new String[0]); //превращение коллекции в массив
        System.out.println(Arrays.toString(arrayFromList));


    }
}
