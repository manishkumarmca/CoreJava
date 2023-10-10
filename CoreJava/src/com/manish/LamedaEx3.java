package com.manish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	 
	 
}


public class LamedaEx3 {

	public static void main(String[] args) {
		 
		
		List<Product> list= new ArrayList<Product>();
		list.add(new Product(1,"Hp", 200));
		list.add(new Product(2,"Dell",400));
		list.add(new Product(3,"Apple",300));
		
		
		//Sorting on the basis of name  and using lameda expression
		
		Collections.sort(list, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+""+p.price );
		
		}
		
		
	 
			
		}
		

	}


