package com.academy.lesson05;

import java.util.Objects;

public abstract class Figure {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw (){}

    public abstract double area (); //обязательный метод, абстрактный и без тела, потому что разный

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
