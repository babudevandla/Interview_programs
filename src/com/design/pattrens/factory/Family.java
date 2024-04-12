package com.design.pattrens.factory;

public class Family implements SubscriptionType {

	private Integer profileCount;

	public Family() {
	}
	Family(Integer profileCount) {
		this.profileCount = profileCount;
	}

	@Override
	public String getName() {
		String name = "FAMILY";
		return name;
	}

	@Override
	public double getPrice() {
		double price =getFamilySubPrice(profileCount);
		return price;
	}

	private double getFamilySubPrice(Integer pc) {
		switch (pc) {
		case 2: return 199.0;
		case 3: return 239.0;
		case 4: return 279.0;
		default:
			break;
		}
		return 0;
	}

	@Override
	public double getBookLimitPrice() {
		double booklimitprice = 279.0;
		return booklimitprice;
	}

	public Integer getProfileCount() {
		return profileCount;
	}

	public void setProfileCount(Integer profileCount) {
		this.profileCount = profileCount;
	}

	
}
