package com.chinawhiter.multiThread;

public class MyThread01 {
	public synchronized void print(){
		for(int i=0;i<1000;i++){
			System.out.println(i);
		}
	}
	public synchronized void println(){
		System.out.println("我是同步的方法");
	}
	public static void main(String[] args) {
		final MyThread01 m = new MyThread01();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				m.print();
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				m.println();
			}
			
		});
		t1.start();
		t2.start();
	}

}
