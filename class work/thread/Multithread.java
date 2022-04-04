package com.test.thread;


	
	public class Multithread extends Thread{
		int max;
		
		public Multithread(int max) {
			super();
			this.max = max;
		}
		@Override
		public void run() {
			try {
			while(max>0) {
				if(max%2==0) {
					System.out.println(max);				
					Thread.sleep(1000);				
				}
			max--;
			}
			}catch(Exception e) {
				
			}
		}
		

		public static void main(String[] args) {
			Multithread exercise = new Multithread(10);
			exercise.start();
			Multithread exercise2 = new Multithread(20);
			exercise2.start();
		}
	}


