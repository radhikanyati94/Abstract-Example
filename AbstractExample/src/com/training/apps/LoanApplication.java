package com.training.apps;
import com.training.*;

public class LoanApplication {

	public static void printDetails(AbstractLoan loan)
	{
		System.out.println(loan.getCustomer());
		if(loan instanceof GoldLoan)
		{
			GoldLoan obj =(GoldLoan)loan;
			System.out.println("Gold Weight:" +obj.getWeight());
		}
		
		else if(loan instanceof LandLoan)
		{
			LandLoan obj = (LandLoan)loan;
			System.out.println("Land Value:" +obj.getLandValue());
		}
		
		System.out.println("Eligibilty: "+loan.findEligibilty());
		System.out.println("Interest for 1 year: "+loan.interest());
	}
	
	public static void main(String[] args)
	{
		Customer cust = new Customer(1010,"Ram",678990655);
		GoldLoan loan1 = new GoldLoan(cust,40);
		LandLoan loan2 = new LandLoan(cust,200000);
		printDetails(loan1);
		printDetails(loan2);
	}
}
