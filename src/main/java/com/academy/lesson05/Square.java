package com.academy.lesson05;

import java.util.Objects;

public class Square extends Figure {
    private double side;
    private String color;

    public Square() {

    }
    public Square(double side) {
        // вызов конструктора базового класса "Figure"
        //вызов должен быть первый
        super("black"); //задаем значение в Square - используя констуктор в Sq
        this.side = side;
    }

    public Square(double side, String color) {
        super(color); //задаем значение в супер - используя конструктор в супер
        this.side = side;
       this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void draw (){
        System.out.println(String.format("Square with size=%.2f, color=%s", side, color));
    }

    public double area (){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}'; //перекрыть способ выведения
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square other = (Square)o;
        return this.side  == other.side && this.color.equalsIgnoreCase(other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
