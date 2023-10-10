package com.manish;

public class LamedaEx {

	public static void main(String arg[]) {
		
		int width=10;
		
		//without lameda expression  sayable implementation using annonomous class
		
		/*
		 * Sayable s = new Sayable() {
		 * 
		 * 
		 * public void draw() {
		 * 
		 * System.out.println(width);
		 * 
		 * }
		 * 
		 * 
		 * };
		 * 
		 * 
		 */
		
		
		//with Lameda expression 
		
		/*
		 * Sayable s = ()->{ System.out.println(width); }; s.say();
		 */
}
}

