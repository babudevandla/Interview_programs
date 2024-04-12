package com.design.pattrens.factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaymentMethodMail {

	public static void main(String[] args) throws IOException {

		PaymentMethodFactory factory = new PaymentMethodFactory();
		System.out.print("Enter the name of payment method: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String payMehtod = br.readLine();

		PaymentMethodTypes instance = factory.getPaymentTypeInstance(payMehtod);
		System.out.println(instance.getPaymentType());

	}

}
