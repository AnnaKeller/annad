package com.academy.lesson10.Homework;

import com.academy.lesson05.Homework05.Date;

import java.util.ArrayList;
import java.util.List;

public class L10Ex01 {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(11,3,1997));
        dates.add(new Date(12,3,1995));
//        dates.add(new Date(8,7,2009));
//        dates.add(new Date(25,12,1993));

        System.out.println(dates);

        dates.sort(new ComparatorDate());
        System.out.println(dates);
        System.out.println(new ComparatorDate().compare(dates.get(0), dates.get(1)));
        System.out.println(new ComparatorDate().compare(dates.get(1), dates.get(0)));

    }
}
