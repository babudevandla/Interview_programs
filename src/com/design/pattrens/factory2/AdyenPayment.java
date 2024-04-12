package com.design.pattrens.factory2;

public class AdyenPayment extends PaymentMethodTypes {

	@Override
	public String getPaymentType() {
		String type="Card";
		return type;
	}

	@Override
	String getPaymentName() {
		return "Adyen";
	}

}
