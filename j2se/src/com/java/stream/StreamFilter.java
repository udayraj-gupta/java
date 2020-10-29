package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamFilter {

	
	public static void main(String[] args) {
		List filteredData = getProducts().stream().filter((p)->p.getPrice()>2000).collect(Collectors.toList());
		//filteredData.forEach(System.out::println);
		
		List<Products> sortedList=getProducts().stream()
				.sorted(Comparator.comparingDouble(Products::getPrice).reversed()) //reverse to print in descending order
				.collect(Collectors.toList());
		AtomicInteger count = new AtomicInteger();
		final int [] i= {0};
		sortedList.forEach((a)->{
				System.out.println(count.getAndIncrement()+"Name : "+a.getPrice());
//				i[0]=i[0]+1;
		});
	}
	
	private static List<Products> getProducts(){
		
		List<Products> productList = new ArrayList<Products>();
		productList.add(new Products(1,"TV", 4000d));
		productList.add(new Products(2,"TV",2000d));
		productList.add(new Products(3,"TV",3000d));
		return productList;
	}
}
	class Products{
		private int id;
		private String name;
		private Double price;
		
		public Products(int id,String name, Double price) {
			super();
			this.id=id;
			this.name=name;
			this.price=price;
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Products [name=" + name + ", price=" + price + "]";
		}
		
		
		
	}

