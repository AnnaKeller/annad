package com.academy.lesson06;

public class Person implements InterfaceTest{
    private long id;
    private String first_name;
    private String last_name;
    private Gender gender; //enum Gender
    private int age;

    public Person(String first_name, String last_name, Gender gender, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
    }

    public Person(long id, String first_name, Gender gender) {
        this.id = id;
        this.first_name = first_name;
        this.gender = gender;
    }

    public Person() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void doCommonJob(String typeOfJob) {
        System.out.println("I do " + typeOfJob);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void about() {
        System.out.println("I am human");
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
