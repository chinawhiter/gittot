package com.chinawhiter.bingfa;

public class Singleton2 {
	private Singleton2(){
		
	}
	private static class LazyHodler{
		private static Singleton2 st = new Singleton2();
	}
	public static final Singleton2 newInstance(){
		return LazyHodler.st;
	}
}
