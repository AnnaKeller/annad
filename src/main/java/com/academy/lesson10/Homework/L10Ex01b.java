package com.academy.lesson10.Homework;


import com.academy.lesson05.Homework05.Date;

import java.util.ArrayList;
import java.util.List;

public class L10Ex01b {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(11, 1, 1997));
        dates.add(new Date(12, 2, 1995));
        dates.add(new Date(12, 3, 1995));
        dates.add(new Date(12, 4, 1995));
        dates.add(new Date(12, 5, 1995));
        dates.add(new Date(12, 6, 1995));
        dates.add(new Date(12, 7, 1995));

        // System.out.println(dates);

        for (int i = 0; i < dates.size(); i++) {
            boolean a = dates.get(i).getMonth() == 1 || dates.get(i).getMonth() == 2 || dates.get(i).getMonth() == 3;
            if (!a) {
                System.out.println(String.format("SIZE: %s, i: %d, dates: %s", dates.size(), i, dates));
                dates.remove(i);
                i -= 1;
                System.out.println(String.format("SIZE: %s, i: %d, dates: %s", dates.size(), i, dates));
            }
        }
        System.out.println(dates);
    }
}
