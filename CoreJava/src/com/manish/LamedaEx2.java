package com.manish;

interface Addable{
	public int add(int a, int b);
}

public class LamedaEx2 {

	public static void main(String[] args) {
		 
		
		Addable ad=(a,b)->(a+b); 
		 
		
		System.out.println(ad.add(10, 20));

	}

}
