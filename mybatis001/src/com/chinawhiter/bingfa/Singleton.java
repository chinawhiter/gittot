package com.chinawhiter.bingfa;

public class Singleton {
	private static Singleton st = new Singleton();
	private Singleton(){
		
	}
	/**
	 * 你是我的情人呐
	 * */
	public static Singleton newInstance(){
		return st;
	}
	
}
