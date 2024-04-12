package com.design.pattrens.factory2;

public class PaymentMethodFactory {

	public PaymentMethodTypes getPaymentTypeInstance(String payment) {
		PaymentMethodTypes obj=getInstance(payment);
		return obj;
	}

	private PaymentMethodTypes getInstance(String payment) {
		switch (payment) {
			case "Adyen":
				return new AdyenPayment();
			case "Trustly":
				return new TrustlyPayment();
			case "GiroPay":
				return new GiroPayment();
			case "Sofort":
				return new SofortPayment();
			case "Paypal":
				return new PaypalPayment();
			default:
				System.out.println("no match");
				
			return null;
		}
	}
}
