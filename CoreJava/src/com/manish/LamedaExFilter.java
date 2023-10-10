package com.manish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product1{
	
	int id;
	String name;
	int price;
	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LamedaExFilter {

	public static void main(String[] args) {
		 
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Hp",5000));
		list.add(new Product(2,"dell",4000));
		list .add(new Product(3,"apple",300000));
		
		
		
		//using lamda to filter data
		
		Stream<Product> data= list.stream().filter(p->p.price<5000);
		
		//using lameda to iterate through collection
		
		data.forEach(
				product->System.out.println(product.name+ ""+ product.price));
		

	}

}
