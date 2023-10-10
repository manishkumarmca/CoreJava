package com.manish;

import java.util.ArrayList;
import java.util.List;

public class LamdaEx3 {

	public static void main(String[] args) {
		
		List<String> l= new ArrayList<String>();
		l.add("abc");
		l.add("def");
		l.add("ghi");
		
		
		 l.forEach(  
		   (n)-> System.out.println(n)
		        );  
	}

}
