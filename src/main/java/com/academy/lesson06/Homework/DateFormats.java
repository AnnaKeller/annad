package com.academy.lesson06.Homework;

public class DateFormats {
    private int day;
    private int month;
    private int year;

    public DateFormats(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    //    public String getDay() {
//        String numberAsString = Integer.toString(day);
//        return numberAsString; //как добавить ноль к дню в процессе добавления, а не выведения?
//    }

    public void setDay(int day) {
        if (day >= 0 && day < 32) {
            this.day = day;
        } else {
            System.out.println("Incorrect day value");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println("Incorrect month value");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0 && year < 3000) {
            this.year = year;
        } else {
            System.out.println("Incorrect year value");
        }
    }


    public void formatDate() {
        System.out.println(String.format("%d.%d.%d", getDay(), getMonth(), getYear()));
    }

    public void fireAction(Action act) {
        act.fire(this);
    }

    private Action action = null;

    public void fireAction() {
        if (action != null) {
            action.fire(this);
        }
    }

    public void addAction(Action act) {
        act.fire(this);
    }


    public interface Action {
        void fire(DateFormats df);
    }


}
