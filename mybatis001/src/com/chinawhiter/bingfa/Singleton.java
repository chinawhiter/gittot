package com.chinawhiter.bingfa;

public class Singleton {
	private static Singleton st = new Singleton();
	private Singleton(){
		
	}
	public static Singleton newInstance(){
		return st;
	}
	
}
