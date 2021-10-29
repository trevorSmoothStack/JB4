package com.ss.jb4.as1;

public class Singleton {
	
	volatile public static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		synchronized (instance) {
			if (instance==null) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
