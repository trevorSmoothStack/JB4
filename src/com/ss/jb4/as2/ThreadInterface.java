package com.ss.jb4.as2;

public class ThreadInterface implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Running in thread implementing interface.");
	}
}
