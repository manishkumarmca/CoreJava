package com.manish;

public class LamedaThread {
	
	public static void main(String args[]) {
		
		/*
		 * Runnable r = new Runnable() { public void run() {
		 * System.out.println("Thread is running"); }
		 * 
		 * };
		 */
		
		//with Lameda 
		
		
		Runnable r=  ()->{			
			 
				System.out.print("Threa is running using lameda");
			
		};
		
		
		Thread t1 =new Thread(r);
		t1.start();
		
	}

}
