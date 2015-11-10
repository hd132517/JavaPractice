package org.dimigo.thread;

public class runner2 implements Runnable{
	private String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "출발");
		
		for(int i=100; i>=0; i-=10) {
			System.out.println(name + i + "미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(name + "골인");	
	}
	
	public runner2(){}
	
	public runner2(String name) {
		super();
		this.name = name;
	}
	
}