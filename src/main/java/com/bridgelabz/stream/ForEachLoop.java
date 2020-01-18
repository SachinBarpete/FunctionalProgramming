package com.bridgelabz.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/***
 * @author Sachin Barpete
 * @purpose comparision between for, enhanced for and forEach loop
 * @date 18/01/2020
 */
public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        // External Iteration
        System.out.println("Using normal for loop");
        for (int i = 0; i < values.size(); i++)
            System.out.print(values.get(i) + " ");

        System.out.println("\nUsing Iterator");
        Iterator<Integer> value = values.iterator();
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }

        System.out.println("\nUsing enhanced for loop");
        for (Integer i : values)
            System.out.print(i + " ");

        // Internal Iteration
        System.out.println("\nUsing forEach loop");
        values.forEach(i -> System.out.print(i + " "));
    }
}
