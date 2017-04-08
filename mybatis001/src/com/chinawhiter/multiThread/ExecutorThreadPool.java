package com.chinawhiter.multiThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorThreadPool {
	
	public static void main(String[] args) {
		ThreadPoolExecutor pool = 
				new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, 
						new ArrayBlockingQueue<Runnable>(3));
		Thread1 t1 = new Thread1(1,"task1");
		Thread1 t2 = new Thread1(2,"task2");
		Thread1 t3 = new Thread1(3,"task3");
		Thread1 t4 = new Thread1(4,"task4");
		Thread1 t5 = new Thread1(5,"task5");
		Thread1 t6 = new Thread1(6,"task6");
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
//		pool.execute(t6);
	}
}
