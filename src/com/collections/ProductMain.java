package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.pojos.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1=new Product(1,"sexy boody");
		Product p2=new Product(2,"gradiator");
		Product p3=new Product(3,"rattkungen");
		Product p4=new Product(4,"harriy");
		List<Product> list=Arrays.asList(p1,p2,p3,p4);
		list.stream().forEach(System.out::println);
		
		System.out.println("-------------------");
		Collections.sort(list);
		
		list.stream().forEach(System.out::println);
	}

}
