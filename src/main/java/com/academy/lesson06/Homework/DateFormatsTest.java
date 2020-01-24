package com.academy.lesson06.Homework;

public class DateFormatsTest {

    public static void main(String[] args) {
        DateFormats one = new DateFormats(06, 12, 2016);
        DateFormats[] examples = new DateFormats[2];
        examples[0] = new RU(one);
        examples[1] = new USA(one);
        for (int i = 0; i < examples.length; i++) {
            examples[i].formatDate(); //вызвался общий метод для двух классов
        }


        DateFormats.Action act = (dateFormat) -> {
            dateFormat.setDay(0);
            dateFormat.setMonth(0);
            dateFormat.setYear(0);
            System.out.println(String.format("year %d ; month %d ; day %d", one.getYear(), one.getMonth(), one.getDay()));
        };
        act.fire(one);

        //or

        DateFormats two = new DateFormats(8, 10, 2014);
        two.addAction((dateFormat) -> {
            dateFormat.setDay(0);
            dateFormat.setMonth(0);
            dateFormat.setYear(0);
            System.out.println(String.format("year %d ; month %d ; day %d", one.getYear(), one.getMonth(), one.getDay()));
        });
        two.fireAction();

        //or

        DateFormats three = new DateFormats(7, 11, 2015);
        three.fireAction((dateFormat) -> {
            dateFormat.setDay(0);
            dateFormat.setMonth(0);
            dateFormat.setYear(0);
            System.out.println(String.format("year %d ; month %d ; day %d", one.getYear(), one.getMonth(), one.getDay()));
        });

    }

//    public static void toZero(DateFormats obj) {
//        obj.clearValues();
//        System.out.println(String.format("year %d ; month %d ; day %d", obj.getYear(), obj.getMonth(), obj.getDay()));
//    }

//    public  void toZero2(DateFormats obj) {
//        obj.clearValues();
//        System.out.println(String.format("year %d ; month %d ; day %d", obj.getYear(), obj.getMonth(), obj.getDay()));
//
//    }
}

//class Caller {
//    public void iniotMain() {
//        String[] args = new String[2];
//        DateFormatsTest.main(args);
//
//        DateFormatsTest dft = new DateFormatsTest();
//        DateFormats one = new DateFormats(06, 12, 2016);
//        dft.toZero2(one);
//    }
//}
