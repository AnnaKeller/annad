package com.academy.lesson05.Homework05;

import java.util.Scanner;

public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime() {

    }

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        //System.out.println("DateTime(int day, int month, int year, int hour, int minute, int second)");

        setHour(hour);
        this.minute = minute;
        this.second = second;
    }

    public DateTime(DateTime obj2) {
        super(obj2.getDay(), obj2.getMonth(), obj2.getYear()); //obj2.day, obj2.month, obj2.year
        //System.out.println(" DateTime(DateTime obj2)");
        this.hour = obj2.getHour();
        this.minute = obj2.getMinute();
        this.second = obj2.getSecond();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > -1 && hour < 25) {
            this.hour = hour;
        }
        else {
            System.out.println("Invalid hour");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public String getFormattedDate() {
        String tempHour = Integer.toString(hour);
        String tempMinute = Integer.toString(minute);
        String tempSecond = Integer.toString(second);
        if (hour/10 <1) {
            tempHour = "0" + tempHour;
        }
        if (minute/10 <1) {
            tempMinute = "0" + tempMinute;
        }
        if (second/10 <1) {
            tempSecond = "0" + tempSecond;
        }

        return super.getFormattedDate() + " " + tempHour + ":" + tempMinute + ":" + tempSecond;
    }

    public void convertTo24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is time am or pm?");
        String time = scanner.nextLine();

        int timeFormat12 = 13;

            if (time.equals("am")) {
                System.out.println(getFormattedDate());
            }
            if (time.equals("pm")) {

            for(int i = 1;  i < hour;  i++) {
                timeFormat12 += 1;
            }
            setHour(timeFormat12);
            System.out.println(getFormattedDate());
        }
    }
    public void convertTo12() {
        int timeFormat24 = 1;
        if (hour <= 12) {
            System.out.println(getFormattedDate() + " a.m.");
        }
        if (hour > 12) {
            for(int i = 13;  i < hour;  i++) {
                timeFormat24 += 1;
            }
            setHour(timeFormat24);
            System.out.println(getFormattedDate() + " p.m.");
        }
    }


}
