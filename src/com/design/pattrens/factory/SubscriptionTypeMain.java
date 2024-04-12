package com.design.pattrens.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubscriptionTypeMain {

	public static void main(String[] args) throws IOException {

		SubscriptionFactory factory = new SubscriptionFactory();
		System.out.print("Enter the name of subscription: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String subname = br.readLine();

		SubscriptionType instance = factory.getSubscriptionInstance(subname);
		
		if(instance instanceof Family) {
			System.out.print("Please enter profile count: ");
			Integer profile=Integer.parseInt(br.readLine());
			//System.out.println(profile);
			((Family) instance).setProfileCount(profile);
		}
		System.out.println("Name : "+instance.getName());
		System.out.println("Price : "+instance.getPrice()+"kr");
		System.out.println("Book limit price : "+instance.getBookLimitPrice());
	}

}
