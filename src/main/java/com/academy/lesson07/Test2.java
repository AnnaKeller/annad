package com.academy.lesson07;

public class Test2 {
    public static void main(String[] args) {
        DateHomework obj = new DateHomework(12,02,13);
        InterfaceForDate work = (DateHomework) -> {
            DateHomework.setHour(0);
            DateHomework.setMinute(0);
            DateHomework.setSecond(0);
            System.out.println(String.format("year %d ; month %d ; day %d", DateHomework.getHour(), DateHomework.getMinute(), DateHomework.getSecond()));
        };

        work.toZero(obj);


    }
}
