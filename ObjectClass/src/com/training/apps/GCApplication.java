package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk;
		try {
			bk = new Book(101,"A","B",20);
			System.out.println(bk.hashCode());
			bk = new Book(102,"P","Q",450);
			System.gc();
			System.out.println(bk);
			System.out.println(bk.hashCode());
			System.out.println("Look at the console for special message");
			System.out.println("Bye.......");
		
		} catch (RangeCheckException e) {
		System.err.println(e.getMessage());
		}
		
	}

}
