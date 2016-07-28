package com.training.exceptions;

public class RangeCheckException extends Exception {

	private long booknumber;

	public RangeCheckException(long booknumber) {
		super();
		this.booknumber = booknumber;
	}

	@Override
	public String getMessage() {
		
		return this.booknumber+" should be 1000-10000";
	}
	
}
