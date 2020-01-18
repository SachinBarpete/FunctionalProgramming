package com.bridgelabz.stream;

import java.util.Arrays;
import java.util.List;
/***
 * @author Sachin Barpete
 * @purpose stream api functions filter, map and reduce
 * @date 18/01/2020
 */
public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        int result = 0;
        for (int i : values)
            if (i % 5 == 0) {
                result += i;
            }
        System.out.println(result);

        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, (c, e) -> c + e));

        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .map(i -> i * 2)
                .findFirst());
    }
}
