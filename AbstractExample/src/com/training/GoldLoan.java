package com.training;

public class GoldLoan extends AbstractLoan {
	
	public double weight;
	public double amount;
	public double totalAmount;
	

	public GoldLoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GoldLoan(Customer cust, double weight)
	{
		super();
		this.weight = weight;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double findEligibilty()
	{
		amount = 2000*weight;
		return amount;
	}


	@Override
	public double interest() {
		totalAmount = 0.024*amount;
		return totalAmount;
	}

}
