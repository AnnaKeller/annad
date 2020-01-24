package com.academy.lesson05;

public class PolymorphismFigures {
    public static void main(String[] args) {
        Figure [] figures = new Figure[2];
        figures[0] = new Circle(5, "red");
        figures[1] = new Square(1,"black");
        for (int i = 0; i < figures.length; i++){
            figures[i].draw(); //вызвался общий метод для двух классов
        }



    }
}
