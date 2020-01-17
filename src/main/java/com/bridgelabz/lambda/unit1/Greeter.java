package com.bridgelabz.lambda.unit1;

public class Greeter {

	public static void main(String[] args) {

		Greeting innerClassGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("hello user!");
			}
		};

		Greeting lambdaGreeting = () -> System.out.println("hello user!");

		Greeter.greet(lambdaGreeting);
		Greeter.greet(innerClassGreeting);
	}

	private static void greet(Greeting greeting) {
		greeting.perform();
	}

}

@FunctionalInterface
interface Greeting {
	void perform();
}
