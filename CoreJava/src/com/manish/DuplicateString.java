package com.manish;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
	
	public static void main(String args[]) {
		
		String  s[]={"Mnaish", "mansib","kumar","kumar"};
		/*int count=0;
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1;j<s.length;j++) {
				
			if(s[i].equals(s[j])) {
				count++;
				
				  System.out.println(s[i]);
				  System.out.println(count);*/
		
		 
		 
		
		Set<String > store = new HashSet<>();
		for(String name : s) {
			if(store.add(name)==false) {
				System.out.println("Found duplicate element in array     "  +name);
				 		
			}
			
			
	}

}}
