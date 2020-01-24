package com.academy.lesson04;

public class Currency {
    private double value;
    private String name;

    public Currency() {
    } //пустой конструктор

    public Currency (double newValue, String newName) {
        this.value = newValue;
        this.name = newName; //конструктор с двумя параметрами
    }

    public Currency (Currency constructorParameter) {
        this.value = constructorParameter.getValue();
        this.name = constructorParameter.getName(); //конструктор копирования
    }

    public boolean isEqual(Currency isEqualParameter) {
        return this.value == isEqualParameter.getValue() && this.name.equals(isEqualParameter.getName());
    }


//    public void print(Currency obj2) {
//        System.out.println(String.format("%.2f", value) + name);
//        System.out.println(String.format("%.2f", obj2.getValue()) + obj2.getName());
//    }


    public void print () {
        System.out.print(String.format("%.2f", value) + name);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
