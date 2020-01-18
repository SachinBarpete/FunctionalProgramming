package com.bridgelabz.lambda.unit1;

import java.util.function.BiConsumer;

/***
 * @author Sachin Barpete
 * @purpose Exception handling for Lambda expression
 * @date 18/01/2020
 */
public class ExceptionHandlingExample2 {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {

        for (int i : someNumbers)
            biConsumer.accept(i, key);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {

        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("An Arithmetic Exception happened: " + e);
            }
        };
    }
}
