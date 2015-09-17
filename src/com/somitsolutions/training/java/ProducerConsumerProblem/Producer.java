package com.somitsolutions.training.java.ProducerConsumerProblem;


public class Producer implements Runnable{
	private final ProducerConsumerQueue sharedQueue;
	private final int SIZE;
	
	public Producer(ProducerConsumerQueue queue){
		sharedQueue = queue;
		this.SIZE = sharedQueue.getSIZE();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i<7; i++){
			System.out.println("Produced: " + i);
			try{
				sharedQueue.produce(i);
				Thread.sleep(100);
			}
			catch (InterruptedException ex){
				
			}
		}
	}
	
	

}
