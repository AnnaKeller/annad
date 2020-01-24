package com.academy.lesson08.Exception;

public class AppMain {
    public static void main(String[] args) {

        try {
            CorrectDate date1 = new CorrectDate(3,11,2015);
            System.out.println(date1.getFormattedDate());
            CorrectDate date2 = new CorrectDate(23, 1, 60);
            System.out.println(date2.getFormattedDate());
        }
        catch (Exception e) {
            e.printStackTrace();
        }





    }
}

