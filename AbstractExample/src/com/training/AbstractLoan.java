package com.training;

/**
 * 
 * @author rnyati
 *
 */

public abstract class AbstractLoan {
	
	private Customer cust;
	
	public AbstractLoan(Customer cust)
	{
		super();
		this.cust = cust;
	}
	
	public AbstractLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer getCustomer() {
	return cust;
	    
	}
	
	public abstract double findEligibilty();
	public abstract double interest();
	
}