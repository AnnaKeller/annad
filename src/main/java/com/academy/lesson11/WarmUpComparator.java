package com.academy.lesson11;

import com.academy.lesson05.Homework05.Date;

import java.util.Comparator;

public class WarmUpComparator implements Comparator<Date> {

    @Override
    public int compare(Date o1, Date o2) {
        if (o1.getYear() > o2.getYear()) {
            return -1;
        } else if (o1.getYear() < o2.getYear()) {
            return 1;
        } else  {
            if (o1.getMonth() < o2.getMonth()) {
                return -1;
            } else if (o1.getMonth() > o2.getMonth()) {
                return 1;
            } else  {
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
