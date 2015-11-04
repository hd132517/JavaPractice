package org.dimigo.thread;

public class race {
	public static void main(String[] args) {
		System.out.println("main thread start");

		Thread runner1 = new runner("남동현");
		Thread runner2 = new runner("북동현");

		runner1.start();
		runner2.start();

        System.out.println("main thread end");
    }
}