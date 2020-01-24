package com.academy.lesson06;

public class ITSpecialist extends Person implements AboutMore {
    public void doTest ( ){
        System.out.println("I test");
    }

    public void about () {
        System.out.println("I am tester");
    }

    public void aboutMore () {
        System.out.println("I am tester and QA");
    }
}
