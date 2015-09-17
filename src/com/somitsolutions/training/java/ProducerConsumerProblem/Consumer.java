package com.somitsolutions.training.java.ProducerConsumerProblem;


public class Consumer implements Runnable{
	private final ProducerConsumerQueue sharedQueue;
	private final int SIZE;
	
	public Consumer(ProducerConsumerQueue queue){
		sharedQueue = queue;
		this.SIZE = sharedQueue.getSIZE();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			try{
				int val = sharedQueue.consume();
				System.out.println("Consumed:" + val);
				Thread.sleep(50);	
			}
			catch (InterruptedException ex){	
			}
		}
	}

}
