package com.InheritenceExamples;

public class Electronics  extends Product{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics obj = new Electronics();

		System.out.println("Product ID: " + obj.productId);
		System.out.println("Name: " + obj.name);
		System.out.println("Price: " + obj.price);
		System.out.println("Stock Quantity: " + obj.stockQuantity);
		System.out.println("Category: " + obj.category);

	}

}
