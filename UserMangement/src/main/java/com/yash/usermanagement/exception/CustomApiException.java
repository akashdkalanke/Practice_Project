package com.yash.usermanagement.exception;

public class CustomApiException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CustomApiException(){
		
	}
	
	public CustomApiException(String message){
		super(message);
	}
	
	public CustomApiException(Throwable cause){
		super(cause);
	}
	
	public CustomApiException(String message,Throwable cause){
		super(message, cause);
	}

}
