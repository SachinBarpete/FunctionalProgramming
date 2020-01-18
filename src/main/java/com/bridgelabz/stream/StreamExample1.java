package com.bridgelabz.stream;

import com.bridgelabz.lambda.unit1.Person;

import java.util.Arrays;
import java.util.List;
/***
 * @author Sachin Barpete
 * @purpose forEach loop in stream api
 * @date 18/01/2020
 */
public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 30),
                new Person("John", "Smith", 35),
                new Person("Thomas", "Carlyle", 42),
                new Person("Metthew", "Bronte", 50),
                new Person("Lewis", "Carrol", 25));

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println("count : " + count);
    }
}
