package com.chinawhiter.bingfa;

public class ConnThreadLocal {
	public static ThreadLocal<String> th = new ThreadLocal<String>();

	public void getTh() {
		System.out.println(Thread.currentThread().getName()+":"+th.get());
	}

	public void setTh(String value) {
		th.set(value);
	}
	
	public static void main(String[] args) {
		final ConnThreadLocal conn = new ConnThreadLocal();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				conn.setTh("123");
				conn.getTh();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				conn.getTh();
			}
		});
		t2.start();
	}
}
