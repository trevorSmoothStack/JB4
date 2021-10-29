package com.ss.jb4.as3;

import com.ss.jb4.as2.ThreadInterface;

public class PCThread extends PC {

	public static void main(String[] args) throws InterruptedException {

		final PC pc = new PC();

		Runnable r1 = new ThreadInterface();
		Thread t1 = new Thread(r1) {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable r2 = new ThreadInterface();
		Thread t2 = new Thread(r2) {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}
