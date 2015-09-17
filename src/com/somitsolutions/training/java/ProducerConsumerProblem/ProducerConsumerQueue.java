package com.somitsolutions.training.java.ProducerConsumerProblem;

import java.util.Vector;

public class ProducerConsumerQueue {
	Vector<Integer> sharedQueue = new Vector<Integer>();
	private final int SIZE = 4;
	
	public ProducerConsumerQueue(){
	}
	
	public int getSIZE(){
		return SIZE;
	}
	
	public synchronized void produce(int i) throws InterruptedException{
		while(sharedQueue.size() == SIZE){
			System.out.println("Queue is full" + Thread.currentThread() + "is waiting, size = " + sharedQueue.size());
			wait();
		}
		sharedQueue.add(i);
		notifyAll();
	}
	
	public synchronized int consume() throws InterruptedException{
		while(sharedQueue.isEmpty()){
			
				System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
				wait();
			}
		int retVal = sharedQueue.remove(0);
		notifyAll();
		return retVal;
	}
}
