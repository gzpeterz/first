/**
 * 功能： 展示 如何启动一个线程
 */
package com.hc.thread;
import java.util.concurrent.*;

/**
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		/*
		Boy boy = new Boy();
		boy.start();
		*/
		/*
		Girl girl = new Girl();
		Thread t1 = new Thread(girl);
		Thread t2 = new Thread(girl);
		t1.start();
		t2.start();
		*/
		Three three = new Three();
		FutureTask<String> ft = new FutureTask<String>(three);
		Thread t = new Thread(ft);
		t.start();
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

class Three implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I love java " + Thread.currentThread().getName());
		}
		return "from the call";
	}
	
}

class Girl implements Runnable {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I love java " + Thread.currentThread().getName());
		}
	}
	
}

class Boy extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I love java ");
		}
	}
}
