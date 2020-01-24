package com.academy.lesson05;

public class FigureTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Square square2 = new Square(5, "orange");
        double areaActual = square.area();
        double areaExpected = 25;
        if (areaActual == areaExpected)
            System.out.println("Test passed");
        else
            System.out.println("Test error");

        Circle circle = new Circle(3, "red");

        //testCircle();

        square.draw(); //метод наследника перекрывает метод родите
        System.out.println(square);
        System.out.println(square.equals(square2));

    }

//    private static void testCircle() {
//        Circle circle1 = new Circle(5);
//        double areaActual = circle1.area();
//        double areaExpected = Math.PI * 5 * 2;
//        System.out.println(areaActual == areaExpected);
//
//    }


}
