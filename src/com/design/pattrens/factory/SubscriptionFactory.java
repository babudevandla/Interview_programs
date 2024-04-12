package com.design.pattrens.factory;

public class SubscriptionFactory {

	public SubscriptionType getSubscriptionInstance(String subType) {
		if (subType == null) {
			return null;
		} else if (subType.equalsIgnoreCase("SILVER")) {
			return new Silver();
		} else if (subType.equalsIgnoreCase("GOLD")) {
			return new Gold();
		} else if (subType.equalsIgnoreCase("FAMILY")) {
			return new Family();
		}
		return null;
	}
}
