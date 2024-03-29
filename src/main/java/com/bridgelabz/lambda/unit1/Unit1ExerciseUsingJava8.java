package com.bridgelabz.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/***
 * @author Sachin Barpete
 * @purpose Lambda expression in the place of Inner class
 * @date 18/01/2020
 */
public class Unit1ExerciseUsingJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 30),
                new Person("John", "Smith", 35),
                new Person("Thomas", "Carlyle", 42),
                new Person("Metthew", "Bronte", 50),
                new Person("Lewis", "Carrol", 25));

        // step1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // step2: Print all elements in the list
        System.out.println("---- All persons in the list ----");
        printConditionally(people, p -> true);

        // step3: Print All people that have last name beginning with C
        System.out.println("\n---- All persons with lastname beginning with C ----");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        // step3: Print All people that have first name beginning with C
        System.out.println("\n---- All persons with firstname beginning with C ----");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people)
            if (predicate.test(p))
                System.out.println(p);

    }

}
