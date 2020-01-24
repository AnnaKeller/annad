package com.academy.lesson09.HomeWork;

public class GenArray <T> {

    T[] array;

    public GenArray(T[] array) {
    }

    public T get(int index) {
        return array[index];
    }
    public void set(int index, T element) {
        this.array[index] = element;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }



    public static void main(String[] args) {

        GenArray<Integer> newArray = new GenArray<>(new Integer[0]);
        newArray.set(1, 12);

        System.out.println(newArray);


    }

}
