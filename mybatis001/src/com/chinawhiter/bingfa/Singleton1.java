package com.chinawhiter.bingfa;

public class Singleton1 {
	private static Singleton1 st = null;
	private Singleton1(){
		
	}
	public static Singleton1 newInstance(){
		if(st==null){
			st = new Singleton1();
		}
		return st;
	}
}
