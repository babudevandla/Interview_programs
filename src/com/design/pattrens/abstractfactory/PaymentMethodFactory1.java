package com.design.pattrens.abstractfactory;

import com.design.pattrens.factory.SubscriptionFactory;
import com.design.pattrens.factory2.PaymentMethodTypes;

public class PaymentMethodFactory1 extends AbstractFactory{

	@Override
	public SubscriptionFactory getSubscriptionInstance(String subType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMethodTypes getPaymentTypeInstance(String payment) {
		PaymentMethodTypes instance=getPaymentTypeInstance(payment); 
		return instance;
	}

}
