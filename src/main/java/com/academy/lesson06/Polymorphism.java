package com.academy.lesson06;

public class Polymorphism {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        Person person = new Person();
        person.setGender(Gender.MALE);//используя энам
        person.doCommonJob("washing");

        ITSpecialist isp = new ITSpecialist();
        isp.doTest();

        InterfaceTest person1 = new ITSpecialist();
        person1.about();

        Person person2 = new Wrestler();
        person2.doCommonJob("watching");

        Wrestler wrestler = new Wrestler();
        wrestler.doFight();

        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Wrestler();
        persons[2] = new ITSpecialist(); //массив людей класса персон

        for (int i = 0; i < persons.length; i++) {
            //persons[i].doCommonJob("bathing");
            persons[i].about();
        }

        ((ITSpecialist) persons[2]).doTest(); // приведение типа

        if (persons[2] instanceof ITSpecialist) {
            ((ITSpecialist) persons[2]).doTest();
        } else if (persons[2] instanceof Wrestler) {
            ((Wrestler) persons[2]).doFight();
        } else persons[2].doCommonJob("washing");

        int i = getRand();
        System.out.println(getRand() * 2);
        System.out.println(i * 2);

        InterfaceTest1 i1 = (n1, n2, n3) -> "" + n1 + n2 + n3;
        //InterfaceTest1 i2 = (a, b, c) -> Polymorphism.blahblah(a, b, c);
        InterfaceTest1 i3 = Polymorphism::blahblah;
        i3.concat(1, 2, 3);

        ITSpecialist per1 = new ITSpecialist();
        Wrestler per2 = new Wrestler();
        per1.aboutMore();
        per2.aboutMore();
        per1.about();

    }

    private static String blahblah(int n1, int n2, int n3) {
        String res = n3 + "" + n1 + n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(res);
        return res;
    }

    private static int getRand() {
        return 1;
    }

    public static String replace(String s) {
        return s.replace("a", "b");
    }
}



