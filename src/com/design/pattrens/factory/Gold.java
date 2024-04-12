package com.design.pattrens.factory;

public class Gold implements SubscriptionType{

	@Override
	public String getName() {
		String name="GOLD";
		return name;
	}

	@Override
	public double getPrice() {
		double price=169.0;
		return price;
	}

	@Override
	public double getBookLimitPrice() {
		double booklimitprice=169.0;
		return booklimitprice;
	}
}
