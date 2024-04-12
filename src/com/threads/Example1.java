package com.threads;

import java.util.concurrent.TimeUnit;

public class Example1 {

	public static void main(String[] args) {
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		Thread t1 = new Thread(task);
		t1.start();

		System.out.println("Done!");
		
		System.out.println("-----------------\n");
		
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread t2 = new Thread(runnable);
		t2.start();
	}
}
