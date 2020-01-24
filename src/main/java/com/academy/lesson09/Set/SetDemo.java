package com.academy.lesson09.Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(2);
        set.add(2);
        set.add(2); //выводит уникальные
        set.add(-40);
        set.add(450);
        set.add(89);
        System.out.println(set);

        List<Integer> expectedData = new ArrayList<>();
        expectedData.add(12);
        expectedData.add(60);
        expectedData.add(2);

        List<Integer> actualData = new ArrayList<>();
        actualData.add(2);
        actualData.add(60);
        actualData.add(12);

        System.out.println(actualData.equals(expectedData)); //false если порядок разный

        Set<Integer> actualSet = new HashSet<>(actualData);
        Set<Integer> expectedSet = new HashSet<>(expectedData); //удаляем дубликаты и сортируем
        System.out.println(actualSet.equals(expectedSet)); //true, но работает не корректно, если есть дубликаты

    }
}
