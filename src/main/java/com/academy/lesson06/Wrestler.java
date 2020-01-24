package com.academy.lesson06;

public class Wrestler extends Person implements AboutMore {
    public void doFight() {
        System.out.println("I fight");
    }

    public void about () {
        System.out.println("I am champion");
    }

    public void aboutMore () {
        System.out.println("I am champion and winner");
    }

}
