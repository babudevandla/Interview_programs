package com.design.pattrens.factory;

public class Silver implements SubscriptionType {

	@Override
	public String getName() {
		String name="SILVER";
		return name;
	}

	@Override
	public double getPrice() {
		double price=139.0;
		return price;
	}

	@Override
	public double getBookLimitPrice() {
		double booklimitprice=139.0;
		return booklimitprice;
	}

}
