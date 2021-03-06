package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args)
	{
		try{
		
		Book bk = new Book(101,"Head First Java ","Kathy Sierra", 4500.00);
		
		Book bk2;
		bk2 = new Book(102,"Head Second Java ","Kat Sierra", 4600.00);
		Book bk3 = new Book(102,"Head Second Java ","Kat Sierra", 4600.00);
		System.out.println(bk2.equals(bk3));
		System.out.println("Book 2 : "+bk2.hashCode());
		System.out.println("Book 3 : "+bk3.hashCode());

		String s = new String("Hari");
		System.out.println("comapring objects of different classes" + s.equals(bk2));
		Book bk4 = null;
		
		System.out.println("comapring null objects" + bk3.equals(bk4));
		
		Book bk5 = bk;
		System.out.println("Checking Identity: "+bk5.equals(bk));
	}
	

	 catch (RangeCheckException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
}
