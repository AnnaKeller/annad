package com.academy.lesson11;

import com.academy.lesson05.Homework05.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WarmUp {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(01, 01, 2019));
        dates.add(new Date(01, 01, 2017));
        dates.add(new Date(01, 02, 2018));
        dates.add(new Date(01, 01, 2018));

        dates.stream()
                .peek(d -> d.setDay(12))
                .filter(date -> date.getYear() == 2018) //фильтрует по году
                .map(d -> d.getDay() + "." + d.getMonth() + "." + d.getYear() + "н.э.") //изменяет все элементы
                .forEach(System.out::println);

        long count = Arrays.stream(new String [] {"one","two","three", "two"})
                .filter(s -> s.equals("two"))
                .count(); //считает кол-во повторений


        List<String> newList = Arrays.stream(new String [] {"one","two","three", "two"})
                .map(String::toUpperCase)
                .collect(Collectors.toList()); //результат сохраняется в новый лист

        System.out.println(newList);




    }
}
