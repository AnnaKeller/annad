package com.academy.lesson05.Homework05;

public class DateTimeExt extends DateTime {
    private int ms;

    public DateTimeExt(int day, int month, int year, int hour, int minute, int second, int ms) {
        super(day, month, year, hour, minute, second);
        this.ms = ms;
    }

    public DateTimeExt(DateTimeExt obj2) {
        super(obj2.getDay(), obj2.getMonth(), obj2.getYear(), obj2.getHour(), obj2.getMinute(), obj2.getSecond());
        //System.out.println("DateTimeExt(DateTimeExt obj2)");
        this.ms = obj2.getMs();
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public String getFormattedDate() {
        return super.getFormattedDate() + ":" + ms;
    }

}
