package com.bridgelabz.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseUsingJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 30),
				new Person("John", "Smith", 35),
				new Person("Thomas", "Carlyle", 42),
				new Person("Metthew", "Bronte", 50),
				new Person("Lewis", "Carrol", 25)
				);

		// step1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		// step2: Print all elements in the list
		System.out.println("---- All persons in the list ----");
		printAll(people);

		// step3: Print All people that have last name beginning with C
		System.out.println("\n---- All persons with lastname beginning with C ----");
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
 
		// step3: Print All people that have first name beginning with C
		System.out.println("\n---- All persons with firstname beginning with C ----");
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people)
			if (condition.test(p))
				System.out.println(p);

	}

	private static void printAll(List<Person> people) {
		for (Person p : people)
			System.out.println(p);
	}

}

interface Condition {
	boolean test(Person p);
}
