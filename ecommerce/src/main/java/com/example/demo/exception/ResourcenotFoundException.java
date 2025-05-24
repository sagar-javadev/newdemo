package com.example.demo.exception;

public class ResourcenotFoundException extends RuntimeException{

	
	String resourceName;
    String fieldName;
    long fieldValue;
    public ResourcenotFoundException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
