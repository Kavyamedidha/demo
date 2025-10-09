package com.tnsif.multithreading;
 class MultiPriority extends Thread{
		public void run() {
			System.out.println("The running Thread:"+Thread.currentThread());
			System.out.println("The running Thread Priority:"+Thread.currentThread().getPriority());
			
		}

	}


