package com.academy.lesson09.Map;

import com.academy.lesson06.Gender;
import com.academy.lesson06.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Helen", Gender.FEMALE);
        Person p2 = new Person(2L, "Peter", Gender.MALE);
        Person p3 = new Person(3L, "Anna", Gender.FEMALE);

        Map<Long, Person> persons = new HashMap<>();
        persons.put(p1.getId(), p1);
        persons.put(p2.getId(), p1);
        persons.put(p3.getId(), p1);

        System.out.println(persons);

        persons.remove(2L);
        System.out.println(persons);

        Set<Long> keys = persons.keySet();
        Collection<Person> personsAsList = persons.values();
        System.out.println(keys);
        System.out.println(personsAsList);

        

    }

}
