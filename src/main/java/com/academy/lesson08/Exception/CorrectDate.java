package com.academy.lesson08.Exception;

import com.academy.lesson05.Homework05.Date;

public class CorrectDate extends Date {
    public CorrectDate(int day, int month, int year) throws IllegalDateException {
        super(day, month, year);
        if (day <= 0 || day >= 32 || month <= 0 || month >= 13 || year/1000 < 1)
            throw new IllegalDateException();
    }

}
