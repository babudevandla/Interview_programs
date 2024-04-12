package com.design.pattrens.factory2;

public class SofortPayment extends PaymentMethodTypes{

	@Override
	String getPaymentType() {
		String type="NetBank";
		return type;
	}

	@Override
	String getPaymentName() {
		return "Sofort";
	}
}
