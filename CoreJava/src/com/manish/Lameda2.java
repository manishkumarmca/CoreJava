package com.manish;

interface Hello{
	public String show(String str);
	}


public class Lameda2 {

	public static void main(String[] args) {
		
		Hello h= (str) ->{
			return "hello " +str;
		};
		System.out.println(h.show("manish"));
	}
	
}