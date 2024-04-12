package com.design.pattrens.abstractfactory;

import com.design.pattrens.factory.SubscriptionFactory;
import com.design.pattrens.factory2.PaymentMethodTypes;

public class SubscriptionFactory1 extends AbstractFactory{

	@Override
	public SubscriptionFactory getSubscriptionInstance(String subType) {
		SubscriptionFactory instance=getSubscriptionInstance(subType);
		return instance;
	}

	@Override
	public PaymentMethodTypes getPaymentTypeInstance(String payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
