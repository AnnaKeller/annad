package com.academy.lesson05;

import java.util.Objects;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private int r;



    public Circle() {

    }

    public Circle(int r, String color) {
        super.color = color;
       // this.color = color;
        this.r = r;
    }

    public Circle(String color, int r, String color1) {
        super(color);
        this.r = r;
        this.color = color1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    public double area() {
        return PI * r * 2;
    }
    public void draw (){
        System.out.println(String.format("Circle with r=%d, color=%s", r, color));
    }


    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
//        if (!super.equals(o)) return false;
//        Circle circle = (Circle) o;
//        return r == circle.r;
        Circle other = (Circle) o;
        return this.r  == other.r && this.color.equalsIgnoreCase(other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }
}
