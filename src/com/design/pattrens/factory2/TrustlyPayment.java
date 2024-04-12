package com.design.pattrens.factory2;

public class TrustlyPayment extends PaymentMethodTypes {

	@Override
	String getPaymentType() {
		String type = "NetBank";
		return type;
	}

	@Override
	String getPaymentName() {
		return "Trustly";
	}

}
