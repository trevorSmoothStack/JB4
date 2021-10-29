package com.ss.jb4.as2;

public class Deadlock {

	public static void main(String args[]) {
		System.out.println("Deadlock begins.");
		String str1 = "I am";
		String str2 = "Yoda";
		
		Runnable r1 = new ThreadInterface();
		Thread t1 = new Thread(r1) {
			public void run() {
				try {
					synchronized (str1) {
						Thread.sleep(100);
						synchronized (str2) {
							System.out.println("First thread running.");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		
		Runnable myRunnable2 = new ThreadInterface();
		Thread t2 = new Thread(myRunnable2) {
			public void run() {
				try {
					synchronized (str2) {
						Thread.sleep(100);
						synchronized (str1) {
							System.out.println("Second thread running.");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.out.println("Deadlock ends.");
		
		
	
	}

}
