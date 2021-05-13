package com.capg.msc.myshoppingcart.exception;

public class InvalidRatingException extends Exception{

	
	private int rating;

	public InvalidRatingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidRatingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidRatingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidRatingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidRatingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidRatingException(int rating) {
		super();
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
