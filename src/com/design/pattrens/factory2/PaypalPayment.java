package com.design.pattrens.factory2;

public class PaypalPayment extends PaymentMethodTypes{

	@Override
	String getPaymentType() {
		String type="Wallet";
		return type;
	}

	@Override
	String getPaymentName() {
		return "Paypal";
	}
}
