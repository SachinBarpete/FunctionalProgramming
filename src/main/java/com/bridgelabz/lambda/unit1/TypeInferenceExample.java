package com.bridgelabz.lambda.unit1;

/***
 * @author Sachin Barpete
 * @purpose Type reference
 * @date 18/01/2020
 */
public class TypeInferenceExample {

	public static void main(String[] args) {

		printLambda(s -> s.length());
	}

	static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("hello Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
