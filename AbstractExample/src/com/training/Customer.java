package com.training;

public class Customer {

	private double customerId;
	private String customerName;
	private double phone;
	
	
	public Customer(double customerId, String customerName, double phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phone = phone;
	}
	
	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	
	
}
