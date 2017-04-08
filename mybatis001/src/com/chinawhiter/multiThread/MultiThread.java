package com.chinawhiter.multiThread;

public class MultiThread{
	private int num = 100;
	public synchronized void print(String tags){
		try {
			if(tags.equals("a")){
				num = 100;
				System.out.println("tag a ="+tags+" num = "+num);
				Thread.sleep(1000);
			}else{
				num = 200;
				System.out.println("tag b = "+tags+" num ="+num);
				Thread.sleep(1000);
			}
			System.out.println("tag = "+tags+" num = "+num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		final MultiThread m1 = new MultiThread();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				m1.print("a");
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				m1.print("b");
			}
		});
		t1.start();
		t2.start();
	}

}
