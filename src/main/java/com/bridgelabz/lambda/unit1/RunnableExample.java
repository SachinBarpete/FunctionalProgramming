package com.bridgelabz.lambda.unit1;
/***
 * @author Sachin Barpete
 * @purpose Runnable Interface uses in lambda expression
 * @date 18/01/2020
 */
public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("printed inside runnable");
			}
		});
		myThread.run();

		Thread myThreadLambda = new Thread(() -> System.out.println("printed inside lambda runnable"));
		myThreadLambda.run();
	}
}
