package com.academy.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>(Arrays.asList("Anna", "Helen")); //альтернативный
        List<String> list = new ArrayList<>();
        list.add("anna");
        list.add("ашот");
        list.add("helen");
        list.add("peter");
        list.add("ivan");
        System.out.println(list);
        Collections.sort(firstToUpperCase(list)); //сортировка по алфавиту
        System.out.println(firstToUpperCase(list));


    }

    private static List<String> firstToUpperCase(List<String> list) {  //приведение первого символа каждого элемента
        // в верхний регистр
        for (int i = 0; i<list.size(); i++){
            String s = list.get(i);
            String firstChar = String.valueOf(s.charAt(0));
            String upperFirst = firstChar.toUpperCase();
            s = s.replaceFirst(firstChar, upperFirst); //если использовать не replace без first, то меняет все одинаковые литеры
            list.set(i, s);
        }
        return list;
    }
}
