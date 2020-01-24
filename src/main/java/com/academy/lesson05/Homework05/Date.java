package com.academy.lesson05.Homework05;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }
    public Date(int day, int month, int year) {
        //System.out.println("Date(int day, int month, int year)");
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public Date(Date obj){
        //System.out.println("Date(Date obj)");
        this.day=obj.getDay();
        this.month=obj.getMonth();
        this.year=obj.getYear();
    }

    public void print (){
        System.out.println(getFormattedDate());
    }

    public String getFormattedDate() {
        String tempDay = Integer.toString(day);
        String tempMonth = Integer.toString(month);
//        if (day/10 <1) {
//            tempDay = "0" + tempDay;
//        }
//        if (month/10 <1) {
//            tempMonth = "0" + tempMonth;
//        }

        return tempDay + "." + tempMonth + "." + year;
    }

    public void set (int day, int month, int year) {
        if (day > 0 && day < 32 && month > 0 && month < 13 && year/1000 >= 1) {
        this.day=day;
        this.month=month;
        this.year=year;}
        else {
            System.out.println("Invalid values");
        }
    }

    public void set(Date date){
        this.day=date.getDay();
        this.month=date.getMonth();
        this.year=date.getYear();
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
