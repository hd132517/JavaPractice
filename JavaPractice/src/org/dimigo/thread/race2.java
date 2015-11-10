package org.dimigo.thread;

public class race2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		
		Thread t1 = new runner("남동현");
		Thread t2 = new runner("북동현");
	
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}