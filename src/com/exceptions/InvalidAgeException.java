package com.exceptions;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String msg){
		super(msg);
	}
	public InvalidAgeException(String msg,Exception e){
		super(msg,e);
	}
}
