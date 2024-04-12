package com.design.pattrens.abstractfactory;

import com.design.pattrens.factory.SubscriptionFactory;
import com.design.pattrens.factory2.PaymentMethodTypes;

public abstract class AbstractFactory {
	public abstract SubscriptionFactory getSubscriptionInstance(String subType);

	public abstract PaymentMethodTypes getPaymentTypeInstance(String payment);
}
