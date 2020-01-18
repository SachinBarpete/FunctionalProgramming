package com.bridgelabz.lambda.unit1;
/***
 * @author Sachin Barpete
 * @date 18/01/2020
 */
public class ThisReferenceExample {
    public void doprocess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doprocess(10, i -> {
            System.out.println("Value of i = " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.execute();
    }

    public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }
}
