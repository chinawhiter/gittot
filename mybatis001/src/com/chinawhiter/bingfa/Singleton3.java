package com.chinawhiter.bingfa;

public class Singleton3 {
	private static Singleton3 st = null;
	private Singleton3(){
		
	}
	public static Singleton3 newInstance(){
		if(st==null){
			synchronized(Singleton.class){
				if(st==null){
					st = new Singleton3();
				}
			}
		}
		return st;
	}
}
