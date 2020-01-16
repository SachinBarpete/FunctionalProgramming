package com.bridgelabz.lambda;

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
