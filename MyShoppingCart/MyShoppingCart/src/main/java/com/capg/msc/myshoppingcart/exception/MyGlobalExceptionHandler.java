package com.capg.msc.myshoppingcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyGlobalExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidCostInputByUser(InvalidCostRangeException ex)
	{
		int range1 = ex.getRange1();
		int range2 = ex.getRange2();
		
		MyExceptionResponse exResponse = new MyExceptionResponse();
		
		exResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		exResponse.setExceptionMsg("Invalid Cost Range "+range1+" and "+range2+",pls try again");
		
		
		return new ResponseEntity<MyExceptionResponse>(exResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidProductId(java.util.NoSuchElementException ex)
	{
		
		
		// design custom exception response 
		
		MyExceptionResponse excResponse = new MyExceptionResponse();
		excResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		excResponse.setExceptionMsg("Invalid Product Id pls try again");
		
		
		return new ResponseEntity<MyExceptionResponse>(excResponse,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidCategory(InvalidCategoryException ex)
	{
		String category=ex.getCategory();
		
		// design custom exception response 
		
		MyExceptionResponse excResponse = new MyExceptionResponse();
		excResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		excResponse.setExceptionMsg("Invalid category "+category+",pls try again");
		
		
		return new ResponseEntity<MyExceptionResponse>(excResponse,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidRating(InvalidRatingException ex)
	{
		int rating = ex.getRating();
		
		// design custom exception response 
		
		MyExceptionResponse excResponse = new MyExceptionResponse();
		excResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		excResponse.setExceptionMsg("Invalid rating "+rating+",pls try again");
		
		
		return new ResponseEntity<MyExceptionResponse>(excResponse,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidProductCost(InvalidProductException ex)
	{
		String category=ex.getCategory();
		int cost=ex.getCost();
		MyExceptionResponse response=new MyExceptionResponse();
		response.setHttpStatus(HttpStatus.NOT_ACCEPTABLE.value());
		response.setExceptionMsg("Product "+category+" cost "+cost+" does not meet the criteria");
		return new ResponseEntity<MyExceptionResponse>(response,HttpStatus.NOT_ACCEPTABLE);
		
	}
	
}
