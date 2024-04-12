package com.design.pattrens.factory2;

public class GiroPayment extends PaymentMethodTypes{

	@Override
	String getPaymentType() {
		String type="NetBank";
		return type;
	}

	@Override
	String getPaymentName() {
		return "Giro";
	}
}
