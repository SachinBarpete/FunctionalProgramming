package com.bridgelabz.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.lang.System.*;
/***
 * @author Sachin Barpete
 * @purpose stream api functions filter, map and reduce and method reference
 * @date 18/01/2020
 */
public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        // one Way
        Function<Integer, Integer> function = i -> i * 2;
        BinaryOperator<Integer> binaryOperator = (c, e) -> c + e;
        Stream stream = values.stream();
        Stream stream1 = stream.map(function);
        Integer result = (Integer) stream1.reduce(0, binaryOperator);
        out.println(result);
        // another way
        out.println(values.stream().map(i -> i * 2).reduce(0, Integer::sum));
    }
}
