package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java8Thread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});

		System.out.println("-------------------");

		Runnable task = () -> {
			System.out.println("runnable task");
		};

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(task);
		System.out.println("value - " + future.get()); // returns null if the task has finished successfully

		System.out.println("-------------------");
		
		Callable<String> task1 = () -> "task 1 ";
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		Future future1 = executorService1.submit(task1);
		System.out.println("value - " + future1.get()); // returns task1
	}

}
