package com.chinawhiter.bingfa;

public class Singleton {
	private static Singleton st = new Singleton();
	private Singleton(){
		
	}
	/**
	 * �����ҵ�������
	 * */
	public static Singleton newInstance(){
		return st;
	}
	
}
