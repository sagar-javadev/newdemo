package com.example.demo.exception;

public class BadApiException extends RuntimeException{
	
	 public BadApiException(String message) {
	        super(message);
	    }
	    public BadApiException() {
	        super("Bad api Exception");
	    }

}
