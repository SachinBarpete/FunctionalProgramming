package com.bridgelabz.stream;

import java.util.Arrays;
import java.util.List;

/***
 * @author Sachin Barpete
 * @purpose See Lazy evaluation of the stream API
 * @date 18/01/2020
 */

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        int result = 0;
        for (int i : values)
            if (i % 5 == 0) {
                result = i * 2;
                break;
            }
        System.out.println(result);

        System.out.println(values.stream()
                .filter(StreamExample4::isDivisible)
                .map(StreamExample4::mapDouble)
                .findFirst()
                .orElse(0));
    }

    public static boolean isDivisible(int i) {
        System.out.println("in isDivisible: " + i);
        return i % 5 == 0;
    }

    public static int mapDouble(int i) {
        System.out.println("in mapDouble: " + i);
        return i * 2;
    }
}
