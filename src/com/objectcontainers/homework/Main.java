package com.objectcontainers.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ToDo test = new ToDo();

        System.out.println("-----Part1-----\n");

        List<Person> people = buildPeopleList();

        test.orderByNameAndAge(people);

        System.out.println("\n-----Part2-----");

        test.printHobbiesAndWhere(people);

    }

    private static List<Person> buildPeopleList() {
        List<Person> people = new ArrayList<>();

        people.add(new Employed("John", 24, "1234"));
        people.add(new Employed("Anne", 26, "2236"));
        people.add(new Unemployed("Bryan", 31, "1331"));
        people.add(new Student("Mary", 20, "2220"));
        people.add(new Unemployed("Chris", 25, "1335"));
        people.add(new Student("Sarah", 22, "2222"));
        return people;
    }
}
