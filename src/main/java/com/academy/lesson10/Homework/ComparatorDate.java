package com.academy.lesson10.Homework;

import com.academy.lesson05.Homework05.Date;

import java.util.Comparator;

public class ComparatorDate implements Comparator<Date> {

    @Override
    public int compare(Date o1, Date o2) {
        if (o1.getYear() < o2.getYear()) { //11.03.97 12.03.95
            return -1;
        } else if (o1.getYear() > o2.getYear()) {
            return 1;
        } else {
            if (o1.getMonth() < o2.getMonth()) {
                return -1;
            } else if (o1.getMonth() > o2.getMonth()) {
                return 1;
            } else {
                if (o1.getDay() < o2.getDay()) {
                    return -1;
                } else if (o1.getDay() > o2.getDay()) {
                    return 1;
                }
            }
        }
        return 0;
    }


}
