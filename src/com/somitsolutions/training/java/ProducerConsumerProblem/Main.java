package com.somitsolutions.training.java.ProducerConsumerProblem;

public class Main {
	public static void main(String[] args){
		ProducerConsumerQueue sharedQueue = new ProducerConsumerQueue();
		Thread prodThread = new Thread(new Producer(sharedQueue), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue), "Consumer");
        prodThread.start();
        consThread.start();
	}
}
