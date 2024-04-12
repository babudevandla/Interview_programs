package com.design.pattrens.abstractfactory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Subscription")) {
			return new SubscriptionFactory1();
		} else if (choice.equalsIgnoreCase("Payment")) {
			return new PaymentMethodFactory1();
		}
		return null;

	}
}
