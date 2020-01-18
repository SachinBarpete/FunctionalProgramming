package com.bridgelabz.lambda.unit1;

/***
 * @author Sachin Barpete
 * @purpose Closure Interface in lambda expression
 * @date 18/01/2020
 */
public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> System.out.println(i + b));
    }

    private static void doProcess(int i, Process p) {
        p.process(i);
    }

}

@FunctionalInterface
interface Process {
    void process(int i);
}
