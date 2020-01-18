package com.bridgelabz.lambda.unit2;

import com.bridgelabz.lambda.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 30), new Person("John", "Smith", 35),
                new Person("Thomas", "Carlyle", 42), new Person("Metthew", "Bronte", 50),
                new Person("Lewis", "Carrol", 25));

        System.out.println("using for loop");
        for (int i = 0; i < people.size(); i++)
            System.out.println(people.get(i));

        System.out.println("\nusing enhanced for or for-in loop");
        for (Person p : people)
            System.out.println(p);

        System.out.println("\nUsing foreach loop");
        people.forEach(System.out::println);
    }
}
