package com.bridgelabz.lambda.unit2;

import com.bridgelabz.lambda.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 30), new Person("John", "Smith", 35),
                new Person("Thomas", "Carlyle", 42), new Person("Metthew", "Bronte", 50),
                new Person("Lewis", "Carrol", 25));

        // step2: Print all person in the list
        System.out.println("---- All persons in the list ----");
        performConditionally(people, p -> true, System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate,
                                             Consumer<Person> consumer) {
        for (Person p : people)
            if (predicate.test(p))
                consumer.accept(p);

    }
}
