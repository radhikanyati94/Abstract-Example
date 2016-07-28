package com.training;

public class LandLoan extends AbstractLoan {
	public double landValue;
	public double value;
	public double totalAmount;
	
	public LandLoan(Customer cust, double landValue) {
		super();
		this.landValue = landValue;
	}

	@Override
	public double findEligibilty() {
		value = 0.2*landValue;
		return value;
	}

	public double getLandValue() {
		return landValue;
	}

	public void setLandValue(double landValue) {
		this.landValue = landValue;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public double interest() {
		totalAmount = 0.029*value;
		return totalAmount;
	}

}
